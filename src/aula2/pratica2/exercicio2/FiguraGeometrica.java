package aula2.pratica2.exercicio2;

public abstract class FiguraGeometrica {
    public abstract double area ();

    @Override
    public String toString() {
        return String.valueOf(area());
    }
}
