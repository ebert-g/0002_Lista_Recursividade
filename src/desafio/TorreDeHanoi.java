package desafio;

import java.util.Scanner;

public class TorreDeHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de discos:");
        int qtdDiscos = 3;

        // qtdDiscos = sc.nextInt();

        System.out.println("Passos:");
        hanoi(qtdDiscos, 'A', 'B', 'C');
        sc.close();

    }

    static void hanoi(int qtdDiscos, char origem, char auxiliar, char destino) {
        if (qtdDiscos <= 0)
            return;
        if (qtdDiscos == 1) {
            System.out.printf("Mover de %c para %c\n", origem, destino);
            return;
        }
        hanoi(qtdDiscos - 1, origem, destino, auxiliar);

        System.out.printf("Mover de %c para %c\n", origem, destino);

        hanoi(qtdDiscos - 1, auxiliar, origem, destino);
    }
}
