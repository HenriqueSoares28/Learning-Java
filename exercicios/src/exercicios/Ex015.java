package exercicios;

import java.util.Scanner;

public class Ex015 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias alugado? ");
        int dias = scanner.nextInt();
        System.out.println("Quantos Km rodados? ");
        int km = scanner.nextInt();
        int precoDia = dias * 60;
        double precoKm = km * 0.15;
        double total = precoDia + precoKm;
        System.out.println("O total a pagar é de R$" + total);

        scanner.close();
    }
}
