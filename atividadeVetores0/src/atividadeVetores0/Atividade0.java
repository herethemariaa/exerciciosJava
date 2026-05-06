package atividadeVetores0;

import java.util.Scanner;

public class Atividade0 {
    public static void main(String[] args) {
    	int lista1[],lista2[], lista3[];
    	int solicitar, soma;
    	
    	lista1 = new int [4];
    	lista2 = new int [4];
    	lista3 = new int [4];
    	
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Forme a lista 1: ");
    	
    	for(int i= 0; i<4; i++) {
    		solicitar = teclado.nextInt();
    		lista1[i] = solicitar;
    		
    	}
    	
    	System.out.println("Forme a lista 2: ");
    	for(int i= 0; i<4; i++) {
    		solicitar = teclado.nextInt();
    		lista2[i] = solicitar;
    	}
    	System.out.println("LISTA 1: " + lista1[0] + ", "+ lista1[1] + ", " + lista1[2] + ", " + lista1[3]);
    	System.out.println(" LISTA 2: " + lista2[0] + ", "+ lista2[1] + ", " + lista2[2] + ", " + lista2[3]);


    	for(int i= 0; i<4; i++) {
    		lista3[i] = lista1[i] + lista2[i];
    		System.out.println("A soma de cada índice: " + lista3[i]);
    	}
    	
    	
    	
    	
    }
}
