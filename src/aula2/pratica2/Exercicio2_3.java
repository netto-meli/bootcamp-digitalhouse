package aula2.pratica2;
/*
1. Você recebeu a solicitação para desenvolver um sistema de gerenciamento de
funcionários em uma empresa. Pela escala hierárquica temos dois tipos de
funcionários, CLT e PJ. Funcionários PJ são prestadores de serviços e recebem por
hora trabalhada. Funcionários CLT recebem de acordo com o cargo que ocupam na
empresa + Bônus e gratificações que são calculados em porcentagem do salário
base. Em geral Funcionários CLT são divididos na seguinte hierarquia: Técnicos,
analistas, gerentes e diretores
a. Técnicos recebem bonificação de 5% por meta batida, trabalham uma jornada
de 40h semanais e não têm descanso semanal remunerado. O salário base de
um técnico é de R$ 3.200.
b. Analistas possuem bonificação de 8% por meta batida, trabalham uma jornada
de 40h horas semanais e possuem 4h de descanso semanal remunerado. O
salário base de um analista é de R$ 4.000
c. Gerentes possuem bonificação de 12,5% por meta batida, trabalham 36h
semanais com 4h de descanso semanal remunerado. O salário base de um
gerente é de R$ 6.000.
d. Diretores não possuem bonificação, entretanto recebem participação nos
lucros de 3%, não possuem horário de trabalho definido e seu salário base é
de R$ 15.000.

2. Você precisa implementar o método pagarSalario para cada categoria de forma a
considerar as especificidades de cada uma.
*/

import aula2.pratica2.exercicio3.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Exercicio2_3 {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new PJ("Joao",100,new BigDecimal("70")));
        funcionarios.add(new PJ("Maria",400,new BigDecimal("10")));
        funcionarios.add(new PJ("Jose",10,new BigDecimal("20")));
        funcionarios.add(new Tecnico("Marcos",3));
        funcionarios.add(new Tecnico("Carlos",0));
        funcionarios.add(new Tecnico("Fabio",9));
        funcionarios.add(new Analista("Guilherme",3));
        funcionarios.add(new Analista("Angela",0));
        funcionarios.add(new Analista("Paloma",1));
        funcionarios.add(new Gerentes("Paula",1));
        funcionarios.add(new Gerentes("Vania",0));
        funcionarios.add(new Gerentes("Zelia",10));
        funcionarios.add(new Diretor("Yuri",new BigDecimal(100000)));
        funcionarios.add(new Diretor("Boris",new BigDecimal(0)));
        funcionarios.add(new Diretor("Kleber",new BigDecimal(100000000)));

        //Pagando salarios
        for ( Funcionario fun: funcionarios) {
            fun.pagarSalario();
            System.out.println(fun.getNome() + " recebeu R$ " + fun.getSalario());
        }


    }
}
