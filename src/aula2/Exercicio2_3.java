package aula2;
/*
Para um protótipo de supermercado, crie um programa que leia 3 produtos e
imprima no console: nome, preço, quantidade e o valor total da compra. Utilize um array como
estrutura de dados para armazenamento dos produtos informados.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2_3 {
    public static void main(String[] args) {
        int i = 1;
        List<Produto> listaCompras = new ArrayList<>();
        listaCompras.add(solcitaProduto(i++));
        listaCompras.add(solcitaProduto(i++));
        listaCompras.add(solcitaProduto(i++));

        System.out.println("Lista de compras");
        for (Produto p: listaCompras) {
            System.out.println("Produto " + p.getNome());
            System.out.println("Preco " + p.getPreco());
            System.out.println("Quantidade " + p.getQuantidade());
        }

    }

    private static Produto solcitaProduto(int i) {
        Scanner cmd = new Scanner(System.in);
        System.out.println("Digite o nome do " + i + "o. produto");
        String nome = cmd.nextLine();
        System.out.println("Digite o preco do " + i + "o. produto");
        String preco = cmd.nextLine();
        System.out.println("Digite a quantidade do " + i + "o. produto");
        String quantidade = cmd.nextLine();
        return new Produto (nome, Double.parseDouble(preco), Integer.parseInt(quantidade));
    }

    private static class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        public Produto (String nm, double pr, int qt){
            nome = nm;
            preco = pr;
            quantidade= qt;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }
    }
}
