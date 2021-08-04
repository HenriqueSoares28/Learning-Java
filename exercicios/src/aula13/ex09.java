package aula13;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em °F: ");
		int temp = scan.nextInt();
		double celsius = 5 * (temp - 32) / 9;
		System.out.println(temp + "°F é igual a " + celsius + "°C.");
		
	}

}
