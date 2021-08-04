package aula14;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu sexo: [M/F]");
		String sexo = scan.next().toUpperCase();
		
		if (sexo.equals("M")) {
			System.out.println("Seu sexo é masculino");
			
		}else if (sexo.equals("F")) {
			System.out.println("Seu sexo é feminino");
			
		}else {
			System.out.println("Sexo inválido");
		}
		
		
	}

}
