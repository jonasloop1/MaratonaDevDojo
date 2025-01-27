package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.util.Locale;

public class LocaleTest02 {
    public static void main (String[] args){
        System.out.println("\nEstá configurado o sistema do computador em: "+Locale.getDefault()+"\n");//Retorna como está configurado o sistema do computador

        String[] isoCountries = Locale.getISOCountries(); // Paises suportadas
        String[] isoLanguages = Locale.getISOLanguages(); // Linguas suportadas

        for (String isoCountry: isoCountries){
            System.out.print(isoCountry+" ");
        }
        System.out.println("\n");
        for (String isoLanguage: isoLanguages){
            System.out.print(isoLanguage+" ");
        }
    }
}
