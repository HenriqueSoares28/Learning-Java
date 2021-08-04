package aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		double area = 2 * Math.PI * raio;
		System.out.println("A área do circulo é: " + df.format(area));

	}

}
