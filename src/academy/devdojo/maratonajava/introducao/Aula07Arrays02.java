package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        //char = \u0000 ou ' '
        //boolean = false
        //String = null
        int teste[] = new int[3];
        String teste1[] = new String[3];
        char teste2[] = new char[3];
        boolean teste3[] = new boolean[3];

        teste[0] = 4;
        teste2[2] = 'A';
        teste3[1] = 10 == 10;

        System.out.println("Valores primitivos: " + teste[0] + " - " + teste[1] + " - " + teste[2]);
        System.out.println("Valores de referencias: " + teste1[0] + " - " + teste1[1] + " - " + teste1[2]);
        System.out.println("Valores primitivos: " + teste2[0] + " - " + teste2[1] + " - " + teste2[2]);
        System.out.println("Valores primitivos: " + teste3[0] + " - " + teste3[1] + " - " + teste3[2] + "\n");

        String[] nomesArray = new String[3];

        nomesArray[0] = "Goku";
        nomesArray[1] = "Sasuke";
        nomesArray[2] = "Luffy";

        for (int i = 0; i < nomesArray.length; i++) {
            System.out.println(nomesArray[i]);
        }
    }
}
