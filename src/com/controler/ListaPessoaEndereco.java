package com.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PessoaDao.EBPessoa;
import br.com.adocao.model.Pessoa;

public class ListaPessoaEndereco extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private List<Pessoa> pessoa = new ArrayList<Pessoa>();

	private EBPessoa pessoaDao = new EBPessoa();

       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//pessoa = pessoaDao.obterClientes((String) request.getSession().getAttribute("cpf"));

		
		request.getSession().setAttribute("pessoa", pessoa);

		System.out.println("paaaaaaaaaaaassei");
		/*
		request.getSession().setAttribute("cpf", pessoa.getCpf());

		request.getSession().setAttribute("email", pessoa.getEmail());

		request.getSession().setAttribute("usuario", pessoa.getUsuario());

		request.getSession().setAttribute("senha", pessoa.getSenha());

		request.getSession().setAttribute("estado", pessoa.getEstado());

		//response.sendRedirect("Cliente.jsp");

		*/
		
      	}



}