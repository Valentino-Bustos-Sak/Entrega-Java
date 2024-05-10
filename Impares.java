import java.util.ArrayList;
import java.util.List;

public class Impares {
    public static void main(String[] args) throws Exception {
        List<Integer> miLista = new ArrayList<>();
        miLista.add(27);
        miLista.add(6);
        miLista.add(14);
        miLista.add(8);
        miLista.add(9);
        miLista.add(12);
        miLista.add(13);
        int contador=0;
        for (int numero : miLista){
            if (!(numero % 2 == 0)){
                contador+=1;
            }
        }
        System.out.println(contador);
}
}
