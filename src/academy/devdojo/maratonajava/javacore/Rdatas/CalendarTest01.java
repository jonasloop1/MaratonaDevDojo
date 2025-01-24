package academy.devdojo.maratonajava.javacore.Rdatas;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 *
 * */
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        //Classe criada para resolver alguns problemas que a classe Date não estava dando conta!
        //Classe abstrata, não pode ser instânciada com o NEW!
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) { //Pegar o primeiro dia da semana
            System.out.println("Domingão é o primeiro dia da semana!!");
        }
        System.out.println("Primeiro dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Primeiro dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Primeiro dia do ano: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Primeiro dia da semana no mês: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "\n");

        c.add(Calendar.DAY_OF_MONTH, 2); //Adiciona 2 dias na data atual do sistema
        c.add(Calendar.HOUR, 2); //Adiciona horas no horário atual do sistema

        Date date = c.getTime();
        System.out.println(date);
    }
}
