package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int idade[] = new int[3];
        idade[0] = 20;
        idade[1] = 21;
        idade[2] = 22;
        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }
        System.out.println(idade[0] + " - " + idade[1] + " - " + idade[2]);
    }
}
