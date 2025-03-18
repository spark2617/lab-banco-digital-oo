public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS = 0.05;  // 5% de juros ao mês

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    public void aplicarJuros() {
        saldo += saldo * TAXA_JUROS;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
