<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>




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
	
	<h1 class=" bg-info"id="tituloF">Faça Seu Cadastro</h1>
		<div id="formulario">
			<form action="DoacaoServelet" method="post">
				<div class="form-group">
				<label for="email">NOME</label>
					<input class="form-control" type="text" id="nome" name="nome" placeholder="Digite seu email">
		</div>
		<div class="form-group">
				<label for="cpf">CPF</label>
					<input class="form-control" type="text" id="cpf" name="cpf" placeholder="Digite o seu cpf">
		</div>
		

	<div  class="form-group">
		<label for="email">E-mail</label>
			<input  class="form-control" type="text" id="email" name="email" placeholder="Digite seu email">
		<small>Email será validado</small>
	</div>
	

	<div  class="form-group">
		<label for="usuario">Usuario</label>
		<input class="form-control" type="text" id="usuario" name="usuario" placeholder="Digite seu usuario">
	</div>

	<div  class="form-group">
		<label for="email">Senha</label>
		<input class="form-control" type="password" id="senha" name="senha" placeholder="Digite sua senha">
	</div>
	<div  class="form-group">
		<label for="email">Confirmação de senha</label>
		<input class="form-control" type="password" id="senhaconf" name="senhaconf" placeholder="Digite sua senha novamente">
	</div>
	

	<div>
		<h2 id="endereco">Endereço</h2>
			<div   class="form-group">
				<label>UF</label>
				<select class="form-control" >
					<option>MG</option>
					<option>SP</option>
				</select>
			</div>
			
			<div class="form-group">
				<label>Cep</label>
				<input class="form-control" type="text" name="cep">
			</div>
			
			<div   class="form-group">
				<label>Cidade</label>
				<input class="form-control"  type="text" name="cidade">
			</div>
			
			<div   class="form-group">
				<label>Bairro</label>
				<input class="form-control"  type="text" name="bairro">
			</div>
		
		<div  class="form-group">
			<label>Logradouro</label>
			<input class="form-control"  type="text" name="rua">
		<label>Numero</label>
			<input class="form-control"  type="text" name="numero">
		</div>
		
		
			<div class="form-group">

		
		<a href="index.jsp"><button onclick="validaCampos()"   type="submit" class="btn btn-info w-100" name="cmd" value="salvarPessoa">Gravar </button></a>
	
	</div>
		
	
	</div>
	
</form>
</div>

</div>

	<script src="scripts/cadastro.js"></script>
</body>
</html>




</body>
</html>