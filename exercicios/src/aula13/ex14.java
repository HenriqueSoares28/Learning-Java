package aula13;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Digite a velocidade do dowload em Mbps: ");
		double velocidadeMbps = scan.nextDouble();
		double velocidadeMB = velocidadeMbps / 8;
		double tempoSegundos = tamanhoArquivo / velocidadeMB;
		double tempoMinutos = tempoSegundos / 60;
		System.out.println("O tempo necessário em minutos será de: " + tempoMinutos);
		
	}

}
