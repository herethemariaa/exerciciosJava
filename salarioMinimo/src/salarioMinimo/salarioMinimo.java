package salarioMinimo;

import java.util.Scanner;

public class salarioMinimo {

	public static void main(String[] args) {
		double salarioMinimo;
		double salarioUsuario;
		int resultado;
		
		Scanner calcularSalario = new Scanner(System.in);
		System.out.println("Quanto é um salário mínimo?");
		salarioMinimo = calcularSalario.nextDouble();
		System.out.println("Qual é o seu salário atual?");
		salarioUsuario = calcularSalario.nextDouble();
		resultado = (int) (salarioUsuario/salarioMinimo);
		System.out.println("Você recebe " + resultado + " salários mínimos.");

	}

}
