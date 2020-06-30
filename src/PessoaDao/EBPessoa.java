package PessoaDao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.adocao.model.Endereco;
import br.com.adocao.model.Pessoa;


public class EBPessoa implements Iquery {
	

	public  void salvarPessoa(Pessoa p) throws SQLException {
		
		System.out.println("aqui");
		boolean conectado = false;
		Connection con = null;
		
		try {
			 Connection conn = ConnectionManager.getInstance().getConnection();

			 
		    conectado = true;
			
		    System.out.println(conectado);
			 
		
			CallableStatement st = conn.prepareCall(INCLUIR_PESSOA);
			
			System.out.println("PREPAREI A QUERY");
			 
			st.setString(1, p.getNome());
			
			st.setString(2, p.getCpf());

			st.setString(3, p.getEmail());


			st.setString(4, p.getUsuario());
			
			st.setString(5, p.getSenha());
			
			st.setString(6, p.getEstado());

			st.execute();

			
		}finally {
			
		}
	}
	
	
	
	public  void alterarPessoa(Pessoa p) {

		boolean conectado =  false;
		Connection con = null;
		
		try {
			 con = ConnectionManager.getInstance().getConnection();
			 CallableStatement st = con.prepareCall(ALTERAR_PESSOA);

			
			st.setString(1, p.getNome());
			st.setString(2, p.getEmail());
			st.setString(3, p.getUsuario());
			st.setString(4, p.getSenha());
			st.setString(5, p.getEstado());
			st.setString(6, p.getCpf());
			
			st.execute();
		System.out.println("execultou");
		} catch (Exception ex) {

			ex.printStackTrace();

		}
		}
		
		public  void excluirPessoa(Pessoa p) {
			System.out.println("entrou no banco");
			boolean conectado =  false;
			Connection con = null;
			
			try {
				 con = ConnectionManager.getInstance().getConnection();
				 CallableStatement st = con.prepareCall(EXCLUIR_PESSOA);

				
			
				st.setString(1, p.getCpf());
				
				st.execute();
			} catch (Exception ex) {

				ex.printStackTrace();

			}
			System.out.println("excluiu");
			}
		
public  void excluirEndereco(Endereco e) {
			
			boolean conectado =  false;
			Connection con = null;
			
			try {
				 con = ConnectionManager.getInstance().getConnection();
				 
				 CallableStatement st = con.prepareCall(EXCLUIR_ENDERECO);

				 st.setString(1, e.getCpf());
				
				 st.execute();
				 
			} catch (Exception ex) {

				ex.printStackTrace();

			}
			
			}
		
		

	
	public  void salvarEndereco( Endereco e ) throws SQLException {
		

			System.out.println("Entrei em salvar o endreco");
			boolean conectado = false;
			Connection con = null;
		
		try {
			
			Connection conn = ConnectionManager.getInstance().getConnection();
			
			conectado = true;
			
			CallableStatement st = conn.prepareCall(INCLUIR_ENDERECO);
			

			st.setString(1, e.getUsuario());
			
			st.setString(2, e.getCpf());

			st.setString(3, e.getUf());
		                        
			st.setString(4, e.getCidade());
		                        
			st.setString(5, e.getCep());
		                        
			st.setString(6, e.getBairro());
				                
			st.setString(7, e.getLogradouro());
						
			st.setString(8, e.getNumero());	
				
			st.execute();
				
			
}finally {
		
		}
	}
	
	
	public  void alterarEndereco(Endereco  e) {
		

		boolean conectado = false;
		Connection con = null;
	
	try {
		
		Connection conn = ConnectionManager.getInstance().getConnection();

		 
		 conectado = true;
		 System.out.println(conectado);
		 
	
		 CallableStatement st = conn.prepareCall(ALTERAR_ENDERECO);
		
		
		 st.setString(1, e.getUsuario());
		
		st.setString(3, e.getUf());
                        
		st.setString(4, e.getCidade());
                        
		st.setString(5, e.getCep());
                        
		st.setString(6, e.getBairro());
		                
		st.setString(7, e.getLogradouro());
				
		st.setString(8, e.getNumero());	
		
		st.setString(2, e.getCpf());
		
		st.execute();
		
		
	} catch (Exception ex) {

		ex.printStackTrace();

	
	}}
	
	
	
	public List<Pessoa> obterClientes( String a ){

		Pessoa p = new Pessoa();
	
		List<Pessoa> pessoa = new ArrayList<Pessoa>();

		try {

			Connection conn = ConnectionManager.getInstance().getConnection();

			CallableStatement st = conn.prepareCall(BUSCAR_PESSOA);

			st.setString(1, a);

			
			ResultSet rs = st.executeQuery();

			while(rs.next()) {

				p = new Pessoa();
				
			
				
				p.setCpf(rs.getString("CPF"));
				p.setNome(rs.getString("NOME"));
				                   
				p.setEmail( rs.getString ("EMAIL"));
                       
				p.setUsuario( rs.getString("USUARIO"));
	                            
				p.setSenha( rs.getString("SENHA"));
	                             
				p.setEstado( rs.getString("ESTADO"));
	                            
			

				pessoa.add(p);

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return pessoa;

	}
	
	
	public List<Endereco> obterEndereco(){

		Endereco e;

		List<Endereco> endereco = new ArrayList<Endereco>();

		try {

			Connection conn = ConnectionManager.getInstance().getConnection();

			CallableStatement statement = conn.prepareCall("BUSCAR_ENDERECO");

			ResultSet rs = statement.executeQuery();

			while(rs.next()) {
                     
				e = new Endereco();
				
				e.setUsuario(rs.getString("USUARIO"));
				
				e.setCpf(rs.getString("CPF"));
				                 
				e.setUf( rs.getString ("UF"));
                    
				e.setCidade( rs.getString("CIDADE"));
	                         
				e.setCep( rs.getString("CEP"));
	                        
				e.setBairro( rs.getString("BAIRRO"));
	            
				e.setLogradouro( rs.getString("LOGRADOURO"));
                
				e.setNumero( rs.getString("NUMERO"));
			

				endereco.add(e);

			}

		} catch (Exception ex) {

			ex.printStackTrace();

		}

	

		return endereco;

	}
	
}
	

