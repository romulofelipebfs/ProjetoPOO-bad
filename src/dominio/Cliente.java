package dominio;

public class Cliente {
	private long cpf;
	private String nome;
	private int telefone;
	private String senha;
	
	public Cliente() {
		
	}
	
	
	public Cliente(long l, String nome, int telefone, String senha) {
		super();
		this.cpf = l;
		this.nome = nome;
		this.telefone = telefone;
		this.senha = senha;
		
	}
	
	
	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public long getCpf() {
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
