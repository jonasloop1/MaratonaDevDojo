package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calcularBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
//Em uma classe abstrata pode ter métodos concretos(normais) e abstratos!
//Esse tipo de classe não pode ser instanciada.
//Serve como um template.
//Métodos abstratos só funcionam em classes abstratas.