package aula4.pratica1.dakar;

/*
2. Modele a classe Corrida que possui os seguintes atributos:
● distancia
● premioEmDolares
● nome
● quantidadeVeiculosPermitidos
● listaVeiculos
 */
/*
4. Uma corrida também tem um conjunto de veículos que participarão dela. Portanto,
agora a corrida terá a responsabilidade de poder adicionar um veículo à corrida,
portanto devemos definir os seguintes métodos:
public void registrarCarro(velocidade, aceleracao, anguloDeGiro, patente);
public void registrarMoto(velocidade, aceleracao, anguloDeGiro, patente);

Ambos os métodos adicionam um veículo, desde que haja espaço.
 */
/*
5. Teremos também a possibilidade de eliminar um veículo usando dois métodos:
public void removerVeiculoo(veiculo);
public void removerVeiculoPorPlaca(String placa);
 */
/*
6. Queremos ser capazes de definir o vencedor de uma corrida:
O vencedor será aquele com o valor máximo determinado pela seguinte fórmula:
velocidade * aceleracao / ( anguloDeGiro * (peso - quantidadeDeRodas * 100)
 */
/*
c) Adicione um salva-vidas de carro e um de moto à classe de corrida:
b) Adicione a responsabilidade de ajudar uma motocicleta e um carro:
public void socorrerCarro(String documento);
public void socorrerMoto(String documento);
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Corrida {
    private final double distancia;
    private final BigDecimal premioEmDolares;
    private final String nome;
    private final int quantidadeVeiculosPermitidos;
    private final List<Veiculo> listaVeiculos;
    private final SocorristaCarro socorristaCarro;
    private final SocorristaMoto socorristaMoto;

    public Corrida(double distancia, BigDecimal premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<>();
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
    }

    //adiciona um veículo, desde que haja espaço.
    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) throws ExceededVehiclesexception {
        if (listaVeiculos.size() < quantidadeVeiculosPermitidos)
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        else
            throw new ExceededVehiclesexception(placa);
    }

    //adiciona um veículo, desde que haja espaço.
    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa) throws ExceededVehiclesexception {
        if (listaVeiculos.size() < quantidadeVeiculosPermitidos)
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        else
            throw new ExceededVehiclesexception(placa);
    }

    /*
    public void removerVeiculoo(Veiculo veiculo){
        if(listaVeiculos.remove(veiculo)){
            System.out.println("Veiculo de placa "+ veiculo.getPlaca() + " foi removido.");
        } else {
            System.out.println("Veiculo não presente na corrida");
        }
    }
     */

    public void removerVeiculoPorPlaca(String placa){
        for(Veiculo veiculo: listaVeiculos){
            if (veiculo.getPlaca().equals(placa)){
                listaVeiculos.remove(veiculo);
                System.out.println("Veiculo de placa " + veiculo.getPlaca() + " foi removido.");
                return;
            }
        }
        System.out.println("Veiculo não presente na corrida");
    }

    public void socorrerCarro(String placa){
        for(Veiculo veiculo: listaVeiculos){
            if(veiculo.getPlaca().equals(placa) && (veiculo instanceof Carro)){
                socorristaCarro.socorrer(veiculo);
                return;
            }
        }
        System.out.println("Veiculo não presente na corrida");
    }

    public void socorrerMoto(String placa){
        for(Veiculo veiculo: listaVeiculos){
            if(veiculo.getPlaca().equals(placa) && (veiculo instanceof Moto)){
                socorristaMoto.socorrer(veiculo);
                return;
            }
        }
        System.out.println("Veiculo não presente na corrida");
    }

    public void verificarVencedor(){
        String placaVencedor="";
        double maiorValor = 0;
        for (Veiculo veic : listaVeiculos) {
            double calculo = veic.getVelocidade() * veic.getAceleracao() /
                    (veic.getAnguloDeGiro()) * ( veic.getPeso() - veic.getRodas() * 100);
            if (calculo > maiorValor ){
                placaVencedor = veic.getPlaca();
                maiorValor = calculo;
            }
        }
        System.out.println("\nApós correr " + distancia + "Km, o veiculo vencedor da corrida " + nome + " e do premio de US$ " + NumberFormat.getCurrencyInstance().format(premioEmDolares) + ", com o indice vencedor de: " + maiorValor + ", é o de placa :" + placaVencedor + ".\n");
    }

    public static class ExceededVehiclesexception extends ExecutionException {
        public ExceededVehiclesexception(String placa) {
            super("\nQuantidade máxima de veículos permitida já alcançada.\nVeículo de placa: " +
                    placa + " não cadastrado, e inscrição dos carros seguintes foi bloqueada.\n");
        }
    }
}