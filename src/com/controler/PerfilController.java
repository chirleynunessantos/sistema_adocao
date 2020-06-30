package com.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.nio.sctp.SendFailedNotification;

import PessoaDao.EBPessoa;
import br.com.adocao.model.Pessoa;

@WebServlet(name="Perfil", urlPatterns = {"/Perfil"})

public class PerfilController extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.sendRedirect("alterarexcluir.jsp");
		
	

	}
	
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("entrei");
		
		resp.sendRedirect("perfil.jsp");
		
	
	}

}
