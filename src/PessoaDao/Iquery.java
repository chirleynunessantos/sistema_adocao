package PessoaDao;



	public interface  Iquery {
		
		public final String CAMPOS = " NOME , CPF , EMAIL, USUARIO, SENHA, ESTADO";
		
		public final String CAMPOS_ENDERECOS = " USUARIO, CPF ,UF , CIDADE , CEP , BAIRRO , LOGRADOURO , NUMERO";
	
		
		public final String CAMPOS_ANIMAIS = " TIPO , CPF ,  RACA ,  PESO , COR , DATAN , IMAGEM , OBSERVACAO ";
		
		public final String EXISTE = " SELECT  1 FROM PESSOA_BD  WHERE USUARIO = ? AND SENHA = ? ";
		
		public final String PEGAR_CPF = " SELECT NOME , CPF , EMAIL, USUARIO, SENHA, ESTADO FROM PESSOA_BD  WHERE USUARIO = ?";

		public final String PEGAR_ENDERECO_CPF = " SELECT USUARIO, CPF ,UF , CIDADE , CEP , BAIRRO , LOGRADOURO , NUMERO FROM ENDERECO_BD  WHERE USUARIO = ?";

		public final String INCLUIR_ENDERECO = "INSERT INTO ENDERECO_BD ( " + CAMPOS_ENDERECOS + " ) VALUES (? , ? , ? , ?, ? , ? , ?,?)";
		
		public final String ALTERAR_ENDERECO = " UPDATE ENDERECO_BD SET USUARIO = ? ,UF   = ?, CIDADE   = ? , CEP  = ? ,"
				+ " BAIRRO  = ? , LOGRADOURO  = ? , NUMERO  = ? WHERE CPF =  ?";

		public final String EXCLUIR_ENDERECO = " DELETE FROM ENDERECO_BD WHERE CPF = ?" ;
		
		public final String INCLUIR_PESSOA = " INSERT INTO PESSOA_BD (NOME, CPF, EMAIL, USUARIO, SENHA, ESTADO )  VALUES( ? , ? , ? , ? , ? , ?)"; 
		
		public final String ALTERAR_PESSOA = " UPDATE PESSOA_BD SET NOME = ?  , EMAIL = ? , USUARIO = ? , SENHA = ? , ESTADO = ? WHERE CPF = ? ";
		
		public final String BUSCAR_PESSOA = " select NOME, EMAIL, USUARIO, SENHA, ESTADO where CPF = ? ";
		
		public final String EXCLUIR_PESSOA = " DELETE FROM PESSOA_BD WHERE CPF = ? "; 

		public final String SALVAR_PET = " INSERT INTO ANIMAIS ( " + CAMPOS_ANIMAIS + " ) VALUES( ? , ? , ? , ? , ? , ? , ?  , ?)";
		
		public final String BUSCAR_PET = " SELECT  ( " + CAMPOS_ANIMAIS + " FROM ANIMAIS";
		
		public final String EXCLUIR_ANIMAL = " DELETE FROM ANIMAIS WHERE CPF = ? ";
		
		public final String ALTERAR_ANIMAL = " UPDATE ANIMAL SET  RACA = ? , IDADE = ?  , PESO = ?  , COR  = ? , DATAN = ? "
				+ " , IMAGEM  = ? , OBSERVACAO = ?  WHERE CPF = ? ";
		
		public final String BUSCAR_ANIMAL = " SELECT "+ CAMPOS_ANIMAIS +" FROM ANIMAIS WHERE CPF = ? ";
		
	}
