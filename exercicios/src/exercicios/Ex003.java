package exercicios;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        int s = num1 + num2;
        System.out.println("A soma entre " + num1 + " + " + num2 + " = " + s);
        scanner.close();
    }
}
