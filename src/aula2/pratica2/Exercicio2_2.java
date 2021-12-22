package aula2.pratica2;
/*
1. Crie a classe abstrata FiguraGeometrica e com o método:
public abstract double area ();
<<<OK>>>

2. Substitua corretamente o método toString. Discussão em grupo: faz sentido substituir
o método toString em uma classe abstrata?
<<<sIM OU NAO>>>

3. Crie as classes Círculo, Triangulo e Retangulo, todas subclasses de
FiguraGeometrica. Que erro de compilação aparece? Como você resolveria isso?
<Erro -> "Círculo is not abstract and does not override abstract method area() in FiguraGeometrica">
<<<Para Resolver, é so criar o metodo nas classes que implementam FiguraGeometrica>>>

4. Adicione os atributos (variáveis de instância) que correspondem em cada caso e
substitua adequadamente o método de área em todas as subclasses de
FiguraGeometrica.
<<<OK>>>

5. Crie uma classe de utilidade com um método estático: public static double
areaMedia (FiguraGeometrica arr [ ]), que calcula e retorna a área média das figuras
contidas no array.
<<<OK>>>

6. Crie um programa, instancie um array de FiguraGeometrica[ ], carregue os dados
nele e execute o método areaMedia para obter a área média. Mostre o resultado.
<<<OK>>>
*/


import aula2.pratica2.exercicio2.*;

import java.math.BigDecimal;

public class Exercicio2_2 {

    public static void main(String[] args) {
        //criar array de fig geo e calc area media
        FiguraGeometrica[] figuras = new FiguraGeometrica[9];
        figuras[0] = new Circulo(4); // circulo 1 r=4
        figuras[1] = new Retangulo(7,8); // retangulo 1 7x8
        figuras[2] = new Retangulo(10,10); // quadrado 10x10
        figuras[3] = new Triangulo(7,9); //Triangulo base/altura
        figuras[4] = new Triangulo(6); //triangulo equilatero
        figuras[5] = new Triangulo(3,4,5); //calculo pelo semiperimetro
        figuras[6] = new Triangulo(7,8, new BigDecimal(90)); //lados e angulo
        figuras[7] = new Triangulo(3,4,5,2.5); //circunscrito
        figuras[8] = new Circulo(Math.sqrt(7/Math.PI)); //circulo 2

        System.out.println(Utilidade.areaMedia(figuras));

    }
}
