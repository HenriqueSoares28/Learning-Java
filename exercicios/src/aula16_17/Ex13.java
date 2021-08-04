package aula16_17;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = 1;
        for (int i = 0; i < num2; i++) {
            num3 = num3 * num1;
        }

        System.out.println(num1 + " elevado a " + num2 + " = " + num3);
    }
}