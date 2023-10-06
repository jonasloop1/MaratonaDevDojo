package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "BMW";
        carro1.modelo = "TG 123";
        carro1.ano = 2018;

        carro2.nome = "Ferrari";
        carro2.modelo = "PR 2000";
        carro2.ano = 2020;

        //Referencia para outro espaço de memoria!
        //Porém só pode fazer isso se tiver obejtos com os mesmos tipos de variaveis!
        carro1 = carro2;

        System.out.println("\n"+carro1.nome+", modelo: "+carro1.modelo+", ano: "+carro1.ano);
        System.out.println("\n"+carro2.nome+", modelo: "+carro2.modelo+", ano: "+carro2.ano);
    }
}
