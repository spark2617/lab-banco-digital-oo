public class ContaCorrente extends Conta {

    private double limiteCredito;

    public ContaCorrente(Cliente cliente, double limiteCredito) {
        super(cliente);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (saldo + limiteCredito)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente, incluindo limite de crédito.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Limite de Crédito: %.2f", limiteCredito));
    }
}
