package aula2.pratica2.exercicio3;

// Funcionários CLT recebem de acordo com o cargo que ocupam na empresa + Bônus
// e gratificações que são calculados em porcentagem do salário base

import java.math.BigDecimal;
import java.text.NumberFormat;

public abstract class CLT implements Funcionario {
    protected final String nome;
    protected BigDecimal salarioFinal;
    protected final int metasBatias;
    protected final BigDecimal salarioBase;
    protected final BigDecimal bonus;
    protected final BigDecimal gratificacao;

    protected CLT(String nome, int metasBatias, BigDecimal salarioBase, BigDecimal bonus, BigDecimal gratificacao) {
        this.nome = nome;
        this.metasBatias = metasBatias;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioBase;
        this.bonus = bonus;
        this.gratificacao = gratificacao;
    }

    @Override
    public void pagarSalario() {
        BigDecimal bonificacaoPorMeta = (bonus.multiply(salarioBase));
        BigDecimal bonificacaoTotal = bonificacaoPorMeta.multiply(BigDecimal.valueOf(metasBatias));
        salarioFinal.add(bonificacaoTotal);
        BigDecimal descansoRemunerado = salarioFinal.multiply(gratificacao);
        salarioFinal.add(descansoRemunerado);
        this.salarioFinal = salarioBase;
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
