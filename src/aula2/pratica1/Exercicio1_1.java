package aula2.pratica1;
/*
Você precisa entregar um sistema para gerenciamento de turmas em uma determinada
escola.

1. Para isso você deverá desenvolver uma classe Turma que deve ter a série e o
código identificador (8o ano A, 9o ano C, etc...), um vetor de disciplinas e um
vetor de estudantes.
2. Crie a classe Disciplina que deve ter o nome e a carga horária
3. Crie a classe Estudante que deverá receber um nome, data de nascimento,
número de matrícula e série.
Por fim, você deverá criar uma classe principal para criar alguns estudantes e
disciplinas e, em seguida, criar algumas turmas e inserir os estudantes e disciplinas já
criados nessas turmas.
Para pensar: As relações entre turma e alunos/disciplinas são composições ou
agregações? Por quê?
Observação: A partir do Java 8 foi incluído uma excelente API para
trabalharmos com datas. Portanto, atributos do tipo data devem ser
declarados como LocalDate.
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio1_1 {
    //criar alguns estudantes e disciplinas
    //criar algumas turmas
    //inserir os estudantes e disciplinas nas turmas.
    public static void main(String[] args) {
        List<Estudante> est1 = estudantesTurma("1");
        List<Estudante> est2 = estudantesTurma("2");
        List<Estudante> est3 = estudantesTurma("3");
        List<Disciplina> disc = criaDisciplinas();

        List<Turma> tur = new ArrayList<>();
        tur.add( new Turma(4,"A",disc,est1));
        tur.add( new Turma(4,"B",disc,est2));
        tur.add( new Turma(4,"C",disc,est3));

        for (Turma t: tur) {
            System.out.println("Turma da "+t.serie+"a serie "+t.identificador+" tem "+t.estudantes.size()+" estudantes e "+t.disciplinas.size()+" disciplinas");
        }

    }

    private static List<Disciplina> criaDisciplinas() {
        List<Disciplina> d = new ArrayList<>();
        d.add(new Disciplina("Historia", 8));
        d.add(new Disciplina("Portugues", 16));
        d.add(new Disciplina("Matematica", 12));
        d.add(new Disciplina("Ciencia", 4));
        return d;
    }

    private static List<Estudante> estudantesTurma(String t) {
        List<Estudante> l = new ArrayList<>();
        l.add(new Estudante(("Jose "+t), LocalDate.of(2010,5,Integer.parseInt(t)), (56+Integer.parseInt(t)), 4));
        l.add(new Estudante(("Maria "+t), LocalDate.of(2010,8,Integer.parseInt(t)), (86+Integer.parseInt(t)), 4));
        l.add(new Estudante(("Joao "+t), LocalDate.of(2010,4,Integer.parseInt(t)), (74+Integer.parseInt(t)), 4));
        return l;
    }
}
