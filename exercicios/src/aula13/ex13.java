package aula13;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quanto você ganha por hora e quantas horas trabalha por mês: ");
		double ganha =  scan.nextDouble();
		int horas = scan.nextInt();
		double salarioMes = ganha * horas;
		double pagouIR = (11 * salarioMes / 100);
		double pagouInss = (8 * salarioMes / 100);
		double pagouSindicato = (5 * salarioMes / 100);
		System.out.println(". R$" + salarioMes);
		System.out.println("a) R$" + pagouInss);
		System.out.println("b) R$" + pagouSindicato);
		System.out.println("c) R$" + (salarioMes - pagouInss - pagouIR - pagouSindicato));
		
		


	}

}
