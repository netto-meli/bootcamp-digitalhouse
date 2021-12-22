package aula2.pratica2.exercicio3;

// Gerentes possuem bonificação de 12,5% por meta batida,
// trabalham 36h semanais com
// 4h de descanso semanal remunerado.
// O salário base de um gerente é de R$ 6.000.

import java.math.BigDecimal;

public class Gerentes extends CLT {
    public Gerentes(String nome, int metasBatias) {
        super(nome, metasBatias, new BigDecimal(6000), new BigDecimal("0.125"), new BigDecimal(4/36));
    }
}
