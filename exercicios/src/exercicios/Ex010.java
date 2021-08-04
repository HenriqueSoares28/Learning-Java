package exercicios;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto dinheiro você tem na carteira? "); 
        double din = scanner.nextDouble();
        System.out.println("Com R$" + din + " você pode comprar US" + (din/5.74));
        scanner.close();
    }
}
