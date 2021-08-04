package aula14;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra");
		
		String letra = scan.next().toLowerCase();
		switch (letra) {
		case("a"):
		case("e"):
		case("i"):
		case("o"):
		case("u"): System.out.println("A letra informada é uma vogal."); break;
			

		default:
			System.out.println("A letra informada é uma consoante.");
			break;
		}
	}

}
