
    
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
	<br><br>
	<form action="opcoes" method="post" >
	<div id="adotar">
		<a href="adotar.jsp">  <button class="btn btn-info ">Quero Adotar</button>  </a>
	</div>	
	<div id="doar">
				 <button type="submit" class="btn btn-info " name="cmd" value="doar">Quero doar</button>
	</div>	
	

	</form>
		<div id="meuPerfil">
		<form method="get" action="Perfil" >
				 <button type="submit" class="btn btn-info " name="cmd" value="perfil">Alterar informações do Perfil</button>
		</form>
	</div>	
	</body>
	
	</html>