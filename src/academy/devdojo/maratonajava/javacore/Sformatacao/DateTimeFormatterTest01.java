package academy.devdojo.maratonajava.javacore.Sformatacao;
/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 * @param Objetivo é trabalhar com os métodos que a classe DateTimeFormatter oferece!
 * Format: transformando para uma String
 * Parse: De uma String para um objeto
 * */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("\nVários tipos de formatação pré-definidas:");
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("\nISO_DATE: " + s1);
        System.out.println("BASIC_ISO_DATE: " + s2);
        System.out.println("ISO_LOCAL_DATE: " + s3);

        LocalDate parse1 = LocalDate.parse("2025-02-20", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("20250220", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-02-20", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("\nPassando de String para objeto: ");
        System.out.println("ISO_DATE: " + parse1);
        System.out.println("BASIC_ISO_DATE: " + parse2);
        System.out.println("ISO_LOCAL_DATE: " + parse3);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nVários tipos de formatação pré-definidas 2:");
        String s4 = dateTime.format(DateTimeFormatter.ISO_TIME);
        String s5 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println("\nISO_TIME: " + s4);
        System.out.println("ISO_DATE_TIME: " + s5);
        System.out.println("\n--------------------------------------------");

        //Formatos de datas dos paises:
        //dd/mm/yyyy - Brasil
        //mm/dd/yyyy - EUA
        //YYYY/MM/DD - japão

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBR);
        System.out.println("\nFormato de data BRASIL: " + formatBr);
        LocalDate parseBR = LocalDate.parse("20/02/2025", formatterBR);
        System.out.println("Passando uma String para um objeto: " + parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println("\nFormato de data ALEMANHA: " + formatGR);
        LocalDate parseGR = LocalDate.parse("20.Februar.2025", formatterGR);
        System.out.println("Passando uma String para um objeto: " + parseGR);
    }
}