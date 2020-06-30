package PessoaDao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.adocao.model.Endereco;
import br.com.adocao.model.Pessoa;
import br.com.adocao.model.Usuario;

public class EBLogin implements Iquery {

	
	public boolean  existeLogin(Usuario us) throws SQLException {
	
		Connection con = null;
		boolean conectado = false;
		
		ResultSet rs  =   null;
		try {
			con = ConnectionManager.getInstance().getConnection();
			conectado = true;
			
			CallableStatement call = con.prepareCall(EXISTE);
			
			call.setString(1, us.getLogin());
			call.setString(2, us.getSenha());
			
			rs = call.executeQuery();
			

			return rs.next();
			
	
	
		} finally {
			if (conectado) {
			
			}
		}
		
		
		
		
		
	}
	
	
	public List  pegarCpf(String login) throws SQLException {
	
		Pessoa p;
		List <Pessoa> pessoa = new ArrayList<Pessoa>();
		
		Connection con = null;
		boolean conectado = false;
		
		ResultSet rs  =   null;
		try {
			con = ConnectionManager.getInstance().getConnection();
			conectado = true;
			
			CallableStatement call = con.prepareCall(PEGAR_CPF);
			
			call.setString(1, login);
			
			rs = call.executeQuery();
			
			while (rs.next()) {
				p = new Pessoa();

				p.setCpf(rs.getString("CPF"));
			
				p.setNome(rs.getString("NOME"));
				
				p.setEmail(rs.getString("EMAIL"));
				
				p.setUsuario( rs.getString("USUARIO"));
                
				p.setSenha( rs.getString("SENHA"));
	                             
				p.setEstado( rs.getString("ESTADO"));
				
			
				pessoa.add(p);
			}
			
			
		} finally {
			if (conectado) {
			
			}
		}
	
		return pessoa;}
	


public List  pegarEndereco(String login) throws SQLException {
	
	Endereco e;
	List <Endereco> endereco = new ArrayList<Endereco>();
	
	Connection con = null;
	boolean conectado = false;
	
	ResultSet rs  =   null;
	try {
		con = ConnectionManager.getInstance().getConnection();
		conectado = true;
		
		CallableStatement call = con.prepareCall(PEGAR_ENDERECO_CPF);
		
		call.setString(1, login);
		
		rs = call.executeQuery();
		
		while (rs.next()) {
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
		
		
	} finally {
		if (conectado) {
		
		}
	}

	return endereco;}

}
	

