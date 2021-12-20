import java.util.Scanner;

/*
 Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
 sendo n e m valores que o usuário irá inserir via console.
*/

public class Exercicio1_2 {
    public static void main (String[] args){
        Scanner cmd = new Scanner(System.in);
        System.out.println("Quantos numeros deseja visualizar?");
        String cmd1 = cmd.nextLine();
        System.out.println("Multiplos de que numero?:");
        String cmd2 = cmd.nextLine();
        int m = Integer.parseInt(cmd1);
        int p = Integer.parseInt(cmd2);
        System.out.println("\nOs " + m + " primeiros numeros multiplos de " + p + " sao:");
        for (int i = 0; i<m;i++){
            System.out.println(p*i);
        }
    }

}
