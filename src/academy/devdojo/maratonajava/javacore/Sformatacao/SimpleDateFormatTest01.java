package academy.devdojo.maratonajava.javacore.Sformatacao;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com formatação de datas de forma mais flexivel
 * */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MM 'de' yyyy";  //Aspas simples serve para ignorar o valores e envia o texto puro
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        //caso queira fazer ao contrario utilizando o PARSE() tem que tomar cuidado,
        //pois tem que seguir o mesmo texto que você passou na String pattern

        try {
            System.out.println(sdf.parse("Amsterdam 01 de 02 de 2025")); //Pega o que você tem na String pattern e transforma em um Date padrão que o sistema oferece
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}