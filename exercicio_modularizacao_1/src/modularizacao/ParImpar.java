package modularizacao;
import java.util.Scanner;


public class ParImpar {
    public static void main(String [] args){
    System.out.println(ePar());

    }

    public static boolean ePar(){
        int number;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número: ");
        number = teclado.nextInt();

        return number %2 == 0;
    }
}
