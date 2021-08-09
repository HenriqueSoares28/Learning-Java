package exercicios;

import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine().strip().toLowerCase();
        System.out.println("Did your name have Silva? " + name.contains("silva"));
        scanner.close();

    }
}
