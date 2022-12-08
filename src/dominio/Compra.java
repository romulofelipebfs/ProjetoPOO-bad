package dominio;

public class Compra {
	private int id;
	private String data;
	//private String formasPag;
	private float valor;
	//private String tipoCompra;
	private int fk_cliente;
	
	
	public Compra() {
		
	}
	

	public Compra(int id, String data, float valor, int fk_cliente) {
		super();
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.fk_cliente = fk_cliente;
	}






	public int getFk_cliente() {
		return fk_cliente;
	}

	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	/*
	public String getFormasPag() {
		return formasPag;
	}
	public void setFormasPag(String formasPag) {
		this.formasPag = formasPag;
	}
	*/
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	/*
	public String getTipoCompra() {
		return tipoCompra;
	}
	public void setTipoCompra(String tipoCompra) {
		this.tipoCompra = tipoCompra;
	}
	*/
	
	
}
