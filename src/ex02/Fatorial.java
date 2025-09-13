package ex02;

public class Fatorial {
    public static void main(String[] args) {

        System.out.println("\n\nSaida : " + calculaFatorial(11));
    }

    public static long calculaFatorial(int f) {
        if (f == 0 || f == 1) {
            return 1;
        } else {
            return f * calculaFatorial(f - 1);
        }
    }
}
