package exercicios;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = scanner.next();
        System.out.println("É um grande prazer te conhecer " + nome + "!");
        scanner.close();
    }
    
}
