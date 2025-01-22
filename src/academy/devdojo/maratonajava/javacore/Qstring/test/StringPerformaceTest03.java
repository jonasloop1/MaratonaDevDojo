package academy.devdojo.maratonajava.javacore.Qstring.test;

/*
 * @Jonas Silva
 * @Jonasloop1@gmail.com
 *
 * */
public class StringPerformaceTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();

        System.out.println("\nTempo máximo para executar 1000000 vezes a string no sistema\n");

        System.out.println("Tempo gasto para executar a String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para executar a concatStringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para executar a concatStringBuffer: " + (fim - inicio) + "ms");
    }

    //Codigo para testa a performace de um sistema em tempo de execução usando tipos de String!
    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    //StringBiulder e StringBuffer são parecidos, possuindo os mesmos métodos.
    //Diferença é que StringBiulder foi criado para ambientes multi threds!
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    //StringBiulder e StringBuffer são parecidos, possuindo os mesmos métodos.
    //Diferença é que StringBiulder foi criado para ambientes multi threds!
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
