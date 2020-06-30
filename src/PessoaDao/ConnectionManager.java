package PessoaDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	



		private static ConnectionManager instance;

		private Connection conn;

		private final String conADocaoJava = "jdbc:mysql://localhost:3306/adocao";

		private final String user = "root";

		private final String pass = "Chirley123456";



		private ConnectionManager() {

			try {
				Class.forName("com.mysql.jdbc.Driver");

				System.out.println("Driver Carregado");

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
				System.out.println("nao carregou o drive");

			}

		}



		public static ConnectionManager getInstance() {

			if (instance == null) {

				instance = new ConnectionManager();

			}

			return instance;

		}



		public Connection getConnection() throws SQLException {

			if (conn == null || conn.isClosed()) {

				conn = DriverManager.getConnection(conADocaoJava , user, pass);

				System.out.println("Gerada uma nova conexão");

			} else {

				System.out.println("Reusando uma conexão existente");

			}

			return conn;

		}

	}

