package academy.devdojo.maratonajava.javacore.Sformatacao;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param: Classe locale feita para trabalhar com Internacionalização,
 * Usada para formatar datas, moedas, números...
 * */
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // Essa classe segue parâmetros da ISO 639/ ISO 3166
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Locale localeIngles = new Locale("en", "US");

        Calendar calendar = Calendar.getInstance();
        DateFormat fd1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeIngles);

        System.out.println("\nFormatos de datas de acordo com cada pais:\n");
        System.out.println("Italia: " + fd1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));
        System.out.println("Inglês: " + df6.format(calendar.getTime()));

        System.out.println("\nPega a linguagem do pais de acordo com o sistema operacional:");
        System.out.println("Indiano em japones: "+localeIndia.getDisplayCountry(localeJapao));
        System.out.println("Suiça em inglês: "+localeCH.getDisplayCountry(localeIngles));
        System.out.println("Japones em Indiano: "+localeJapao.getDisplayCountry(localeIndia));
        System.out.println("Holanda: "+localeHolanda.getDisplayCountry());

        System.out.println("\nTraduzindo uma lingua para outra:");
        System.out.println("Japones para indiano: "+localeJapao.getDisplayLanguage(localeIndia));
        System.out.println("Holandes para japones: "+localeHolanda.getDisplayLanguage(localeJapao));
        System.out.println("Japones para ingles: "+localeJapao.getDisplayLanguage(localeIngles));
    }
}