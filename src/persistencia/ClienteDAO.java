package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dominio.Cliente;

public class ClienteDAO {
	Conexao c;
	private String REL = "select * from cliente";
	private String INC = "insert into cliente(cpf, nome, telefone) values(?,?,?)";
	
	public ClienteDAO() {
		c = new Conexao("jdbc:postgresql://localhost:5432/ProjetoPOO","postgres","postgres");
	}
	
	public ArrayList<Cliente> emitirRelatorio() {
		Cliente pessoa;
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		try {
			c.conectar(); // se conecta com o bd
			Statement instrucao = c.getConexao().createStatement(); // "new" do Statement - cria uma instru��o
			ResultSet rs = instrucao.executeQuery(REL);
			while(rs.next()) { //andando no resultset
				pessoa = new Cliente(rs.getLong("cpf"), rs.getString("nome"), rs.getInt("telefone"), rs.getString("senha"));
				lista.add(pessoa);
			}
			c.desconectar(); //se desconecta com o bd
		}catch(Exception e) {
			System.out.println("Erro no relat�rio");
		}
		return lista;
		
	}
	
	public void cadastro(Cliente pessoa){
		try {
			c.conectar();
			PreparedStatement instrucao = c.getConexao().prepareStatement(INC);
			instrucao.setLong(1, pessoa.getCpf());
			instrucao.setString(2, pessoa.getNome());
			instrucao.setInt(3, pessoa.getTelefone());
			instrucao.execute();
			c.desconectar();
		}catch(Exception e) {
			System.out.println("Inclusao erro");
		}
		
	}
	
}
