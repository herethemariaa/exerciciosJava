package tamanhotela;

import java.awt.Dimension; //armazena largura e altura
import java.awt.Toolkit; //fornece informações do sistema gráfico

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá! Vamos verificar a sua resolução...");

        Toolkit tk = Toolkit.getDefaultToolkit(); // pega as informações da tela
        Dimension d = tk.getScreenSize();         // pega largura e altura através de um objeto

        // mostra na tela
        System.out.println("Tamanho da tela: " + d.width + " x " + d.height);
    }
}
