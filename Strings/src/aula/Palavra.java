package aula;

import java.util.Scanner;

public class Palavra {

	public static void main(String[] args) {
		//criar scanner para solicitar palavra
		//percorrer e separar a palavra pelo método charAt
		//organizar na vertical através dos índices
		
		String palavra;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		
		palavra = teclado.next();
		
		percorrer(palavra);
		
		}
	
	public static void percorrer(String palavra) {
		
		for(int i = 0; i< palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		
	}
}
