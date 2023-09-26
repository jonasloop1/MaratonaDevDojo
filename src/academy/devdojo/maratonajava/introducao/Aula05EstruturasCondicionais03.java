package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo!";
        String mensagemNaoDoar = "Não tenho condições!";
        //(condição) ? verdadeiro : falso;
        String mensagemResultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(mensagemResultado);
    }
}
