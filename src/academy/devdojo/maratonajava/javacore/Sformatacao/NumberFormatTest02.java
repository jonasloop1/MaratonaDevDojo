package academy.devdojo.maratonajava.javacore.Sformatacao;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param
 * */
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(); //Retorna um valor de acordo com sistema
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localePT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000.3232;
        System.out.println("\nFormatação de moedas de acordo com cada pais:\n");
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(4); // seta a quantidade de casas depois da vírgula que nº pode ter!
            System.out.println(numberFormat.getMaximumFractionDigits()); //Retorna o número de casas decimais de centavos
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "￥10,000.6798";

        try {
            System.out.println("\nUtilizando parse de String -> moeda: "+nfa[1].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}