package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2.000;
        float salarioFloat = 2.500f;
        byte idadeByte = -128;
        short idadeShort = 20;
        char caractere = 87;
        boolean verdadeiro = true;
        boolean falso = false;
        //casting: Não é uma boa prática!
        int idadeCasting = (int) 10000000000L;
        float salarioCasting = (float) 2.500D;

        System.out.println("A idade é: "+idade+" anos");
        System.out.println("A idade é: "+caractere+" anos");
        System.out.println("Exemplo de casting Long para int : "+idadeCasting);
        System.out.println("Casting de um double para float: "+salarioCasting);
    }
}