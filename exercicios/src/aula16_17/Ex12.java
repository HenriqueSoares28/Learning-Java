package aula16_17;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Digite um valoe entre 1 e 10 para mostrar a tabuada:");
		int valor = scan.nextInt();
		for(int i=1; i < 11; i++) {
			System.out.println(valor + " x " + i + " = " +  (valor * i));
		}
		
		
	}

}
