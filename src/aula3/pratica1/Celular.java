package aula3.pratica1;

public class Celular implements Precedente<Celular>{
    private final String numero;
    private final String proprietario;

    public Celular(String proprietario, String numero ) {
        this.numero = numero;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero='" + numero + '\'' +
                ", proprietario='" + proprietario + '\'' +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    //Defina um critério de precedência para implementar o método. Pode ser que
    //uma pessoa preceda outra se o seu CPF for inferior, ou o nome for alfabeticamente
    //inferior e assim por diante.
    @Override
    public int precedeA(Celular celular) {
        return this.numero.toLowerCase().compareTo(celular.getNumero().toLowerCase());
        /*
        int precede = 0;
        if (celular == null) return precede;
        if (this.proprietario.charAt(0) > celular.proprietario.charAt(0)){
            precede = 1;
        } else if ((this.proprietario.charAt(0) < celular.proprietario.charAt(0))){
            precede = -1;
        }
        return precede;
         */
    }
}
