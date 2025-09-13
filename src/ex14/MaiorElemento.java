package ex14;

import java.util.ArrayList;
import java.util.Arrays;

public class MaiorElemento {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>(
                Arrays.asList(10, 23, 23, 444, 43444, 555, 234, 12));

        System.out.println("---------\nMaior Elemento: " + maiorElemento(listInt));

    }

    public static int maiorElemento(ArrayList<Integer> listInt) {

        if (listInt.size() == 1) {
            return listInt.get(0);
        } else {
            // ArrayList<Integer> nListInt = new ArrayList<>(listInt);

            if (listInt.get(0) > listInt.get(1)) {
                listInt.remove(1);
            } else {
                listInt.remove(0);
            }

            return maiorElemento(listInt);
        }

    }
}
