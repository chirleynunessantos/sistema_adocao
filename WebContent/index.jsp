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
<body  onload="slide1()">


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
	

<div id="bemVindo">


		<div >
			<center></center><h1  class="bem" text-align:center>Bem vindo ao Doacão</h1></center>
			
			<h2 class="bemh2">Aqui você pode anunciar um pet para adoção ou adotar um bichinho  que  outras pessoas querem doar</h2>
		</div>
	
</div>
	

<div id="lateral">	

	<div id="login">
		<h2 id="Titulologin"   class=" bg-info"> Faça seu Login</h2>
		
		<form method="post" action="loginS">
			<div>
				<div id="usuario" class="form-group">
				<label>Usuario</label>
					<input class="form-control" type="text" name="usuario">
				</div>
				<div id="usuario" class="form-group">
				<label>Senha</label>
					<input class="form-control" type="password" name="senha">
				<br>
				 <button type="submit" class="btn btn-info " name="cmd" value="login">Logar</button>
				 <br>
				 <a  name="chamar" href="cadastro.jsp" >Criar cadastro</a>
	
			</div>
		</form>
	

	</div>
	</div>


	
<div id="corpo">


</div>
	


	<script type="text/javascript" src="scripts\cadastro.js"></script>



</body>
</html>


