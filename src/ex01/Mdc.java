package ex01;

public class Mdc {
    public static void main(String[] args) {

        System.out.println("SAIDA: " + calculaMDC(60, 36));

    }

    public static int calculaMDC(int m, int n) {
        int r = m % n;
        if (r != 0) {
            m = n;
            n = r;
            return calculaMDC(m, n);
        } else {
            return n;
        }

    }
}