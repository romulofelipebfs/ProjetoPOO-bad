package dominio;

public class Ingresso {
	
	private int cod_ingresso;
	private int atracao;
	private int cod_cadeira;
	private Compra compra;
	
	public Ingresso() {
		super();
	}

	public Ingresso(int cod_ingresso, int atracao, int cod_cadeira) {
		super();
		this.cod_ingresso = cod_ingresso;
		this.atracao = atracao;
		this.cod_cadeira = cod_cadeira;
	}
	
	public int getCod_ingresso() {
		return cod_ingresso;
	}
	public void setCod_ingresso(int cod_ingresso) {
		this.cod_ingresso = cod_ingresso;
	}
	public int getAtracao() {
		return atracao;
	}
	public void setAtracao(int atracao) {
		this.atracao = atracao;
	}
	public int getCod_cadeira() {
		return cod_cadeira;
	}
	public void setCod_cadeira(int cod_cadeira) {
		this.cod_cadeira = cod_cadeira;
	}
	
	
	
}
