package exercicios;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();
        System.out.println("O valor digitado foi: " + numero + " e a sua porção inteira é " + (Math.floor(numero)));
        scanner.close();
    }
}
