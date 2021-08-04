package com.henrique.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		System.out.println("Entre com a idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("É menor de idade.");
		}
		*/
		
		// <= 10  barato
		// 10 < valor < 15 - pedir desconto
		// 15 <= valor < 17 - pesquisar mais
		// >= 17 - muito caro
		
		System.out.println("Digite o valor do produto");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("BARATO");
			
		} else if (10 < valor && valor < 15) {
			System.out.println("PEDIR DESCONTO");
			
		} else if (15 <= valor && valor <17) {
			System.out.println("PESQUISAR MAIS");
			
		} else {
			System.out.println("MUITO CARO");
		}
		
	}

}
