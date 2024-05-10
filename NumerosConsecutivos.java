import java.util.ArrayList;
import java.util.List;

public class NumerosConsecutivos {

    public static List<List<Integer>> encontrarConsecutivos(List<Integer> lista) {
        List<List<Integer>> consecutivos = new ArrayList<>();
        
        if (lista == null || lista.isEmpty())
            return consecutivos;

        List<Integer> consecutivoActual = new ArrayList<>();
        consecutivoActual.add(lista.get(0));

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) - lista.get(i - 1) == 1) {
                consecutivoActual.add(lista.get(i));
            } else {
                consecutivos.add(consecutivoActual);
                consecutivoActual = new ArrayList<>();
                consecutivoActual.add(lista.get(i));
            }
        }

        consecutivos.add(consecutivoActual);

        return consecutivos;
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(10);
        lista.add(11);
        lista.add(11);
        lista.add(12);


        List<List<Integer>> consecutivos = encontrarConsecutivos(lista);

        System.out.println("Números consecutivos encontrados:");
        for (List<Integer> consecutivo : consecutivos) {
            for (Integer numero : consecutivo) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}
