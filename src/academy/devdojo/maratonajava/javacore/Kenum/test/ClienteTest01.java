package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Douglas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Embrapa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("Desconto de: " + TipoPagamento.CREDITO.calcularDesconto(230)+" no crédito");
        System.out.println("Desconto de: " + TipoPagamento.DEBITO.calcularDesconto(230)+" no débito");

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println("Usando ValueOf(): "+tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println("Usando um método estático da classe TipoCliente: "+tipoCliente1);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física123");
        System.out.println("Usando um valor inválido: "+tipoCliente2);
    }
}
