package aula2.pratica1;

import java.time.LocalDate;

public class Estudante {
    String nome;
    LocalDate nascimento;
    int matricula;
    int serie;
    public Estudante(String nm, LocalDate nc, int mat, int ser){
        nome = nm;
        nascimento=nc;
        matricula=mat;
        serie=ser;
    }
}
