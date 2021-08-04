package aula14;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira 2 números para saber o maior deles");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int maior = num1;
		if (num2 > num1) {
			maior = num2;
		}
		
		System.out.println("O maior número é " + maior);
				

	}

}
