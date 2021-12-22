package aula2.pratica2.exercicio3;

import java.math.BigDecimal;

public interface Funcionario {
    final String nome = "";
    final BigDecimal salario = new BigDecimal(0);

    public void pagarSalario();
    public String getNome();
    public String getSalario();

}
