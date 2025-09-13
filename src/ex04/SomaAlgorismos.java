package ex04;

import java.util.Scanner;

public class SomaAlgorismos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Digite um numero: ");
        i = sc.nextInt();

        System.out.println("\n\nsaida: " + somarAlgarismos(i));

    }

    public static int somarAlgarismos(int num) {
        String numString = String.valueOf(num);
        if (numString.length() == 1) {
            return Character.getNumericValue(numString.charAt(0));
        } else {
            int endNumber = Character.getNumericValue(numString.charAt(numString.length() - 1));
            return somarAlgarismos(Integer.valueOf(numString.substring(0, numString.length() - 1))) + endNumber;
        }
    }
}
