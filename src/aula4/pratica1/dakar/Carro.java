package aula4.pratica1.dakar;

/*
Os carros pesam 1.000 quilos e as motocicletas 300 quilos, os carros têm 4 rodas e as
motocicletas 2.
 */

public class Carro extends Veiculo{
    private static final double PESO = 1000;
    private static final int RODAS = 4;

    public Carro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO, RODAS);
    }

    /*
    @Override
    public String toString() {
        return super.toString();
    }
 */
}


