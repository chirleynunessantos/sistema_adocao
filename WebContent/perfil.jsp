<%@page	import ="java.util.List"
		import = "br.com.adocao.model.Animal" 
		import="br.com.adocao.model.Pessoa"
		
		%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meu Perfil</title>
	<link href="style/bootstrap.min.css" rel="stylesheet" type="text/css" />
	
	<link rel="stylesheet" type="text/css" href="style/site.css">
</head>
<body>
	
<nav  class="navbar navbar-expand-sm navbar-dark bg-info">

	<a href="" class="navbar-band">Adocão</a>

	<button class="navbar-toggler" data-toggle="collapse" data-target="#nav-target">
		<span class="navbar-toggler-icon">
			
		</span>
	</button>


	<div class="collapse navbar-collapse" id="nav-target">
	
		<ul class="navbar-nav ml-auto" >
		
			<li class="nav-item">
				<a class="nav-link " href="index.jsp">Home</a>
			</li>
			<li class="nav-item">
				<a class="nav-link"  href="Informacoes.html"></a>
			</li>
		
	</ul>
	
		<form class="form-inline">
		
		<input  type="text" name="">
		<button placeholder="Pesquisar..." class="btn btn-outline-success">OK</button>
	</form>
</div>
	
	</nav>
	
	
	<div id="perfil">



	
</div>

<div id="corpoTelaPerfil">

	<img alt="" class="fotoPerfil" src="perfil.jpg">
</br>

	<% 
	HttpSession sessionn =  request.getSession();

	List <Pessoa> pessoa = (List<Pessoa>)   sessionn.getAttribute("pessoa");
	%>
	<% for(Pessoa p : pessoa) {%>
		<p>Olá <%=p.getNome()%></p>
		
	<%} %>	
</br>
<form method="post" action="Perfil" >
				 <button type="submit" class="btn btn-info " name="cmd" value="perfil">Alterar informações do Perfil</button>
</form>
<%
	


	HttpSession sessiona =  request.getSession();

	List <Animal> animal = (List<Animal>)   sessiona.getAttribute("animal");
	
	
%>
</br></br>
<div id="campoAnimal">
<h3>Seus animais para adoção</h3>
<br>
<table 	style: "text-align: center; width:100px" border="1">
    <tr class="info-td">
        <td> Raça</td>
        <td> Data de Nascimento</td>
        <td> Peso</td>
        <td> Cor</td>
        <td> Observação</td>
    </tr>
    <%for(Animal ani : animal){ %>
    <tr>
        <td ><%=ani.getRaca() %></td>
        <td> <%=ani.getDataNascimento() %> </td>
        <td> <%=ani.getPeso() %> </td>
        <td> <%=ani.getCor() %> </td>
        <td> <%=ani.getObservacao()%> </td>
    </tr>
   <%} %>
</table>
</div>
<br>

</br>



</div>
	

	


</body>
</html>