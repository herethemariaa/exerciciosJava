package criarLista;
import java.util.Scanner;
public class ListaDeValores {
    public static void main(String[] args){
        int[] listaVazia = new int[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 5 valores: ");

        for (int i = 0; i<5;i++){ // primeiro fazemos um for para armazenar os valores  enquanto percorre a lista
            listaVazia[i] = teclado.nextInt();

        }
        System.out.println("Valores Digitados: ");
        for (int i = 0; i<5;i++){
            System.out.println(listaVazia[i]); //esse é o loop que vai mostrar os valores
        }
        comparar(listaVazia);
        media(listaVazia);

        teclado.close();
    }

    public static void comparar(int[] listaVazia){
        int maior = listaVazia[0], menor = listaVazia[0];

        for (int i = 0; i < listaVazia.length; i++){
            if (listaVazia[i] > maior){
                maior = listaVazia[i];
            }

            if (listaVazia[i] < menor){
                menor = listaVazia[i];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }

    public static void media(int[] listaVazia){

        int soma = 0;
        for(int i = 0; i <listaVazia.length; i++){
            soma += listaVazia[i];
        }

        double media = soma / listaVazia.length;

        System.out.println("Média: " + media);


    }

}