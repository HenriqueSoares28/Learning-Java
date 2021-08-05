package exercicios;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ângulo");
        double angle = scanner.nextDouble();
        double angleRad = Math.toRadians(angle);
        double sin = Math.sin(angleRad);
        double cos = Math.cos(angleRad);
        double tan = Math.tan(angleRad);
        System.out.println("O ângulo de " + angle + " tem o SENO de " + sin);
        System.out.println("O ângulo de " + angle + " tem o COSSENO de " + cos);
        System.out.println("O ângulo de " + angle + " tem o TANGENTE de " + tan);

        scanner.close();
    }
}
