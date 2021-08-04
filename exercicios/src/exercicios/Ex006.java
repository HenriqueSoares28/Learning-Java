package exercicios;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int dobro = num * 2;
        int triplo = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("O dobro de " + num + " é " + dobro + ".");
        System.out.println("O triplo de " + num + " é " + triplo + ".");
        System.out.println("A raiz quadrada de  " + num + " é " + raiz + ".");

        scanner.close();
        
    }
}
