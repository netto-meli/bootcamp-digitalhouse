package aula3.pratica1;

public class Pessoa implements Precedente<Pessoa>{
    private final String nome;
    private final String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    //Defina um critério de precedência para implementar o método. Pode ser que
    //uma pessoa preceda outra se o seu CPF for inferior, ou o nome for alfabeticamente
    //inferior e assim por diante.
    @Override
    public int precedeA(Pessoa pessoa) {
        return this.nome.toLowerCase().compareTo(pessoa.getNome().toLowerCase());
    }
}
