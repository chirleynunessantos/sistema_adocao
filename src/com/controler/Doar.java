package com.controler;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import PessoaDao.EBDoar;
import br.com.adocao.model.Animal;
import br.com.adocao.model.Pessoa;

@WebServlet(name="Doar", urlPatterns = {"/Doar"})
public class Doar  extends HttpServlet{
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("NO ETODO POST");
		Animal a = new Animal();
		
		HttpSession sessionA =  req.getSession();

		List <Pessoa> valor = (List<Pessoa>)  sessionA.getAttribute("pessoa");

		for(Pessoa p : valor) {
			a.setCpf(p.getCpf());
		}
		
		
		
		a.setTipo(req.getParameter("tipo"));
		
		a.setRaca(req.getParameter("raca"));
		a.setPeso(req.getParameter("peso"));
		a.setCor(req.getParameter("cor"));
		a.setDataNascimento(req.getParameter("dataN"));
		a.setObservacao(req.getParameter("observacao"));
		a.setCaminho(req.getParameter("caminho"));
	try {
		
		EBDoar d = new EBDoar();

		d.salvarPet(a);

		List animal = d.buscarAnimal(a);
		 System.out.println("PASSOU DO BUSCAR ANIMAL");
		req.getSession().setAttribute("animal", animal);

		System.out.println("FEZ SESSAO DE ANIMAL");

		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
		 resp.sendRedirect("perfil.jsp");

	}}
	
	


