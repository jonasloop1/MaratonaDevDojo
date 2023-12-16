package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Douglas", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Embrapa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Junior", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
