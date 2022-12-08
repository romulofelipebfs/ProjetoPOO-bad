package dominio;

public class Cliente {
	private int cpf;
	private String nome;
	private int telefone;
	
	public Cliente() {
		
	}
	
	public Cliente(int cpf, String nome, int telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	   
	
	
	
	
}
