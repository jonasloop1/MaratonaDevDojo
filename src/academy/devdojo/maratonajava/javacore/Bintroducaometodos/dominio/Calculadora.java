package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNum() {
        System.out.println(10 + 10);
    }

    public void subtrairNum() {
        System.out.println(21 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    //Formas diferentes, mas com a mesma função!
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNum(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }
}

