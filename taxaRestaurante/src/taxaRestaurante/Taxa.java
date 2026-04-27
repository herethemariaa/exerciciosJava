package taxaRestaurante;

import java.util.Scanner;

public class Taxa {

	public static void main(String[] args) {
		double despesas;
		double total;
		
		Scanner calculoTaxa = new Scanner(System.in);
		System.out.println("Quanto você gastou?");
		despesas = calculoTaxa.nextDouble();
		total = calculoTaxa * (10/100);
		System.out.println();

	}

}
