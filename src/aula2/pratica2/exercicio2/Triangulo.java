package aula2.pratica2.exercicio2;

import java.math.BigDecimal;

public class Triangulo extends FiguraGeometrica {

    private final String tipoCalculo;
    private double base;
    private double lado2;
    private double lado3;
    private double altura;
    private BigDecimal angulo;
    private double raio;

    /**
     * Produto da Base e altura
     */
    public Triangulo(double base, double altura) {
        this.tipoCalculo = "BaseAltura";
        this.base = base;
        this.altura = altura;
    }

    /**
     * Triangulo Equlátero
     */
    public Triangulo(double lado) {
        this.tipoCalculo = "Equilatero";
        this.base = lado;
    }

    /**
     * area pelo Semiperimetro
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.tipoCalculo = "Semiperimetro";
        this.base =lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    /**
     * Lados e andgulo
     */
    public Triangulo(double lado1, double lado2, BigDecimal angulo) {
        this.tipoCalculo="Lados";
        this.lado3 = lado1;
        this.lado2 = lado2;
        this.angulo = angulo;
    }

    /**
     * Raio circunscrito
     */
    public Triangulo(double lado1, double lado2, double lado3, double raio) {
        this.tipoCalculo = "Raio";
        this.base =lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.raio = raio;
    }

    @Override
    public double area() {
        double area = 0;
        switch (tipoCalculo){
            case "BaseAltura" :
                area = (base * altura) / 2;
                break;
            case "Equilatero" :
                area = ( base * base * Math.sqrt(3) ) / 4;
                /*
                ou tambem
                altura = (base * Math.sqrt(3)) / 2;
                area = (base * altura) / 2;
                 */
                break;
            case "Semiperimetro" :
                double sigma = (base+lado2+lado3)/2;
                double a = sigma * (sigma-base) * (sigma - lado2) * (sigma - lado3);
                area = Math.sqrt(a) ;
                break;
            case "Lados" :
                area = ( lado2 * lado3 * Math.sin(angulo.doubleValue()) ) / 2;
                break;
            case "Raio" :
                area = (base * lado3 * lado3) / (4 * raio);
                break;
            default:
                // lancar excessao de calculo?
                break;
        }
        return area;
    }
}
