package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprimir todos numeros pares de 0 a 10000
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0){
                System.out.println("Numeros pares: "+i);
            }
        }
    }
}
