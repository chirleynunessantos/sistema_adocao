package PessoaDao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.adocao.model.Animal;
import br.com.adocao.model.Pessoa;

public class EBDoar implements Iquery {

	public void salvarPet(Animal a ) throws SQLException, ParseException {
		System.out.println("entrei no metodo");

		try {
			
			Connection con = ConnectionManager.getInstance().getConnection();
			
			CallableStatement ps = con.prepareCall(SALVAR_PET);
			
			System.out.println("PREPAROU A QUERY");
			
			ps.setString(1, a.getTipo());
			System.out.println("PASSOU DO TIPO");
			ps.setString(2, a.getCpf());
			System.out.println("PASSOU DO CPF");
			ps.setString(3, a.getRaca());
			ps.setString(4, a.getPeso());
			ps.setString(5, a.getCor());
			ps.setString(6, a.getDataNascimento());
			ps.setString(7, a.getCaminho());
			ps.setString(8, a.getObservacao());

		
			ps.execute();
			System.out.println("execultou o salvar");


			
		} finally {
		}
	}
	
public  void alterarAnimal(Animal a) throws SQLException, ParseException {
		
		System.out.println("aqui");
		boolean conectado = false;
		Connection con = null;
		
		try {
			 Connection conn = ConnectionManager.getInstance().getConnection();

			 
			 conectado = true;
			 System.out.println(conectado);
			 
		
			 CallableStatement ps = conn.prepareCall(ALTERAR_ANIMAL);
			
			 SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");   
			  Date data_aquisicao = new SimpleDateFormat("dd/MM/yyyy").parse( a.getDataNascimento());  
			  String data= formatter.format(data_aquisicao);
			 
			 System.out.println("PREPAREI A QUERY");
			 
				ps.setString(2, a.getRaca());
				ps.setString(3, a.getIdade());
				ps.setString(4, a.getPeso());
				ps.setString(5, a.getCor());
				ps.setString(6,   data);
				ps.setString(7, a.getCaminho());
				ps.setString(8, a.getObservacao());
				ps.setString(1, a.getCpf());


		
			ps.execute();

			
		}finally {
			
		}
	}


public  void excluirAnimal(Pessoa p) throws SQLException, ParseException {
	
	System.out.println("aqui");
	boolean conectado = false;
	Connection con = null;
	
	try {
		 Connection conn = ConnectionManager.getInstance().getConnection();

		 
		 conectado = true;
		 System.out.println(conectado);
		 
	
		 CallableStatement ps = conn.prepareCall(EXCLUIR_ANIMAL);
		
		
		 
		 System.out.println("PREPAREI A QUERY ");
		 
		
		ps.setString(1, p.getCpf());


	
		ps.execute();

		
	}finally {
		
	}
}

public List buscarAnimal(Animal a) throws SQLException, ParseException {
	
	System.out.println("aqui");
	boolean conectado = false;
	Connection con = null;
	
	List <Animal> animal = new ArrayList<Animal>();
	
	try {
		 Connection conn = ConnectionManager.getInstance().getConnection();

		 
		 conectado = true;
		 System.out.println(conectado);
		 
	
		 CallableStatement ps = conn.prepareCall(BUSCAR_ANIMAL);
		
		
		 
		 System.out.println("PREPAREI A QUERY BUSCAR");
		 
		
		ps.setString(1, a.getCpf());

		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			
			a.setCpf(rs.getString("CPF"));
			a.setRaca(rs.getString("RACA"));
			a.setPeso(rs.getString("PESO"));
			a.setCor(rs.getString("COR"));
			a.setDataNascimento(rs.getString("DATAN"));
			a.setCaminho(rs.getString("IMAGEM"));
			a.setObservacao(rs.getNString("OBSERVACAO"));
			
			animal.add(a);
			
		}
				

	
		ps.execute();

		
	}finally {
		
	}
	return animal;
}
	
}
