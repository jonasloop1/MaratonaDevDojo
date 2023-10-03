package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 meses
        //31,28,30,31,30 dias
        int diasMeses[][] = new int[3][3];

        diasMeses[0][0] = 30;
        diasMeses[0][1] = 28;
        diasMeses[0][2] = 31;

        diasMeses[1][0] = 30;
        diasMeses[1][1] = 28;
        diasMeses[1][2] = 31;

        diasMeses[2][0] = 30;
        diasMeses[2][1] = 28;
        diasMeses[2][2] = 31;

        for (int i = 0; i < diasMeses.length; i++) {
            for (int j = 0; j < diasMeses[i].length; j++) {
                System.out.println(diasMeses[i][j]);
            }
        }
        System.out.println("------- Usando o foreach! -------");

        for (int[] arrBase : diasMeses) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
