package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * / Operadores Aritméticos:
        int num1 = 10;
        int num2 = 20;
        double num3 = 10;
        double num4 = 23;
        int resultado1 = num1 + num2;
        double resultado2 = num4 / num3;
        System.out.println("\nOperadores Aritméticos:");
        System.out.println("Soma de números: " + resultado1);
        System.out.println("Divisão de números: " + resultado2);

        // % Operadores Relacionais 1:
        int resto = 20 % 2;
        int resto1 = 21 % 6;
        System.out.println("\nOperadores Relacionais 1:");
        System.out.println("Divisão entre números para encontrar o resto: " + resto);
        System.out.println("Divisão entre números para encontrar o resto: " + resto1);

        // < > <= >= == != Operadores Relacionais 2 - retonar valores booleanos:
        boolean isDezMaiosQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezIgualDez = 10 == 10;
        System.out.println("\nOperadores Relacionais 2:");
        System.out.println("isDezMaiosQueVinte: " + isDezMaiosQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte: " + isDezDiferenteVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezMaiorIgualQueVinte: " + isDezMaiorIgualQueVinte);
        System.out.println("isDezMenorIgualVinte: " + isDezMenorIgualVinte);

        // && || ! Operadores Lógicos:
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("\nOperadores Lógicos AND(&&) e OR(||):");
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalDaContaCorrente = 200;
        double valorTotalDaContaPoupanca = 10000;
        float valorTotalPs5 = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalDaContaCorrente > valorTotalPs5 || valorTotalDaContaPoupanca > valorTotalPs5;
        System.out.println("Consigo compra um PS5? " + isPlaystationCincoCompravel);

        // = += -= *= /= %= Operadores Atribuições:
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("\nOperadores de Atribuições:");
        System.out.println("Valor usando operadores de atribuição: " + bonus);

        // Valores de incrementação e decrementação -- ++
        int contador = 0;
        int contador2 = 0;
        contador++;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println("\nOperadores de incremento e decremento:");
        System.out.println("Resultado: " + contador);
        System.out.println("\nExemplo colocando o operador antes e depois:");
        System.out.println("Com o incrementador depois da vareavel: " + contador2++);
        System.out.println("Valor depois do incremento: " + contador2);
    }
}
