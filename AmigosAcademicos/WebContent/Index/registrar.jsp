<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Registro</title>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="configuracion/css/css.css" />
	</head>
	<body class="cargando">
			<div id="principal">
					<section id="main">
						<header>
							<span class="avatar"><img src="images/avatar.jpg" alt="" /></span>
							<h1>UFPS</h1>
							<p>Registrarse</p>
						</header>
						
						<hr />
						<form method="post" action="../RegistroServlet">
							<div class="field">
								<input type="text" name="name" id="name" placeholder="Nombre" value=""/>
							</div>
							<div class="field">
								<input type="text" name="codigo" id="codigo" placeholder="Codigo" value=""/>
							</div>
							<div class="field">
								<input type="text" name="document" id="document" placeholder="Documento" value=""/>
							</div>
							<div class="field">
								<select name="carrera" id="carrera">
									<option value="0">Carrera...</option>
									<option value="Ingeniería Civil">Ingeniería Civil</option>
									<option value="Ingeniería de Sistemas">Ingeniería de Sistemas</option>
									<option value="Ingeniería Electrónica">Ingeniería Electrónica</option>
									<option value="Ingeniería Electromecánica">Ingeniería Electromecánica</option>
									<option value="Ingeniería Industrial">Ingeniería Industrial</option>
									<option value="Ingeniería Mecánica">Ingeniería Mecánica</option>
									<option value="Ingeniería Ambiental">Ingeniería Ambiental</option>
								</select>
							</div>
							<div class="field">
								<input type="password" name="password" id="password" placeholder="Contraseña" value=""/>
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
							<div class="field">Si sera Asesor
								<select name="materia" id="materia">
									<option value="0">Materia...</option>
									<option value="Calculo diferencial">Calculo diferencial</option>
									<option value="Calculo integral">Calculo integral</option>
									<option value="Fisica mecanica">Fisica mecanica</option>
									<option value="Fundamentos de programacion">Fundamentos de programacion</option>
									<option value="Programacion Web">Programacion Web</option>
								</select>
							</div>
							<ul class="actions">
								<li><input type="submit" name="btnRegistro" id="btnRegistro" value="Registrarse" ></li>
							</ul>
						</form>
						<form method="post" action="../volverInicio">
							<ul class="actions">
								<li>Si ya esta registrado</li>
								<li><input type="submit" name="btnInicio" id="btnInicio" value="Entrar" ></li>
							</ul>
						</form>
						<hr />
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