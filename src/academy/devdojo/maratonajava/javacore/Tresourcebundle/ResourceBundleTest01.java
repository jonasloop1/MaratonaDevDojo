package academy.devdojo.maratonajava.javacore.Tresourcebundle;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe ResourceBundle oferece!
 * ResourceBundle é uma forma de internacionalizar as mensagens de uma aplicação.
 * .properties é um arquivo onde tem as propriedades separadas em chave valor, únicas para poder identificar o valor;
 * */

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println("\nLinguagem do sistema: " + Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        String heloBR = bundle.getString("helo");
        String goodMorningBR = bundle.getString("good.morning");
        String gokuBR = bundle.getString("goku");
        System.out.println("\n" + heloBR);
        System.out.println("" + goodMorningBR);
        System.out.println("" + gokuBR);

        System.out.println("\nEx.: Vamos supor que o usuário que internacionalizar todas as mensagens da suas aplicação em inglês!");
        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        String heloUS = bundle.getString("helo");
        String goodMorningUS = bundle.getString("good.morning");
        String gokuUS = bundle.getString("goku");
        System.out.println("\n" + heloUS);
        System.out.println("" + goodMorningUS);
        System.out.println("" + gokuUS);
    }
}