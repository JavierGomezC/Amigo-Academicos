 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<html>
	<head>
		<title>UFPS</title>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="Index/configuracion/css/css.css" />
	</head>
	<body class="cargando">
			<div id="principal">
					<section id="main">
						<header>
							<span class="avatar"><img src="Index/images/avatar.jpg" alt="" /></span>
							<h1>UFPS</h1>
							<p>Inicio de sesión</p>
						</header>
						
						<hr/>
						<form method="post" action="LoginServlet">
							<div class="field">
								<input type="text" name="codigo" id="codigo" placeholder="Codigo" value="1151486"/>
							</div>
							<div class="field">
								<input type="password" name="password" id="password" placeholder="Contraseña" value="algo123"/>
							</div>
							<div class="field">
								<input type="password" name="document" id="document" placeholder="Documento" value="1090519880"/>
							</div>
							<div class="field">
								<div class="select-principal">
									<select name="department" id="department">
										<option value="0">Tipo</option>
										<option value="1">Estudiante</option>
										<option value="2">Asesor</option>
									</select>
								</div>
							</div>
							<ul class="actions">
								<li><input type="submit" name="btnInicio" id="btnInicio" value="Entrar" ></li>
							</ul>
						</form>
						
						<form method="post" action="irRegistroServlet">
							<ul class="actions">
								<li><input type="submit" name="btnRegistro" id="btnRegistro" value="Registrarse" ></li>
							</ul>
						</form>
						
						<hr/>
						<footer>
							<ul class="icons">
								<li><a target="_parent" href="https://www.facebook.com/Ufps.edu.co/" class="fa fa-facebook"></a></li>
                                <li><a href="https://twitter.com/ufpscucuta" class="fa fa-twitter"></a></li>
                                <li><a href="https://www.instagram.com/ufpscucuta/" class="fa fa-instagram"></a></li>
							</ul>
						</footer>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<ul class="copyright">
							<li>&copy; UFPS</li><li>Design: <a href="http://ufps.edu.co">UFPS</a></li>
						</ul>
					</footer>

			</div>

		<!-- Scripts -->
			<!--JS Script-->
			<script>
				if ('addEventListener' in window) {
					window.addEventListener('load', function() { document.body.className = document.body.className.replace(/\bcargando\b/, ''); });
					document.body.className += (navigator.userAgent.match(/(MSIE|rv:11\.0)/) ? ' is-ie' : '');
				}
			</script>

	</body>
</html>