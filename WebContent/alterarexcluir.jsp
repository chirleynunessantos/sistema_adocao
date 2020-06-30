
<%@page import="br.com.adocao.model.Pessoa"

		import=" PessoaDao.EBPessoa"
		import ="java.util.List"
		import = "br.com.adocao.model.Endereco"
%>

<% 

	
			EBPessoa eb =  new EBPessoa();
		
			HttpSession sessionA =  request.getSession();

			
			
			List <Pessoa> valor = (List<Pessoa>)   session.getAttribute("pessoa");
			List <Endereco> ende = (List<Endereco>)   session.getAttribute("endereco");


%>

<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste</title>
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
		
			
		


			<li class="nav-item dropdown" >
				<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="servicos.jsp" >Serviços</a>
				<div class="dropdown-menu" >
					<a href="adocao.html" class="dropdown-item">quero adotar</a>
					<a href="adocar.html" class="dropdown-item">quero doar</a>
				</div>
		</li>
	</ul>
	
		<form class="form-inline">
		
		<input  type="text" name="">
		<button placeholder="Pesquisar..." class="btn btn-outline-success">OK</button>
	</form>
</div>
	
	</nav>
	
	<div id="corpoCadastro">
	
	<h1 class=" bg-info"id="tituloF">Suas informações</h1>
		<div id="formulario">
			<form method="post" action="AlterareExcluir">
		
			<%for(Pessoa cpf : valor) {%>
			<div class="form-group">
				<label for="cpf">CPF</label>
					<input class="form-control" type="text" id="cpf" name="cpf"  placeholder="Digite o seu cpf" value="<%=cpf.getCpf() %>">
			</div>
				<div class="form-group">
				<label for="email">NOME</label>
					<input class="form-control" type="text" id="nome" name="nome" placeholder="Digite seu email" value="<%=cpf.getNome()%>">
		</div>
		
		

	<div  class="form-group">
		<label for="email">E-mail</label>
			<input  class="form-control" type="text" id="email" name="email" placeholder="Digite seu email" value="<%=cpf.getEmail() %>">
		<small>Email será validado</small>
	</div>
	

	<div  class="form-group">
		<label for="usuario">Usuario</label>
		<input class="form-control" type="text" id="usuario" name="usuario" placeholder="Digite seu usuario"  value="<%=cpf.getUsuario() %>">
	</div>

	<div  class="form-group">
		<label for="email">Senha</label>
		<input class="form-control" type="password" id="senha" name="senha" placeholder="Digite sua senha" value="<%=cpf.getSenha() %>">
	</div>
	<div  class="form-group">
		<label for="email">Confirmação de senha</label>
		<input class="form-control" type="password" id="senhaconf" name="senhaconf" placeholder="Digite sua senha novamente">
	</div>
	
	<% } %>
	<div>
		<h2 id="endereco">Endereço</h2>
		
		<%for(Endereco endere : ende) {%>
			<div   class="form-group">
				<label>UF</label>
				<select class="form-control" >
					<option>MG</option>
					<option>SP</option>
				</select>
			</div>
			
			<div class="form-group">
				<label>Cep</label>
				<input class="form-control" type="text" name="cep" value=" <%=endere.getCep() %> " >
			</div>
			
			<div   class="form-group">
				<label>Cidade</label>
				<input class="form-control"  type="text" name="cidade"  value="<%=endere.getCidade() %>">
			</div>
			
			<div   class="form-group">
				<label>Bairro</label>
				<input class="form-control"  type="text" name="bairro"  value="<%=endere.getBairro() %>" >
			</div>
		
		<div  class="form-group">
			<label>Logradouro</label>
			<input class="form-control"  type="text" name="rua" value="<%=endere.getLogradouro() %>"  >
		<label>Numero</label>
			<input class="form-control"  type="text" name="numero" value="<%=endere.getNumero() %>" >
		</div>
		
			
		<% } %>
		<div class="form-group">

		
		<a href="index.jsp"><button onclick="validaCampos()"   type="submit" class="btn btn-info w-100" name="enviar" value="enviar">Alterar </button></a>
		<br><br>
		<a href="index.jsp"><button onclick="validaCampos()"   type="submit" class="btn btn-info w-100" name="excluir" value="excluir">Excluir </button></a>
		
	
	</div>
		</form>
	
	</div>
	
</form>
</div>

</div>

	<script src="scripts/cadastro.js"></script>
</body>
</html>




</body>
</html>