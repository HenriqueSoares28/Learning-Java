package exercicios;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your full name: ");
        String name = scanner.nextLine();
        System.out.println("Upper case name: " + name.toUpperCase());
        System.out.println("Lower case name: " + name.toLowerCase());
        int num = name.length();
        int counter = 0;

        for( int i=0; i<name.length(); i++ ) {
            if(name.charAt(i) == ' ' ) {
                counter++;
            }
        }
        int spaces = num - counter;
        System.out.println("Letter quantity: " + spaces);
        
        String[] name1 = name.split(" ");
        int lenName1 = name1[0].length();
        System.out.println("Frist name letter quantity: " + lenName1);
        scanner.close();
        
    }
}
