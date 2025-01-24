package academy.devdojo.maratonajava.javacore.Qstring;

public class StringTest01 {
    public static void main(String[] args) {
        //Strings são imutáveis!!!
        String nome = "jonas"; //String pool (piscina de String)
        String nome2 = "jonas";

        nome = nome.concat(" silva");// nome += " silva";

        System.out.println(nome);
        System.out.println(nome == nome2); //comparar as referencias, não o valor em si.

        String nome3 = new String("jonas"); //1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de String
        System.out.println(nome3 == nome2);
        System.out.println(nome3.intern() == nome2);//intern() método que retornar uma representação canonica do objeto, e pega a referencia dentro do pool de String
    }
}
