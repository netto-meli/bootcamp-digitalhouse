package aula3;
/*
1. Crie a interface Precedente<T> com um método public int precedeA (T t).
2. Crie a classe Pessoa, com os atributos String nome e cpf, seus métodos de acesso e
os construtores que você considera apropriados.
3. Criar uma classe Pessoa que implemente Precedente<Pessoa>, e sobrescreva o
método int precedeA(Pessoa p).
4. Defina um critério de precedência para implementar o método acima. Pode ser que
uma pessoa preceda outra se o seu CPF for inferior, ou o nome for alfabeticamente
inferior e assim por diante.
5. Crie a classe SortUtil com o método:
public static <T> void sort (List<Precedente <T>> arr[ ]).
6. Dentro do método anterior, desenvolva o algoritmo de bolha (bubble sort) para
ordenar a matriz.
7. Discussão: O método de classificação pode classificar uma matriz de qualquer tipo de
dados?
8. Crie um programa, declare um array com várias pessoas, classifique-o e exiba-o.
9. Crie a classe Celular, com os atributos: numero e proprietario, implemente
Precedente<Celular> e proceda da mesma forma que fizemos com Pessoa do ponto
anterior.
*/

import aula3.pratica1.Celular;
import aula3.pratica1.Pessoa;
import aula3.pratica1.Precedente;
import aula3.pratica1.SortUtil;

public class Exercicio3_1 {
    //7. Discussão: O método de classificação pode classificar uma matriz de qualquer tipo de
    //dados?
    // ->
    //
    //Crie um programa, declare um array com várias pessoas, classifique-o e exiba-o.
    public static void main(String[] args) {

        Precedente<Pessoa>[] grupoPessoa = new Pessoa[9];
        grupoPessoa[0] = new Pessoa("Aemuel", "487.569.278-19");
        grupoPessoa[1] = new Pessoa("Jabriel", "133.982.391-88");
        grupoPessoa[2] = new Pessoa("Zaria", "291.389.909-12");
        grupoPessoa[3] = new Pessoa("Jemuel", "487.569.278-19");
        grupoPessoa[4] = new Pessoa("Kabriel", "133.982.391-88");
        grupoPessoa[5] = new Pessoa("Aaria", "291.389.909-12");
        grupoPessoa[6] = new Pessoa("Lemuel", "487.569.278-19");
        grupoPessoa[7] = new Pessoa("Mabriel", "133.982.391-88");
        grupoPessoa[8] = new Pessoa("Laria", "291.389.909-12");

        SortUtil.sort(grupoPessoa);
        for (Precedente<Pessoa> pess : grupoPessoa) {
            System.out.println(pess.toString());
        }

        Precedente<Celular>[] celulares = new Celular[10];
        celulares[0] = new Celular("Aemuel", "489.569.278-19");
        celulares[1] = new Celular("Jabriel", "183.982.391-88");
        celulares[2] = new Celular("Zaria", "291.348.909-12");
        celulares[3] = new Celular("Jemuel", "487.539.278-19");
        celulares[4] = new Celular("Kabriel", "133.882.391-88");
        celulares[5] = new Celular("Aaria", "291.382.909-12");
        celulares[6] = new Celular("Lemuel", "487.519.278-19");
        celulares[7] = new Celular("Mabriel", "133.982.381-88");
        celulares[8] = new Celular("Laria", "291.389.909-03");
        celulares[9] = new Celular("Laria", "291.389.909-02");

        SortUtil.sort(celulares);
        for (Precedente<Celular> cel : celulares) {
            System.out.println(cel.toString());
        }
    }
}
