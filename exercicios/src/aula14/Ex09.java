package aula14;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira 3 númneros");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int primeiroNum = num1;
		int segundoNum = num1;
		int terceiroNum = num1;
	
		//Define o primeiro número (maior)
		if (num2 > primeiroNum) {
			primeiroNum = num2;	
		}
		
		if(num3 > primeiroNum) {
			primeiroNum = num3;
		}
		
		
		//Define o terceiro número (menor)
		if (num2 < terceiroNum) {
			terceiroNum = num2;
		}
		
		if(num3 < terceiroNum) {
			terceiroNum = num3;
		}
		
		//Define o número do meio
		if (num2 < primeiroNum && num2 > terceiroNum) {
			segundoNum = num2;
		}
		
		if (num3 < primeiroNum && num3 > terceiroNum) {
			segundoNum = num3;
		}
		
		System.out.println("A ordem decrescente dos números é " + primeiroNum + ", " + segundoNum + ", " + terceiroNum);

		
		
	}

}
