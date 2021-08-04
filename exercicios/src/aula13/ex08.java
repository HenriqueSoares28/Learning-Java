package aula13;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quanto você ganha por hora e quantas horas trabalha por mês: ");
		double ganha =  scan.nextDouble();
		int horas = scan.nextInt();
		double salario = ganha * horas;
		System.out.println("Você recebe R$" + salario + " por mês.");

	}

}
