package academy.devdojo.maratonajava.javacore.Qstring;

public class StringBuilderTest04 {
    public static void main(String[] args) {
        String nome = "jonas silva";
        nome = nome.concat(" carvalho"); // Para ver a mudança tem que ser feita a referencia, como nesse exemplo!
        nome.substring(0, 3); // Aqui foi criada outra string em memoria pegandoa posição 0,1,2.
        System.out.println("\n" + nome + "\n");

        //StringBuilder é uma classe que trabalha com as String
        StringBuilder sb = new StringBuilder("jonas silva");
        sb.append(" carvalho").append(" academy");
        sb.reverse(); // Inverte a ordem da String
        sb.reverse();
        sb.delete(0, 3); // Apaga os valores de acordo com o indice passado
        System.out.println(sb);

        String substring = sb.substring(0, 15); //Criando outro objeto com os valores do sb
        System.out.println(substring);
    }
}
