package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dominio.Compra;

public class CompraDAO {
	Conexao c;
	private String REL = "select * from compra";
	private String COM = "insert into compra(data, valor, fk_cliente) values('2022-07-25', 80.00, ?)";
	
	public CompraDAO() {
		c = new Conexao("jdbc:postgresql://localhost:5432/ProjetoPOO","postgres","postgres");
	}

	public void comprarIngresso(Compra com, int cpf_c) {
		
		try {	
			c.conectar();
			PreparedStatement instrucao = c.getConexao().prepareStatement(COM);
			//ResultSet rs = instrucao.executeQuery(REL);
			instrucao.setInt(1, cpf_c);
			instrucao.execute();
			//com = new Compra(rs.getString("data"), rs.getFloat("valor"));
			c.desconectar();
		}catch(Exception e) {
			System.out.println("Compra não feita");
		}
	}
	
}
