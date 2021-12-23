package aula4.pratica1.dakar;

public class Socorrista {
    public void socorrer(Veiculo veiculo){
        System.out.println("Socorredo " + veiculo.getClass().getSimpleName() + " de placa " + veiculo.getPlaca());
    }
}
