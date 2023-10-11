package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for (double baseSalario : salario) {
            System.out.println("Salario: "+baseSalario);
        }
    }

    public void mediaSalario() {
        if (salario == null) {
            return;
        }
        double media = 0;
        for (double somaSalario : salario) {
            media += somaSalario;
        }
        media /= salario.length;
        System.out.println("Media de 3 salarios: " + media);
    }
}
