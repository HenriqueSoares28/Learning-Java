package exercicios;

import java.util.Scanner;

public class Ex011 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Largura da parede: ");
        double largura = scanner.nextDouble();
        System.out.println("Aluta da parede: ");
        double altura = scanner.nextDouble();
        double area = largura*altura;
        double tinta = area/2;
        System.out.println("Sua parede tem a dimenção de " + largura + " x " + altura + " e a sua area é de " + area + "m².");
        System.out.println("Para pintar essa árede, você precisará de " + tinta + "l de tinta.");
        scanner.close();
    }
    
}
