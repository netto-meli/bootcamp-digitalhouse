package aula4.pratica1;

/*
SaveTheRopa S.A é uma empresa que pretende implementar um sistema informatizado de
guarda-roupa a nível mundial. O sistema permite que uma pessoa guarde seus pertences
no guarda-roupa e, em seguida, retire-os facilmente, bastando apresentar o número
identificador que recebe quando são guardados.

Os pertences são representados no sistema por algo abstrato chamado de vestuário, que
tem uma marca e um modelo, de forma que se a pessoa perder o número, ela também
poderá em algum momento reivindicá-lo com aquela informação. No entanto, a
reivindicação será modelada em outro momento.

1. Crie a classe Vestuario que contém as variáveis marca e modelo, ambos do tipo
String.

2. Crie a classe GuardaRoupa que contém como atributos um dicionário e um contador
para ser usado como identificador. As chaves do dicionário serão Integer e como
valor uma lista de roupas.

3. Crie o método public Integer guardarVestuarios(List<Vestuario> listaDeVestuario),
na classe GuardaRoupa, que recebe uma lista de roupas e retorna o número
identificador onde as roupas foram atribuídas, ou seja, a chave do dicionário onde
guardamos as roupas.

4. Crie o método public void mostrarVestuarios(), na classe GuardaRopa que imprime
na tela todas as peças que ficam no guarda-roupa com o número que lhes
corresponde.

5. Crie o método public List<Vestuario> devolverVestuarios(Integer id), na classe
GuardaRoupa que retorna a lista de roupas armazenadas sob esse número.

6. Criar no método main() um cenário em que alguém guarda duas roupas, recebe o
código e, em seguida, retira suas roupas.
 */

import aula4.pratica1.ropa.GuardaRoupa;
import aula4.pratica1.ropa.Vestuario;

import java.util.ArrayList;
import java.util.List;

public class SaveTheRopa {

    public static void main(String[] args) {
        //6. Criar no método main() um cenário em que alguém guarda duas roupas, recebe o
        //código e, em seguida, retira suas roupas.

        List<Vestuario> vest1 = new ArrayList<>();
        vest1.add(new Vestuario("C&A", "Camisa"));
        vest1.add(new Vestuario("Marisa", "Calça"));

        List<Vestuario> vest2 = new ArrayList<>();
        vest2.add(new Vestuario("Marisa", "Saia"));
        vest2.add(new Vestuario("Renner", "Chapeu"));

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        Integer j = guardaRoupa.guardarVestuarios(vest1);
        System.out.println("novo Usuario recebe senha " +j+ " para retirar a roupa");
        j = guardaRoupa.guardarVestuarios(vest2);
        System.out.println("novo Usuario recebe senha " +j+ " para retirar a roupa");

        guardaRoupa.mostrarVestuarios();

        System.out.println("Usuario com senha 1 pega novamente as roupas");
        guardaRoupa.devolverVestuarios(1);

        guardaRoupa.mostrarVestuarios();

    }
}


/*
package com.dh.meli;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Roupa> roupasNobre = new ArrayList<>();
        List<Roupa> roupasPedro = new ArrayList<>();

        roupasNobre.add(new Roupa("Nike", "Calção"));
        roupasNobre.add(new Roupa("Nike", "camiseta"));

        roupasPedro.add(new Roupa("umbro", "jaqueta"));
        roupasPedro.add(new Roupa("umbro", "calça"));

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.guardarRoupas(roupasNobre);
        guardaRoupa.guardarRoupas(roupasPedro);

        guardaRoupa.mostrarRoupas();

        guardaRoupa.devolverRoupas(1);

        System.out.println("****************Depois de Remover***************");

        guardaRoupa.mostrarRoupas();

    }
}
 */