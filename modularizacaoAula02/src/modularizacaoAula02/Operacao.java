package modularizacaoAula02;

import java.util.Scanner;

public class Operacao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int number1, number2, solicitar;
		
		System.out.println("Deseja Somar ou Subtrair? (Responda apenas 1 para somar ou 2 para subtrair");
		solicitar = teclado.nextInt();
		System.out.println("Insira o primeiro número: ");		
		number1 = teclado.nextInt();
		System.out.println("Insira o segundo número: ");
		number2 = teclado.nextInt();
		
	

		
		if (solicitar == 1) {
			soma(number1, number2);
		} if (solicitar == 2){
			subtracao(number1, number2);
		}
	}
	public static void soma (int number1, int number2) {
		int resultado;
		
		resultado = number1 + number2;
		System.out.println(resultado);
		
	}
	public static void subtracao (int number1, int number2) {
		int resultado;
		resultado = number1 - number2;
		System.out.println(resultado);
	}

}

//  Solicite dois números ao usuário e apresente um menu com duas opções: somar e subtrair
// somar: recebe dois números por parâmetro e mostra na tela o resultado da soma.
// subtrair: recebe dois números por parâmetro e mostra na tela o resultado da subtração.