package br.com.adocao.model;

public class Endereco {

	public String getCep() {

		return cep;

	}
	private String cpf;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCep(String cep) {

		this.cep = cep;

	}

	public String getLogradouro() {

		return logradouro;

	}

	public void setLogradouro(String logradouro) {

		this.logradouro = logradouro;

	}

	public String getNumero() {

		return Numero;

	}

	public void setNumero(String numero) {

		Numero = numero;

	}

	public String getBairro() {

		return Bairro;

	}

	public void setBairro(String bairro) {

		Bairro = bairro;

	}



	public String getCidade() {

		return cidade;

	}

	public void setCidade(String cidade) {

		this.cidade = cidade;

	}

	public String getUf() {

		return uf;

	}

	public void setUf(String uf) {

		this.uf = uf;

	}

	private String logradouro = "";

	private String Numero = "";

	private String Bairro = "";


	private String cidade = "";

	private String uf = "";

	private String cep = "";
	
	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


}

