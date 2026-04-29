// ALUNAS: Maria Eduarda Alves de Melo e Sofia Brito

package voto;

import java.util.Scanner;

public class ObrigatoriedadeDeVoto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		String categoria;
		
		System.out.println("Digite a sua idade para verificar a obrigatoriedade do voto: ");
		idade = teclado.nextInt();
		categoria = voto(idade);
		
		System.out.println(categoria);
		
		}

	

public static String voto(int idade) {
	String categoria;
	
	if (idade >=0 && idade <= 15) {
		categoria = "Sem permissão para votar";
		return categoria;
	} else if ((idade >= 16 && idade <= 17)|| (idade >=65 && idade <= 130)) {
		categoria = "Voto facultativo";
		return categoria;
	}else if (idade >= 18 && idade <= 64){
		categoria = "Voto obrigatório";
		return categoria;
	} else {
		categoria = "Idade inválida";
	}
	return categoria;
	
	}
}
