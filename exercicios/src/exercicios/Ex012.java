package exercicios;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o preço do produto? ");
        double preco = scanner.nextDouble();
        double porcentagem = preco * 5/100;
        System.out.println("O produto que custava R$" + preco + ", na promoção comm desconto de 5% vai custar R$" + (preco - porcentagem) + ".");
        scanner.close();
    }
}
