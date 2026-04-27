package modularizacao;
import java.util.Scanner;
public class CalcularAreaTriangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double base = 0, altura = 0, solicitar;
		
		System.out.println("====== CALCULAR ÁREA ======");
		System.out.println("Bem vindo(a)! Deseja Calcular a área do triângulo? (Caso deseje prosseguir, digite apenas 1. Caso deseje encerrar, digite apenas 0");
		 solicitar = teclado.nextDouble();
		 
		 if (solicitar == 1) {
			    
			    System.out.println("MEDIDA DA BASE: ");
			    base = teclado.nextDouble();
			    System.out.println("MEDIDA DA ALTURA: ");
			    altura = teclado.nextDouble();
			    
			    
			    areaDoTriangulo(base, altura); // chama o calculo e tudo q acontece dentro do método citado.
			    
			} else if (solicitar == 0) {
			    System.out.println("Programa Encerrado.");
			}

		
	}
	
	public static void areaDoTriangulo(double base, double altura) {
		
		double area;
		
		area = (base * altura)/2;
		
		System.out.printf("A medida da área do triângulo é igual a %2f", area);
	} 

}
