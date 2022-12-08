package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dominio.Cliente;
import dominio.Ingresso;

public class IngressoDAO {
	Conexao c;
	private String BUS = "select * from ingresso where cod_ingresso = ?";
	//private String COM = "insert into compra(data, valor) values('2022-07-25', 80.00)";
	
	
	public IngressoDAO() {
		c = new Conexao("jdbc:postgresql://localhost:5432/ProjetoPOO","postgres","postgres");
	}
	
/*	
	public void comprarIngresso() {
		
		try {
			c.conectar();
			PreparedStatement instrucao = c.getConexao().prepareStatement(COM);
			instrucao.execute();
			
			c.desconectar();
		}catch(Exception e) {
			System.out.println("Compra não feita");
		}
		

		
		
	}
	*/
	
	public Ingresso buscarIngresso(int idAux) {
		Ingresso i = null;
		try {
			c.conectar(); // se conecta com o bd
			PreparedStatement instrucao = c.getConexao().prepareStatement(BUS); // "new" do Statement - cria uma instru��o
			instrucao.setInt(1, idAux);
			ResultSet rs = instrucao.executeQuery();
			if(rs.next()) { //andando no resultset
				i = new Ingresso(rs.getInt("cod_ingresso"), rs.getInt("atracao"), rs.getInt("cod_cadeira"));
				
			}
			c.desconectar(); //se desconecta com o bd
		}catch(Exception e) {
			System.out.println("Erro no relat�rio");
		}
		return i;
		
	}
}
