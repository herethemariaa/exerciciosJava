package modularizacao;
import java.util.Scanner;


public class Temperatura {

    public static void main(String [] args){
        celsiusParaFahrenheit();
    }

    public static void celsiusParaFahrenheit(){
        double tempGraus, F;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Temp: ");

        tempGraus = teclado.nextDouble();

        F = (tempGraus * 1.8) + 32;
        System.out.println(F);

    }
}
