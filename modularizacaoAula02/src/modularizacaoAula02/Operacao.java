package modularização;

import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int number1, number2, solicitar, resul;
		
		System.out.println("Deseja Somar ou Subtrair? (Responda apenas 1 para somar ou 2 para subtrair");
		solicitar = teclado.nextInt();
		System.out.println("Insira o primeiro número: ");		
		number1 = teclado.nextInt();
		System.out.println("Insira o segundo número: ");
		number2 = teclado.nextInt();
		
	
		if (solicitar == 1) {
			resul = soma(number1, number2);
			System.out.println(resul);
		} 
		
		if (solicitar == 2){
			
			resul = subtracao(number1, number2);
			System.out.println(resul);
		}
		
		
		
	}
	
	
	public static int soma (int number1, int number2) {
		int resultado;
		
		resultado = number1 + number2;
		return resultado;
		
	}
	public static int subtracao (int number1, int number2) {
		int resultado;
		resultado = number1 - number2;
		return resultado;
	}
		

	}
