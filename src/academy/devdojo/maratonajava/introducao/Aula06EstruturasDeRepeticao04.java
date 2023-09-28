package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Codição é que o valor da parcela >=1000
        //Usando break;
        double valorCarro = 40000;
        for (int parcelas = 1; parcelas <= valorCarro; parcelas++) {
            double valorParcela = valorCarro/parcelas;
            if (valorParcela < 1000){
                break;
            }
            System.out.println(parcelas+" Parcelas de: R$ "+valorParcela);
        }
    }
}
