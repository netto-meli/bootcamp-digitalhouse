package aula1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Desenvolver um programa para exibição por console os n primeiros números naturais
 que têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo console.

 Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
 números naturais que tenham pelo menos 2 dígitos terminados em 3 no console.
 Neste caso, a saída será: 33, 133 , 233, 303, 313.
*/

public class Exercicio1_5 {
    public static void main (String[] args){
        Scanner cmd = new Scanner(System.in);
        System.out.println("Quantos numeros naturais deseja visualizar?");
        String cmd1 = cmd.nextLine();
        int n = Integer.parseInt(cmd1);
        System.out.println("Devem ter pelo menos quantos digitos repetidos?");
        String cmd2 = cmd.nextLine();
        int m = Integer.parseInt(cmd2);
        System.out.println("Qual o numero que deve se repetir?");
        String cmd3 = cmd.nextLine();
        int d = Integer.parseInt(cmd3);

        if (n<=0) {
            System.out.println("Zero repeticoes");
            return;
        }

        int primeiroNumero = d;
        int dezena = 10;
        for (int i = 2;i<=m;i++) {
            primeiroNumero = (dezena * d) + primeiroNumero;
            dezena *= 10;
        }

        int numeroValido = primeiroNumero;
        ArrayList<String> lista = new ArrayList<>();
        while (lista.size() <n){
            String validoStr = String.valueOf(numeroValido);
            if ( verificaSeContem( m, d, validoStr) ){
                lista.add(validoStr);
            }
            numeroValido++;
        }

        System.out.printf("\nOs %d primeiros numeros pares sao:%n", n);
        for (String o: lista) {
            System.out.println(o);
        }
    }

    private static boolean verificaSeContem(int repete, int digito, String numeroValidar) {
        String digitoStr = String.valueOf(digito);
        int indice = 0;
        int repeticoes = 0;
        while (indice >=0 ){
            indice = numeroValidar.indexOf(digitoStr, indice);
            if (indice >=0){
                indice++;
                repeticoes++;
            }
            if(repeticoes==repete) return true;
        }
        return false;
    }

}
