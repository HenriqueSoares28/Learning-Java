package exercicios;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int n1 = num - 1;
        int n2 = num + 1;
        System.out.println("O antecessor de " + num + " é " + n1 + " e seu sucessor " + n2 + ".");

        scanner.close();
    }
}
