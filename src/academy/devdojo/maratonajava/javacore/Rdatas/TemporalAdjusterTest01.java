package academy.devdojo.maratonajava.javacore.Rdatas;
// * @Jonas Silva
// * @Jonasloop1@gmail.com
// * @param Objetivo é criar método onde retorne o próximo dia util quando cair na sexta, sábado e domingo;
// *
// *

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println("\nRetorna o próximo dia útil: " + now);
        System.out.println("Retorna o dia da semana: " + now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(18).with(new ObterProximoDiaUtil());
        System.out.println("\nRetorna o próximo dia útil, quando cai final de semana: " + now);
        System.out.println("Retorna o dia da semana: " + now.getDayOfWeek());
    }
}