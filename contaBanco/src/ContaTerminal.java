import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Insira a agência: ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de %.2f reais já está disponível para saque", nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
