package exercicios;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comprimento do cateto oposto: ");
        double catetoOpt = scanner.nextDouble();
        System.out.println("Comprimento do cateto adjacente: ");
        double catetoAdj = scanner.nextDouble();
        double hipotenusa = Math.hypot(catetoAdj, catetoOpt);
        System.out.println("A hipotenusa vai medir " + hipotenusa);
        scanner.close();
    }
}
