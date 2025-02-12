package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe Period oferece!
 * Trabalha com anos, meses, dias.
 *
 * */
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYear = LocalDate.now().plusYears(2).plusDays(7);

        Period period = Period.between(now,nowAfterTwoYear);
        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(58);
        Period period3 = Period.ofYears(5);

        System.out.println(period);
        System.out.println("Retorna os dia: "+period1);
        System.out.println("Retorna 58 semanas em dias: "+period2);
        System.out.println("Retorna 58 semanas em meses, não dar certo, precisa utilizar a classe chronoUnit: "+period2.getMonths());
        System.out.println("Retorna 58 semanas em meses: "+now.until(now.plusDays(period2.getDays()), ChronoUnit.MONTHS));
        System.out.println("Retorna os anos: "+period3);;

        //Para conseguir retornar 58 semanas em meses, é necessário utilizar a classe chronoUnit
    }
}
