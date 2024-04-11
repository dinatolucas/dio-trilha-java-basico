public abstract class Conta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numConta;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
    	this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numConta = ++SEQUENCIAL;
        this.saldo = 0.0; // Inicializando o saldo
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            System.out.println("Valor inválido para depósito.");
            return false;
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f realizada com sucesso para a conta %d.\n", valor, contaDestino.getNumConta());        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
    
    protected void imprimirInfosComuns() {
		System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numConta);
        System.out.println(cliente);
        System.out.println("Saldo: " + saldo);
        System.out.println("=================================================");
	}
    
    public abstract void imprimirExtrato();
}
