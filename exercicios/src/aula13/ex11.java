package aula13;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 2 números inteiros e 1 decimal:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		double num3 = scan.nextDouble();
		System.out.println("O produto do dobro do primeiro com a metade do segundo: " + ((num1 * 2) * (num2 / 2)));
		System.out.println("Soma do triplo do primeiro com o terceiro: " + (num1 * 3 + num3));
		System.out.println("Terceito elevado ao cubo: " + Math.pow(num3, 3));

	}

}
