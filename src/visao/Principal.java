package visao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Cliente;
import dominio.Compra;
import dominio.Ingresso;
import persistencia.ClienteDAO;
import persistencia.CompraDAO;
import persistencia.IngressoDAO;

public class Principal {

	public static void main(String[] args) {
		int op, opS, opI, i, idAux, cpf_c;
		Scanner teclado = new Scanner(System.in);
		Ingresso in;
		Cliente c;
		Compra com;
		CompraDAO comDAO = new CompraDAO();
		ClienteDAO cDAO = new ClienteDAO();
		IngressoDAO iDAO = new IngressoDAO();
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		cliente = cDAO.emitirRelatorio();
		/*
		for(i=0; i<cliente.size(); i++) {
			System.out.println("\t"+cliente.get(i).getId()+"\t"+cliente.get(i).getNome()+"\t"+cliente.get(i).getCpf()+"\t"+cliente.get(i).getTelefone());
		}
		/*
		 
		 */
		System.out.println("Menu Principal");	
		System.out.println("--------------------------");
		System.out.println("1  Login");	
		System.out.println("2  Cadastrar");
		opI = teclado.nextInt();
		switch(opI) {
		case 1:
			
			break;
		case 2:
			c = new Cliente();
			System.out.println("Digite um CPF: ");
			c.setCpf(teclado.nextInt());
			teclado.nextLine();
			System.out.println("Digite o nome: ");
			c.setNome(teclado.nextLine());
			System.out.println("Digite o telefone: ");
			c.setTelefone(teclado.nextInt());
			cDAO.cadastro(c);
			System.out.println("Efetuado");
			
			
			break;
		}
		
		do {
			
			System.out.println("Menu Principal");	
			System.out.println("--------------------------");
			System.out.println("1  Comprar Ingresso");	
			System.out.println("2  Desistir do Ingresso");	
			System.out.println("3  Buscar Ingresso");	
			System.out.println("4  Sair do Sistema");	
			op = teclado.nextInt();
			
			switch(op) {
			case 1:
				com = new Compra();
				comDAO = new CompraDAO();
				System.out.println("Digite o cpf: ");
				cpf_c = teclado.nextInt();
				comDAO.comprarIngresso(com, cpf_c);
				break;
				
			case 2:
				System.out.println("Desistir Ingresso");	
				System.out.println("--------------------------");
				System.out.println("1  Buscar pelo Código do Ingresso");	
				System.out.println("2  Voltar ao Menu Principal");
				opS = teclado.nextInt();
				if(opS == 1) {
					System.out.println("deu good");
				}else 
					
				break;
				break;
				
			case 3:
				System.out.println("Busca Ingresso");	
				System.out.println("--------------------------");
				System.out.println("1  Buscar pelo Código do Ingresso");	
				System.out.println("2  Voltar ao Menu Principal");
				opS = teclado.nextInt();
				if(opS == 1) {
					System.out.println("Digite o codigo: ");
					idAux = teclado.nextInt();
					teclado.nextLine();
					in = iDAO.buscarIngresso(idAux);
					if(in == null) {
						System.out.println("Nao achou");
					}else {
						System.out.println("Cod_Ingresso: " + in.getCod_ingresso());
						System.out.println("Atracao: " + in.getAtracao());
						System.out.println("Cod_Cadeira: " + in.getCod_cadeira());

					}
					
				}else 
					
				break;	
			}
			
				
		}while(op!=4);
		
		
	}

}
