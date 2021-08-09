package exercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a phase: ");
        String phase = scanner.nextLine().strip().toLowerCase();
        int counter = 0;
        for (int i = 0; i<phase.length(); i++) {
            if(phase.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("letter A appears " + counter + " times in the phase ");
        char[] ch = new char[phase.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = phase.charAt(i);
        }
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher(phase);
        int startA = 0;
        while(m.find()) {
            startA = m.start()+1;
            break;
        }
        System.out.println("The frist letter A appears at " + startA + " position.");

        int finalA = 0;
        while(m.find()){
            finalA = m.start();
        }
        System.out.println("The last letter A appears at " + finalA + " position.");
        


        scanner.close();
    }
}
