<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style/bootstrap.min.css" rel="stylesheet" type="text/css" />
<title>Login</title>
</head>
<body>

	<div>
		<ul class="nav nav-tabs justfy-content-center">
		
			<li class="nav-item">
				<a cass="nav-link " href="index.jsp">Home</a>
			</li>
			<li class="nav-item">
				<a cass="nav-link"  href="Informacoes.html"></a>
			</li>
		
			<li class="nav-item">
				<a cass="nav-link"  href="login.jsp">Login</a>
			</li>
		
			<li class="nav-item">
				<a cass="nav-link"  href="cadastro.html">Cadastro</a>
		</li>
	</ul>
</div>
	

	<form method="post" action="loginS">
	<div>
		<div class="form-group">
		<label>Usuario</label>
		<input class="form-control" type="text" name="usuario">
		</div>
		<div class="form-group">
		<label>Senha</label>
		<input class="form-control" type="text" name="senha">
	</div>
</form>

</body>
</html>