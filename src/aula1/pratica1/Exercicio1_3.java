package aula1.pratica1;

import java.util.Scanner;

/*
 Desenvolva um programa para informar se um um número n é primo ou não,
 sendo n um valor que o usuário irá inserir pelo console.
*/

public class Exercicio1_3 {
    public static void main (String[] args){
        Scanner cmd = new Scanner(System.in);
        System.out.println("Verificacao de numero primo:");
        String cmd1 = cmd.nextLine();
        int n = Integer.parseInt(cmd1);
        if (n <2) {
            System.out.println(n + " NAO é um numero primo, pois nnumeros negativos, 0 e 1 nao sao primos");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " NAO é um numero primo");
                return;
            }
        }
        System.out.println(n + " é um numero primo");
    }
}
