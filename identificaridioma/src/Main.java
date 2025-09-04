package identificaridioma; //organizando códigos

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //public → pode ser acessado de qualquer lugar
        //static → não precisa criar um objeto para executar.
        //void → não retorna nada.
        //String[] args → permite receber argumentos do console

        Locale idioma = Locale.getDefault(); //chamada para o SO mostrar quais os dados da linguagem utilizada(dentro da memória do programa)

        System.out.println("Foi identificado que o seu idioma está em: " +idioma.getDisplayLanguage()); //transfere o idioma para uma forma legível de escrever (alto nível)
        //O objeto Locale é criado na memória RAM do programa quando executa Locale.getDefault().
    }
}