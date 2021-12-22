package aula2.pratica2.exercicio2;

public class Retangulo extends FiguraGeometrica {
    double lado1;
    double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }
}
