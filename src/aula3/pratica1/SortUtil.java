package aula3.pratica1;

public class SortUtil {
    public static <T> void sort (Precedente<T>[] arr) {
        for (int i = arr.length; i >= 1 ; i--){
            boolean ordenado = true; // skip se ja estiver tudo OK
            for (int j = 1; j < i ; j++){
                if (arr[j].precedeA((T) arr[j-1]) < 0) {
                    Precedente<T> temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    ordenado = false;
                }
            }
            if (ordenado) break;
        }
    }


    /*
    public static <T> void sort (List<Precedente<T>>[] arr){
        //desenvolva o algoritmo de bolha (bubble sort) para ordenar a matriz
        for (List<Precedente<T>> listCellPess : arr ) {
            Precedente<T> pre = null;
            List<Precedente<T>> listAux = new ArrayList<>();
            for (Precedente<T> cellPass : listCellPess ) {
                if (pre==null) pre = cellPass;
                int i = cellPass.precedeA((T) pre);
                switch (i) {
                    case 1:
                        //maior -> segue
                        break;
                    case -1:
                    case 0:
                        //menor ou igual -> troca
                        break;
                }
            }
        }
    */
    /*
    dava pra azer assim sera?
    ==
        for (Aluno al: listaAlunos){
            if(al.getNome().equals(aluno.getNome())){
                listaAlunos.set(listaAlunos.indexOf(al), aluno);
                return aluno;
            }
        }
    */
    /*


//exemplo internet
        for (int i = v.length; i >= 1; i--) {
        bool orddebado = true;
            for (int j = 1; j < i; j++) {
                if (v[j - 1] > v[j]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                    ordenado = false;
                }
            }
            if(ordenado) break; // ja estava orrdenado
        }
    }*/
}
