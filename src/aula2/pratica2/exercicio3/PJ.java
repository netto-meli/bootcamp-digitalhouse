package aula2.pratica2.exercicio3;

//Funcionários PJ são prestadores de serviços e recebem por hora trabalhada.

import java.math.BigDecimal;
import java.text.NumberFormat;

public class PJ implements Funcionario {
    protected final String nome;
    protected BigDecimal salarioFinal;
    private final BigDecimal valorHora;
    private final double horasTrabalhadas;

    public PJ(String nome, double horasTrabalhadas, BigDecimal valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public void pagarSalario() {
        this.salarioFinal =  BigDecimal.valueOf(horasTrabalhadas).multiply(valorHora);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSalario() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(salarioFinal);
    }
}
