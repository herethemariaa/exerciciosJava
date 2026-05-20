package vetores2;
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {

        double []listaDeSalarios = new double[10];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira aqui o salário: ");

        for (int i = 0; i < 10; i++) {
            listaDeSalarios[i] = teclado.nextDouble();
        }
        System.out.println("Valores: ");

        double total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(listaDeSalarios[i]);
            total = soma(listaDeSalarios);
        }

        System.out.println("Soma dos Salários = " + total);
        teclado.close();

    }

    public  static double soma(double[]listaDeSalarios){
        double soma = 0;

        for(double salario : listaDeSalarios) {
            soma += salario;
        }

        return soma;
    }


}