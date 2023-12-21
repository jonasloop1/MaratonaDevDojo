package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    //Método que foi criado somente para ser sobrescrito, ou seja, não pode ter um corpo com atributos!
    public abstract double calcularDesconto(double valor);
}