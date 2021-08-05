package exercicios;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe a temperatura em °C:");
        int tempCelcius = scanner.nextInt();
        double tempFarenheit = tempCelcius * 1.8 + 32;
        System.out.println("A temperatura de " + tempCelcius + "°C corresponde a " + tempFarenheit + "°F");
        scanner.close();
    }
}
