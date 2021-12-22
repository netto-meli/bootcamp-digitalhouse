package aula2.pratica2.exercicio3;

// Técnicos recebem bonificação de 5% por meta batida,
// trabalham uma jornada de 40h semanais e
// não têm descanso semanal remunerado.
// O salário base de um técnico é de R$ 3.200.

import java.math.BigDecimal;

public class Tecnico extends CLT {
    public Tecnico(String nome, int metasBatias) {
        super(nome, metasBatias, new BigDecimal(3200), new BigDecimal("0.05"), new BigDecimal(0));
    }
}
