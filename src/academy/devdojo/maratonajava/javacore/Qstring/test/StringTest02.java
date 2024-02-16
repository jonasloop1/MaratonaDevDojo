package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " goku  ";
        String numeros = "012345";
        System.out.println("\nMÉTODOS IMPORTANTES DA CLASSE STRING:\n");
        System.out.println("Retorna um caractere baseado no indice: "+nome.charAt(4));
        System.out.println("Retorna o tamanho da String: "+nome.length());
        System.out.println("Faz a troca de um caractere por outro: "+nome.replace("g","t"));
        System.out.println("Transforma em minusculo: "+nome.toLowerCase());
        System.out.println("Remove os valores em branco que tem no começo e no fim de um String:"+nome.trim());
        System.out.println("Transforma em maiusculo: "+nome.toUpperCase()+"\n");

        System.out.println("Retorna o tamanho da String: "+numeros.length());
        System.out.println("Retorna o primeiro valor, e o ultimo menos 1: "+numeros.substring(0,4));
        System.out.println("Retorna a String completa a partir do ultimo indice: "+numeros.substring(3, numeros.length()));
        System.out.println("Compara uma referencia com outra: "+numeros.equals(nome));
    }
}
