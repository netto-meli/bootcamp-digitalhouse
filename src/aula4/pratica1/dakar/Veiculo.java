package aula4.pratica1.dakar;

/*
1. Crie a classe do Veiculo que possui os seguintes atributos:
● velocidade
● aceleracao
● anguloDeGiro
● placa
● peso
● rodas
 */

public class Veiculo {
    private final double velocidade;
    private final double aceleracao;
    private final double anguloDeGiro;
    private final String placa;
    private final double peso;
    private final int rodas;

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public double getPeso() {
        return peso;
    }

    public int getRodas() {
        return rodas;
    }

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}


