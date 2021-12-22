package aula2.pratica2;
/*
1. Crie uma classe de Senha. O construtor deve receber uma regex (expressão regular)
que valida o formato exigido para a senha. Pesquise na Internet quais recursos Java
fornece para operar com expressões regulares.

2. Adicione o método public void setValue (String pwd) que permite atribuir uma senha
de acordo com a exigida pela regex do ponto anterior. Em caso de incompatibilidade,
o método deve lançar uma exceção.

a. Discussão: que tipo de exceção você considera mais adequada?
b. Implemente o método conforme decidido em (2).
3. Escreva três classes: PasswordForte, PasswordMedia, PasswordFraca, todas elas
devem estender Password e codificar um regex de acordo com o nível de segurança
que o nome da classe indica.
*/

import aula2.pratica2.exercicio1.PasswordForte;
import aula2.pratica2.exercicio1.PasswordFraca;
import aula2.pratica2.exercicio1.PasswordMedia;
import aula2.pratica2.exercicio1.Senha;

public class Exercicio2_1 {

    public static void main(String[] args) {

        Senha senha = new Senha(new PasswordForte().getRegex() );

        setValue(senha,"a17B@cke"); // true
        setValue(senha,"a12B@cce"); // false
        setValue(senha,"a22B@cde"); // false
        setValue(senha,"a12@@cde"); // false
        setValue(senha,"a12B@cCe"); // false se case sensitive (buscando como fazer em java)



        senha = new Senha(new PasswordMedia().getRegex() );

        setValue(senha,"a17B@cke"); // true
        setValue(senha,"a12B@cce"); // false
        setValue(senha,"a22B@cde"); // false
        setValue(senha,"a12@@cde"); // false
        setValue(senha,"a12B@cCe"); // false se case sensitive (buscando como fazer em java)



        senha = new Senha(new PasswordFraca().getRegex() );

        setValue(senha,"a17B@cke"); // true
        setValue(senha,"a12B@cce"); // trtue
        setValue(senha,"a22B@cde"); // true
        setValue(senha,"a12@@cde"); // true
        setValue(senha,"a1cCe"); // false

    }

    private static void setValue(Senha s, String p) {
        try {
            s.setValue(p);
            System.out.println("Senha \"" +p+ "\" cadastrada");
        } catch (Senha.SenhaException e) {
            System.out.println( e.getMessage() );
        }
    }
}
