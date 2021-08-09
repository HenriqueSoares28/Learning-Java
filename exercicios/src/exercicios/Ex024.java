package exercicios;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city were you born? ");
        String city = scanner.nextLine().strip().toUpperCase();
        char[] ch = new char[city.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = city.charAt(i);
        }

        String citySanto = (String.valueOf(ch[0]) + String.valueOf(ch[1]) + String.valueOf(ch[2]) + String.valueOf(ch[3]) + String.valueOf(ch[4]));
        System.out.println(citySanto.matches("SANTO"));
        scanner.close();
    }
}
