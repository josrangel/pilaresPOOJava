import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda {
    public static void ordenamiento(){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(15);
        lista.add(60);
        lista.add(-10);
        lista.add(20);

        Collections.sort(lista, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (Integer elemento:lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        new Lambda().ordenamiento();
    }
}
