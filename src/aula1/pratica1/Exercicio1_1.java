package aula1.pratica1;

import java.util.Scanner;

/*
 Desenvolva um programa para mostrar os primeiros ""n"" números pares,
 sendo n um valor que o usuário irá inserir pelo console.
*/

public class Exercicio1_1 {
    public static void main (String[] args){
        Scanner cmd = new Scanner(System.in);
        System.out.println("Quantos numeros pares deseja visualizar?");
        String cmd1 = cmd.nextLine();
        int n = Integer.parseInt(cmd1);
        System.out.println("\nOs " + n + " primeiros numeros pares sao:");
        for (int i = 0; i<n;i++){
            System.out.println(i*2);
       }
    }

}
