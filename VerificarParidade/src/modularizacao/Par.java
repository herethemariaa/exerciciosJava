package modularizacao;
import java.util.Scanner;
public class Par {

	public static void main(String[] args) {
		
		for(int i = 0; i <=20; i++) {
			System.out.println("O número " + i + " é par? ");
			ehPar(i);
			
			
		}
	}
	
	public static void ehPar(int identificador) { //parametro

		if (identificador %2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
