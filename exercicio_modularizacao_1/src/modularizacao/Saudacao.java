package modularizacao;
import java.util.Scanner;
public class Saudacao {

    public static void main (String[] args){
        exibirSaudacao();
    }

    public static void exibirSaudacao(){
        String nome;
        int horaDoDia;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");

        nome = teclado.next();
        System.out.println("Que horas são? ");
        horaDoDia = teclado.nextInt();

        if (horaDoDia >= 5 && horaDoDia <= 12){
            System.out.println("Bom dia, " +nome);
        } if (horaDoDia >= 13 && horaDoDia <= 18){
            System.out.println("Boa tarde, " +nome);
        }

        if (horaDoDia >= 19 || horaDoDia <= 4){
            System.out.println("Boa noite, " + nome);
        }
    }

}
