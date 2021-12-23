package aula4.pratica1.ropa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> dicionario = new HashMap();
    private int contador = 0; // identificador

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        contador++;
        dicionario.put(contador,listaDeVestuario);
        return contador; // chave do dicionario
    }

    public void mostrarVestuarios(){
        // imprime na tela todas as peças que ficam no guarda-roupa
        // com o número que lhes corresponde.
        for (Integer senha : dicionario.keySet()) {
            List<Vestuario> listVest = dicionario.get(senha);
            System.out.println("\n\nIdentificador: " + senha + "\nVestuario referente:");
            for (Vestuario vest : listVest) {
                System.out.println("\tMarca: "+ vest.getMarca() + " // Modelo: " + vest.getModelo());
            }
        }

    }

    public void devolverVestuarios(Integer id){
        dicionario.remove(id);
    }
}