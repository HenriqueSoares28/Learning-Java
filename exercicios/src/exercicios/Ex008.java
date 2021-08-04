package exercicios;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distancia em métros: ");
        double m = scanner.nextInt();
        double km = m/1000;
        double hm = m/100;
        double dam = m/10;
        double dm = m*10;
        double cm = m*100;
        double mm = m*1000;
        System.out.println(km + "km");
        System.out.println(hm + "hm");
        System.out.println(dam + "dam");
        System.out.println(dm + "dm");
        System.out.println(cm + "cm");
        System.out.println(mm + "mm");

        scanner.close();
    }
}
