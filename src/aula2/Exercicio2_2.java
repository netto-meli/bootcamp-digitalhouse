package aula2;
/*
Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em R$ 1,13 milhão
e possui uma média de crescimento anual de 148%.
Uma concorrente do ramo, “Empresa Y”,  é avaliada em R$ 18,4 milhões
e com sua média de crescimento anual em 32%.

Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual
até que a empresa X ultrapasse a empresa Y em seu valor de mercado.
*/

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Exercicio2_2 {

    public static void main(String[] args) {
        Empresa emp1 = new Empresa("X", new BigDecimal("1130000"), new BigDecimal("1.48"));
        Empresa emp2 = new Empresa("Y", new BigDecimal("18400000"), new BigDecimal("0.32"));


        int anoAtual=2021;
        while(emp1.getValor().compareTo(emp2.getValor()) == -1){
            imprimeStatusAtual(anoAtual,emp1,emp2);
            anoAtual++;
            emp1.calculaAvaliacao();
            emp2.calculaAvaliacao();
        }
        imprimeStatusAtual(anoAtual,emp1,emp2);
    }

    private static void imprimeStatusAtual(int anoAtual, Empresa emp1, Empresa emp2){
        System.out.println("Ano: "+anoAtual);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Empresa: "+ emp1.nome + " avaliada em R$ " + currency.format(emp1.valor));
        System.out.println("Empresa: "+ emp2.nome + " avaliada em R$ " + currency.format(emp2.valor));
    }

    private static class Empresa{
        private String nome;
        private BigDecimal valor;
        private BigDecimal crescimento;
        public Empresa(String nomeEmp, BigDecimal valorMercado, BigDecimal crescimentoAnual) {
            nome = nomeEmp;
            valor = valorMercado;
            crescimento = crescimentoAnual;
        }

        public String getNome() {
            return nome;
        }

        public BigDecimal getValor() {
            return valor;
        }

        public BigDecimal getCrescimento() {
            return crescimento;
        }

        public void calculaAvaliacao() {
            valor = valor.add(valor.multiply(crescimento));
        }
    }
}
