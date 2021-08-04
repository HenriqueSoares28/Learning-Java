package exercicios;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira nota do aluno: ");
        double n1 = scanner.nextDouble();
        System.out.println("Segunda nota do aluno: ");
        double n2 = scanner.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("A média entre: " + n1 + " e " + n2 + " é igual a " + media);




        scanner.close();

    }
}
