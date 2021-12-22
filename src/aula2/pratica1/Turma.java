package aula2.pratica1;

import java.util.List;

public class Turma {
    int serie;
    String identificador;
    List<Disciplina> disciplinas;
    List<Estudante> estudantes;

    public Turma(int sr, String id, List<Disciplina> di, List<Estudante> est){
        serie = sr;
        identificador = id;
        disciplinas = di;
        estudantes = est;
    }
}
