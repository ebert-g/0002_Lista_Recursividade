package ex15;

public class MMC {
    public static void main(String[] args) {

        int n1 = 12, n2 = 18;
        int c = Math.max(n2, n2);
        System.out.println("\n\nTeste: " + calculaMMC(n1, n2, c));

    }

    public static Integer calculaMMC(int n1, int n2, int c) {
        if ((c % n1 == 0) && (c % n2 == 0)) {
            return c;
        }

        return calculaMMC(n1, n2, c += 1);

    }
}
