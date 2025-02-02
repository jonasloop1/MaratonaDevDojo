package academy.devdojo.maratonajava.javacore.Sformatacao;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param
 * */

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localePT);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.3232;
        System.out.println("\nFormatação pra números de acordo com cada pais:\n");
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits()); //Retorna o número de casas decimais depois da virgula
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1000.2130";

        try {
            System.out.println("\nUtilizando parse de String -> númerico: " + nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}