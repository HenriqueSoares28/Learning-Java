package exercicios;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String i = scanner.next();

    
        System.out.println("Só tem espaõs? " + i);
        
        /*
        System.out.println("Só tem números? " + i.);
        System.out.println("Só tem letras? " + i.);
        System.out.println("Está em maiusculas? " + i.);
        System.out.println("Está em maiusculas? " + i.);
        System.out.println("É alphanumérico? " + i.);
        System.out.println("Está capitalizada? " + i.);
        */

        scanner.close();
    }
}
