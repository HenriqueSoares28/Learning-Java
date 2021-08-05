package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex019 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do 1° aluno:");
        String aluno1 = scanner.next();

        System.out.println("Nome do 2° aluno:");
        String aluno2 = scanner.next();

        System.out.println("Nome do 3° aluno:");
        String aluno3 = scanner.next();

        System.out.println("Nome do 4° aluno:");
        String aluno4 = scanner.next();

        String[] alunos = new String[4];
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;

        Random rand = new Random();
        int aluno = rand.nextInt(4);
        
        System.out.println("O aluno sorteado foi " + alunos[aluno]);

        scanner.close();
    }
}
