package ex08;

public class SomaNaturais {

    public static void main(String[] args) {

        int num = 10;

        System.out.println("SAIDA: " + somaNaturais(num));

    }

    public static int somaNaturais(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + somaNaturais(num - 1);
        }
    }

}
