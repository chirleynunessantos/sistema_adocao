package br.com.adocao.model;

import java.util.Date;

public class Animal {

	private String tipo;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private String raca;
	private String idade;
	private String peso;
	private String cor;
	private String dataNascimento;
	private String caminho;
	private String cpf;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	private String observacao;
	
	
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String string) {
		this.idade = string;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String string) {
		this.peso = string;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String string) {
		this.dataNascimento = string;
	}
	
}
