package com.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="opcoes",urlPatterns = {"/opcoes"})
public class opcoes extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("entrei");
		
	
		//if("doar".equals(cmd)) {
					resp.sendRedirect("doar.jsp");

		//}
	/*
		resp.sendRedirect("index.jsp");
		resp.sendRedirect("adotar.jsp");
		 
		 resp.sendRedirect("cadastro.jsp");
		 */
		
	}
}
