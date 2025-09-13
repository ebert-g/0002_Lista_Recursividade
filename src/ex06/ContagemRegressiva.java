package ex06;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        // System.out.println("Digite a contagem regressiva:");
        // num = sc.nextInt();
        System.out.println("----------");
        contagemRegressiva(num);
        System.out.println("FELIZ ANO NOVO!");

    }

    public static void contagemRegressiva(int num) {
        if (num == 1) {
            System.out.println(1);
        } else {
            try {
                System.out.println(num);
                Thread.sleep(1000);
                contagemRegressiva(num - 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
