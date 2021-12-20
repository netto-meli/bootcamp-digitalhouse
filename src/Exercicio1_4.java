import java.util.ArrayList;
import java.util.Scanner;

/*
 Desenvolva um programa para mostrar no console os primeiros n números primos entre 1 e m,
 sendo m um valor que o usuário irá inserir pelo console.
*/

public class Exercicio1_4 {
    public static void main (String[] args) {
        Scanner cmd = new Scanner(System.in);
        System.out.println("Quantos numeros primos deseja visualizar?:");
        String cmd2 = cmd.nextLine();
        System.out.println("Numero mais alto de possive numero primo a verificar");
        String cmd1 = cmd.nextLine();
        int n = Integer.parseInt(cmd1); // numero primo
        int m = Integer.parseInt(cmd2); // quantidade
        ArrayList<String> lista = new ArrayList<>();

        for (int i=2; i<n;i++){
            if(lista.size()>=m) break;

            if (verificaPrimo(i)){
                lista.add(String.valueOf(i));
            }

        }
        System.out.println("Lista dos " +m+ " primeiros numeros primos abaixo de "+n);

        for (String k : lista) {
            System.out.println(k);
        }

    }

    private static boolean verificaPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
