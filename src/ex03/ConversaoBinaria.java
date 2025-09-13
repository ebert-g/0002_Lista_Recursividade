package ex03;

public class ConversaoBinaria {
    public static void main(String[] args) {

        System.out.println("\nSAIDA: " + decimalPBinario(13));

    }

    public static String decimalPBinario(int n) {
        if (n == 0) {
            return "0";
        }

        if (n == 1) {
            return "1";
        }

        int teste = n % 2;
        return decimalPBinario(n / 2) + (n % 2);
    }
}
