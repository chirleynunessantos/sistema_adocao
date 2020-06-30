package PessoaDao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;



public class EBadotar implements Iquery{

	public void pesquisarPet() throws SQLException {
		
		Connection con ;
		boolean conectado = false;
		
		try {
			
			con = ConnectionManager.getInstance().getConnection();
			conectado = true;
			
			 CallableStatement st = con.prepareCall(BUSCAR_PET);
			
		} finally {
			// TODO: handle finally clause
		}
		
	}
}
