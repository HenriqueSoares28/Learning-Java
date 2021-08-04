package aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat("#.0");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58; 
		System.out.println("O peso ideal é: " + df.format(pesoIdeal));

	}

}
