package aula13;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor em métros: ");
		double metros = scan.nextDouble();
		System.out.println("O valor digitado em cm é: " + (metros * 100));
	}

}
