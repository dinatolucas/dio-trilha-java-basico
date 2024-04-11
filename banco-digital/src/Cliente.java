import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	
	public Cliente(String nome, String cpf, String endereco, String telefone) {
	this.nome = nome;
	this.cpf = cpf;
	this.endereco = endereco;
	this.telefone = telefone;
	}
		
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String toString() {
	    return "Cliente: " + nome + "\n" +
	           "CPF: " + cpf + "\n" + 
	           "Endereco: " + endereco + "\n" +
	           "Telefone: " + telefone + "\n";
	}
	
	public static Cliente criarNovoCliente(Scanner sc) {
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        System.out.println("Deseja adicionar o Endereço e o Telefone? (Y ou N)");
        String opcao = sc.nextLine();
        if (opcao.equals("Y")) {
	        System.out.print("Digite o endereço do cliente: ");
	        String endereco = sc.nextLine();
	        System.out.print("Digite o telefone do cliente: ");
	        String telefone = sc.nextLine();
	        return new Cliente(nome, cpf, endereco, telefone);
        }else {
        return new Cliente(nome, cpf);}
    }
	
	

}
