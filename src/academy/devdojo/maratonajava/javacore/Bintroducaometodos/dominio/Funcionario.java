package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double baseSalario : salario) {
            System.out.println("Salario: " + baseSalario);
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salario == null) {
            return;
        }
        for (double somaSalario : salario) {
            media += somaSalario;
        }
        media /= salario.length;
        System.out.println("Media de 3 salarios: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
