package exercicios;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o salário do funcionário?");
        double salario = scanner.nextDouble();
        double aumento = salario + (salario * 15/100);
        System.out.println("Um funcionário que ganhava R$" + salario + ", com 15% de aumento,  passa a receber R$" + aumento);
        scanner.close();
    }
}
