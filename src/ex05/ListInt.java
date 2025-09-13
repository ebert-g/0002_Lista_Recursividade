package ex05;

import java.util.Scanner;

public class ListInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        System.out.println("Digite um numeiro:");
        num = sc.nextInt();
        System.out.println("----------");
        listInt(num);

    }

    public static void listInt(int num) {
        if (num == 1) {
            System.out.print(num + " ");
        } else {
            listInt(num - 1);
            System.out.print(num + " ");
        }
    }
}