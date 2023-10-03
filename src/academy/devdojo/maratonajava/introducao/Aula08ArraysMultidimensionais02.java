package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2};
        arrayInt[0] = array;
        arrayInt[1] = new int[]{3, 4, 5};
        arrayInt[2] = new int[]{6, 7, 8, 9};

        int[][] arrayInt2 = {{0, 1}, {1, 2, 3, 4}, {1, 2, 3, 4, 5, 6, 7, 8}};

        System.out.println("\nTipos de Inicialização Arrays Multidimensionais");
        for (int[] arrBase2 : arrayInt2) {
            System.out.println("\n------");
            for (int num2 : arrBase2) {
                System.out.print(num2+" ");
            }
        }
        System.out.println("\n\nOutros Tipos de Inicialização");
        for (int[] arrBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
