package com.controler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.HttpServer;

import PessoaDao.EBLogin;
import PessoaDao.EBPessoa;
import br.com.adocao.model.Endereco;
import br.com.adocao.model.Pessoa;
import br.com.adocao.model.Usuario;

@WebServlet(name ="loginS" , urlPatterns = { "/loginS"})
public class Inicio  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		boolean us ;
		String login =  req.getParameter("usuario");
		String senha = req.getParameter("senha");
		EBLogin eb = new EBLogin();
		EBPessoa ep = new EBPessoa();
		
		 try {
			us =  eb.existeLogin(new Usuario(login, senha));
			
			List meuCpf =  eb.pegarCpf(login) ;
			List meuEndereco = eb.pegarEndereco(login);
		
			
			req.getSession().setAttribute("pessoa", meuCpf);
			
			req.getSession().setAttribute("endereco", meuEndereco);

			HttpSession session =  req.getSession();
			
			List <Pessoa> pessoas = new ArrayList<Pessoa>();

			List <Pessoa> valor = (List<Pessoa>)   session.getAttribute("pessoa");
			
			List <Endereco> endereco = new ArrayList<Endereco>();

			List <Pessoa> pes = new ArrayList();
			
 			for(Pessoa cpf : valor) {
			
 				String cpfPessoa = cpf.getCpf();
			}

		 if(us == true) {
				  resp.sendRedirect("servicos.jsp");
		 }else {
			 resp.getOutputStream().write("<script>alert('Usuário e/ou senha incorretos!');</script>".getBytes());
			System.out.println("Negado");
			 resp.sendRedirect("index.jsp");
	}
		 } catch (SQLException e) {
				e.printStackTrace();
			}

	}
	}




