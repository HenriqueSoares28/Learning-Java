package aula16_17;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor entre 0  e 10: ");
		double valor = scan.nextDouble();
		while(true){
			if(valor >= 0 && valor <= 10) {
				break;
			}else {
				System.out.println("Valor inválido, digite novamente: ");
				valor = scan.nextDouble();
			}
		}
		
		System.out.println("A nota digitada foi " + valor);
		
	}

}
