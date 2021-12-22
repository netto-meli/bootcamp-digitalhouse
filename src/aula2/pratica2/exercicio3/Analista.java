package aula2.pratica2.exercicio3;

// Analistas possuem bonificação de 8% por meta batida,
// trabalham uma jornada de 40h horas semanais e
// possuem 4h de descanso semanal remunerado.
// O salário base de um analista é de R$ 4.000

import java.math.BigDecimal;

public class Analista extends CLT {
    public Analista(String nome, int metasBatias) {
        super(nome, metasBatias, new BigDecimal(4000), new BigDecimal("0.08"), new BigDecimal(4/40));
    }
}
