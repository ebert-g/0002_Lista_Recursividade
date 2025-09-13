package ex12;

public class somaArray {
    public static void main(String[] args) {

        int[] inteiros = { 1, 2, 3, 4, 5 };

        System.out.println("\nSAIDA: " + somarArray(inteiros));

    }

    public static int somarArray(int[] inteiros) {
        if (inteiros.length == 1) {
            return inteiros[0];
        } else {
            int[] intCopy = new int[inteiros.length - 1];
            System.arraycopy(inteiros, 0, intCopy, 0, inteiros.length - 1);

            return inteiros[inteiros.length - 1] + somarArray(intCopy);
        }
    }
}
