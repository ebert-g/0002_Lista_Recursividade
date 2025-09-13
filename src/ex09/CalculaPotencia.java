package ex09;

public class CalculaPotencia {
    public static void main(String[] args) {
        int base = 5;
        int expoente = 3;

        System.out.println(calculaPotencia(base, expoente));

    }

    public static int calculaPotencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        } else {
            return base * calculaPotencia(base, expoente - 1);
        }

    }
}
