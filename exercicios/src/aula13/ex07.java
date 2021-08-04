package aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,#.00");
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o valor de um lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = lado * lado;
		double area2 = area * 2;
		System.out.println("A área do quadrado é: " + df.format(area));
		System.out.println("O dobro da área é: " + df.format(area2));
	}

}
