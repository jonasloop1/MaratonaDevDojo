package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario!");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1!");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2!");
    }
    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        System.out.println("Dentro do construtor de funcionário!");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
