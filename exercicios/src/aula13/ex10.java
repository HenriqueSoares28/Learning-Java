package aula13;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em °C: ");
		int temp = scan.nextInt();
		double fahrenheit = temp * 9 / 5 +32;
		System.out.println(temp + "°C é igual a " + fahrenheit + "°F.");
		
	}

}