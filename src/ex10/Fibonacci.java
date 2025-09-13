package ex10;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("\nSaida: " + fibonnaci(3));
    }

    public static int fibonnaci(int f) {

        if (f <= 1) {
            return f;
        } else {
            return fibonnaci(f - 1) + fibonnaci(f - 2);
        }

    }

}
