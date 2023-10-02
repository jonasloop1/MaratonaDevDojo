package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //Outras formas de declarar e inicializar arrays
        //Com Foreach não da para acessar os indices do array
        String[] text = {"Outras formas de inicializar arrays!", "Ai sim!"};
        int[] num = {1, 2, 3};
        int[] num2 = new int[]{1, 2, 3, 4, 5};

        for (String s : text) {
            System.out.println(s);
        }
        for (int j : num) {
            System.out.println(j);
        }
        System.out.println(num[0] + "-" + num[1] + "-" + num[2]);
        System.out.println(num2[0] + "-" + num2[1] + "-" + num2[2] + "-" + num2[3] + "-" + num2[4]);
    }
}
