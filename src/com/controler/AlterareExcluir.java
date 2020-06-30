package com.controler;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PessoaDao.EBDoar;
import PessoaDao.EBPessoa;
import br.com.adocao.model.Endereco;
import br.com.adocao.model.Pessoa;

@WebServlet(name="AlterareExcluir", urlPatterns = {"/AlterareExcluir"})


public class AlterareExcluir extends HttpServlet  {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		Pessoa p = new Pessoa();
		EBPessoa eb =  new EBPessoa();
		EBDoar eba = new EBDoar();
		System.out.println("Entrei no post de alterar");
		
		p.setNome(request.getParameter("nome"));
		p.setCpf(request.getParameter("cpf"));
		p.setEmail(request.getParameter("email"));
		p.setUsuario(request.getParameter("usuario"));
		p.setSenha(request.getParameter("senha"));
		p.setEstado(request.getParameter("estado"));
		System.out.println("Antes de chamar o metodo");
		
		Endereco e = new Endereco();
		e.setUsuario(request.getParameter("usuario"));
		e.setCpf(request.getParameter("cpf"));
		e.setCep(request.getParameter("cep"));
		e.setBairro(request.getParameter("bairro"));
		e.setCidade(request.getParameter("cidade"));

		e.setLogradouro(request.getParameter("rua"));
		e.setNumero(request.getParameter("numero"));
		e.setUf(request.getParameter("uf"));


		if(request.getParameter("enviar") != null) {
			
			eb.alterarPessoa(p);
			eb.alterarEndereco(e);
			resp.sendRedirect("perfil.jsp");
		}else 
		
		if(request.getParameter("excluir") != null) {
		
		try {
			eb.excluirEndereco(e);
			eba.excluirAnimal(p);
			eb.excluirPessoa(p);
			resp.sendRedirect("index.jsp");
		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();
		}
	
}
		

		

		

	}
	
		
	
}
