package aula2.pratica2.exercicio3;

// Diretores não possuem bonificação, entretanto recebem participação nos lucros de 3%,
// não possuem horário de trabalho definido e
// seu salário base é de R$ 15.000.

import java.math.BigDecimal;

public class Diretor extends CLT {
    BigDecimal lucroDaEmpresa;
    public Diretor(String nome, BigDecimal lucroDaEmpresa) {
        super(nome, 0, new BigDecimal(15000), new BigDecimal("0.03"), new BigDecimal(0));
        this.lucroDaEmpresa = lucroDaEmpresa;
    }

    @Override
    public void pagarSalario() {
        BigDecimal participacaoLucros = lucroDaEmpresa.multiply(bonus);
        this.salarioFinal = salarioBase.add(participacaoLucros);
    }
}
