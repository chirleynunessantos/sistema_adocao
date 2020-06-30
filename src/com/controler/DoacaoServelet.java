package com.controler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import PessoaDao.EBPessoa;
import br.com.adocao.model.Endereco;
import br.com.adocao.model.Pessoa;
import PessoaDao.EBPessoa;



/**
 */
@WebServlet(name="DoacaoServelet", urlPatterns = {"/DoacaoServelet"})
public class DoacaoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("index.jsp");
		response.sendRedirect("servicos.jsp");


	System.out.println("aqui");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			Pessoa p = new Pessoa();
			EBPessoa eb =  new EBPessoa();
			
			p.setNome(request.getParameter("nome"));
			p.setCpf(request.getParameter("cpf"));
			p.setEmail(request.getParameter("email"));
			p.setUsuario(request.getParameter("usuario"));
			p.setSenha(request.getParameter("senha"));

			p.setEstado(request.getParameter("estado"));

		
			eb.salvarPessoa(p);
			
			//request.getSession().setAttribute("pessoa", p);
			
			Endereco e = new Endereco();
			e.setUsuario(request.getParameter("usuario"));
			e.setCpf(request.getParameter("cpf"));
			e.setCep(request.getParameter("cep"));
			e.setBairro(request.getParameter("bairro"));
			e.setCidade(request.getParameter("cidade"));
		
			e.setLogradouro(request.getParameter("rua"));
			e.setNumero(request.getParameter("numero"));
			e.setUf(request.getParameter("uf"));
			
			eb.salvarEndereco(e);
			System.out.println("passou do metodo q chama o endereco");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		response.sendRedirect("index.jsp");
		System.out.println("passou do index");
	}



}