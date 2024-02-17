package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest04 {
    public static void main(String[] args) {
        String nome = "jonas silva";
        nome.concat(" carvalho");
        nome.substring(0, 3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("jonas silva");
        sb.append(" carvalho").append(" academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        String substring = sb.substring(0, 2);
        System.out.println(sb);
        System.out.println(substring);
    }
}
