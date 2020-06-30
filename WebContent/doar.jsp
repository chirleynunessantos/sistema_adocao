
    
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
		
		
		
			<li class="nav-item">
				<a class="nav-link"  href="cadastro.jsp">Cadastro</a>
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
	<div id="cabePet">
	
		<h1>Olá que bom te ver por aqui !</h1>
		<h2>Agora vamos fazer o cadastro do seu bichinho</h2>
	</div>
<div id="corpoCadastro">
		<h1 class=" bg-info"id="tituloF"> Cadastre o seu pet</h1>
		<form action="Doar" method="post">
		<div class="form-group">
		
			<label>Tipo</label>
			<select>
				<option></option>
				<option>Cachorro</option>
				<option>Gato</option>
			</select>
		
		</div>
	
		
		<div class="form-group">
		<br>
			<label>Raça</label>
			<input class="form-control" type="text" name="raca">
		</div>
		<br>
		<div  class="form-group">
			<label>Data de Nascimento</label>
			<input class="form-control" type="date" name="dataN">
		</div>
		<br>
		<div  class="form-group">
			<label>Peso</label>
			<input class="form-control" type="text" name="peso">
		</div>
		<br>
		<div  class="form-group">
			<label>cor</label>
			<input class="form-control" type="text" name="cor">
		</div>
		
		<label>Selecione uma foto do seu animal</label>
		<div class="custom-file">	
			<input  class="custom-file-label" type="file" multiple name="imagem">
		</div>
		<div>
		<label>Observação</label>
		<textarea class="form-control" rows="3"></textarea>
		</div>
	
	
		<br>
		<button type="submit" class="btn btn-primary w-100" name="doar" value="doar"> Gravar </button>
		
		</form>
</div>	
	</body>
	
	</html>