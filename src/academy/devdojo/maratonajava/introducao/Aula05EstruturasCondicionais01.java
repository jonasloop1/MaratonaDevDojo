package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoBebidaAlcolica = idade >= 18;

        if (isAutorizadoBebidaAlcolica) {
            System.out.println("Autorizado a comprar bebida alcólica!");
        }
        if (!isAutorizadoBebidaAlcolica) {
            System.out.println("Proibido comprar bebida alcólica!");
        }
        boolean c = true;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito!");
        }
        System.out.println("Fora do if.");
    }
}
