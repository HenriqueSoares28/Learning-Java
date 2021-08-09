package exercicios;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int number = scanner.nextInt();
        double u = number / 1 % 10;  
        double floorU = Math.floor(u);

        double d = number / 10 % 10;  
        double floorD = Math.floor(d);

        double c = number / 100 % 10;  
        double floorC = Math.floor(c);

        double m = number / 1000 % 10;  
        double floorM = Math.floor(m);

        System.out.println("Analizando números: " + number);
        System.out.println("Units: " + (int)floorU);
        System.out.println("Tens: " + (int)floorD);
        System.out.println("Hundreds: " + (int)floorC);
        System.out.println("Thousands: " + (int)floorM);
        scanner.close();
    }
}
