package exercicios;

import java.util.Scanner;

public class Ex024b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city were you born? ");
        String city = scanner.nextLine().strip().toUpperCase();
        char[] ch = new char[city.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = city.charAt(i);
        }
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            strB.append(ch[i]);
        }
        String citySanto = strB.toString();
        System.out.println(citySanto);
        System.out.println(citySanto.matches("SANTO"));
        scanner.close();
    }
}
