import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar clientes
        Cliente cliente1 = Cliente.criarNovoCliente(sc);
        System.out.println();
        Cliente cliente2 = Cliente.criarNovoCliente(sc);
        System.out.println();

        // Criar contas
        Conta cc1 = new ContaCorrente(cliente1);
        Conta cp1 = new ContaPoupanca(cliente1);
        Conta cc2 = new ContaCorrente(cliente2);
        Conta cp2 = new ContaPoupanca(cliente2);

        // Realizar operações
        cc1.depositar(100);
        cc1.sacar(15);
        cc1.transferir(80, cp1);
        cc1.imprimirExtrato();
        System.out.println();
        cp1.imprimirExtrato();
        System.out.println();
        System.out.println();
        
        cc2.depositar(200);
        cc2.sacar(50);
        cc2.transferir(100, cp2);
        cc2.imprimirExtrato();
        System.out.println();
        cp2.imprimirExtrato();
        System.out.println();
        System.out.println();

        sc.close();
    }
}