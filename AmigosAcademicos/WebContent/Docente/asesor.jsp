<%
String dato1 = request.getParameter("dato1");
String dato2 = request.getParameter("dato2");
String dato3 = request.getParameter("dato3");
String dato4 = request.getParameter("dato4");
String dato5 = request.getParameter("dato5");
String dato6 = request.getParameter("dato6");
String dato7 = request.getParameter("dato7");
String dato8 = request.getParameter("dato8");
String dato9 = request.getParameter("dato9");
String dato10 = request.getParameter("dato10");
String dato11 = request.getParameter("dato11");
String dato12 = request.getParameter("dato12");
String dato13 = request.getParameter("dato13");

String dato14 = request.getParameter("dato14");
String dato15 = request.getParameter("dato15");
String dato16 = request.getParameter("dato16");
String dato17 = request.getParameter("dato17");
String dato18 = request.getParameter("dato18");
String dato19 = request.getParameter("dato19");
String dato20 = request.getParameter("dato20");
String dato21 = request.getParameter("dato21");
String dato22 = request.getParameter("dato22");
String dato23 = request.getParameter("dato23");
String dato24 = request.getParameter("dato24");
String dato25 = request.getParameter("dato25");
String dato26 = request.getParameter("dato26");

String dato27 = request.getParameter("dato27");
String dato28 = request.getParameter("dato28");
String dato29 = request.getParameter("dato29");
String dato30 = request.getParameter("dato30");
String dato31 = request.getParameter("dato31");
String dato32 = request.getParameter("dato32");
String dato33 = request.getParameter("dato33");
String dato34 = request.getParameter("dato34");
String dato35 = request.getParameter("dato35");
String dato36 = request.getParameter("dato36");
String dato37 = request.getParameter("dato37");
String dato38 = request.getParameter("dato38");
String dato39 = request.getParameter("dato39");

String dato40 = request.getParameter("dato40");
String dato41 = request.getParameter("dato41");
String dato42 = request.getParameter("dato42");
String dato43 = request.getParameter("dato43");
String dato44 = request.getParameter("dato44");
String dato45 = request.getParameter("dato45");
String dato46 = request.getParameter("dato46");
String dato47 = request.getParameter("dato47");
String dato48 = request.getParameter("dato48");
String dato49 = request.getParameter("dato49");
String dato50 = request.getParameter("dato50");
String dato51 = request.getParameter("dato51");
String dato52 = request.getParameter("dato52");

String dato53 = request.getParameter("dato53");
String dato54 = request.getParameter("dato54");
String dato55 = request.getParameter("dato55");
String dato56 = request.getParameter("dato56");
String dato57 = request.getParameter("dato57");
String dato58 = request.getParameter("dato58");
String dato59 = request.getParameter("dato59");
String dato60 = request.getParameter("dato60");
String dato61 = request.getParameter("dato61");
String dato62 = request.getParameter("dato62");
String dato63 = request.getParameter("dato63");
String dato64 = request.getParameter("dato64");
String dato65 = request.getParameter("dato65");
%>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
    <title>UFPS Asesorías</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href='http://fonts.googleapis.com/css?family=Dosis:300,400,500,600,700,800' rel='stylesheet' type='text/css'>
    
    <!-- CSS Bootstrap-->
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="css/font-awesome.min.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="css/templatemo_misc.css">
    <link rel="stylesheet" href="css/animate.css">
    <link href="css/templatemo_style.css" rel="stylesheet" media="screen">
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <!-- JavaScripts -->
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/modernizr.js"></script>
</head>
<body>
    <div class="bg-image"></div>
    <div class="overlay-bg"></div>
    <div class="responsive-navigation visible-sm visible-xs">
        <a href="#" class="menu-toggle-btn">
            <i class="fa fa-bars fa-2x"></i>
        </a>
        <div class="responsive_menu">
            <ul class="main_menu">
           		<li><a href="../index.jsp">Cerrar</a></li>
                <li><a class="show-1 homebutton" href="#"><i class="fa fa-home"></i>Horario clases</a></li>
                <li><a class="show-4" href="#"><i class="fa fa-cogs"></i>Configuracion</a></li>
                <li><a class="show-5" href="#"><i class="fa fa-globe"></i>Encuentranos</a></li>
            </ul> 
        </div> 
    </div>

    <div class="main-content">
        <div class="container">
            <div class="row">

                <!-- Menu estatico -->
                <div class="col-md-2 visible-md visible-lg">
                    <div class="main_menu">
                        <ul class="menu">
           					<li><a href="../index.jsp">Cerrar</a></li>
                            <li><a class="show-1 homebutton" href="#" data-toggle="tooltip" data-original-title="Horario clases"><i class="fa fa-home"></i></a></li>
                            <li><a class="show-4" href="#" data-toggle="tooltip" data-original-title="Configuracion"><i class="fa fa-cog"></i></a></li>
                            <li><a class="show-5" href="#" data-toggle="tooltip" data-original-title="Encuentranos"><i class="fa fa-globe"></i></a></li>
                        </ul>
                    </div>
                </div>

                <!-- Contenido -->
                <div class="col-md-10">

                    <div class="row">
                        <div class="col-md-12">
                            <div class="templatemo_logo">
                                <a href="index.html">
                                    <img src="images/templatemo_logo.png" alt="Logo">
                                </a>
                            </div> 
                        </div> 
                    </div> 


                    <div id="menu-container">
                        
                        <div id="menu1" class="homepage">
                            <div class="row">
<h1 align="center">Horario de asesorias</h1>

    <table align="center" border="4" bordercolor="white"
    cellpadding="10" cellspacing="20">
      <tr>
        <th bgcolor="blue">Hora</th><th bgcolor="blue">Lunes</th><th bgcolor="blue">Martes</th><th bgcolor="blue">Miercoles</th>
<th bgcolor="blue">Jueves</th><th bgcolor="blue">Viernes</th>
</tr>
<tr>
<td>8-10</td><td align="center" colspan="3">Mate</td><td>Compu</td><td>Mate</td>
</tr>
<tr>
<td>10-12</td><td>Geografia</td><td>Historia</td><td>Geografía</td>
<td>Historia</td><td>Geografia</td>
</tr>
<tr>
<td>12-14</td><td>Física</td><td>Ingles</td><td>Fisica</td><td align="center" rowspan="2">Inglés<br>y<br>Computacion</td><td>Fisica</td>
</tr>
<tr>
<td>15-17</td><td>Anatomia</td><td>Karate</td><td>Karate</td><td>Karate</td></tr>
</table>
                                </div> 
                        </div> 

                        <div id="menu-3" class="content asesorias">
                            <div class="page-header">

                                <h2 class="page-title">Horario asesorias</h2>
                            </div>
                            <div class="content-inner">
                                <div class="row">
                                    <div class="col-md-6">
                                        <h3 class="widget-title">Consulta</h3>
                                    </div>
                                </div>
                            </div>
                        </div>
                   
                        <div id="menu-4" class="content configuracion">
                            <div class="page-header">
                                <h2 class="page-title">Configurar horario</h2>
                            </div>
                            
<form method="post" action="../ConfigurarHorarioServlet">
	<div class="content-inner">
		<table class="table table-condensed">
		<tr>
		<th>Hora</th><th>Lunes</th><th>Martes</th><th>Miercoles</th>
		<th>Jueves</th><th>Viernes</th>
		</tr>
		<tr>
		<td>6AM</td>
		<td><input type="submit" name="btnLunes1" id="btnLunes1" value="<%=dato1 %>" ></td>
		<td><input type="submit" name="btnMartes1" id="btnMartes1" value="<%=dato14 %>" ></td>
		<td><input type="submit" name="btnMiercoles1" id="btnMiercoles1" value="<%=dato27 %>" ></td>
		<td><input type="submit" name="btnJueves1" id="btnJueves1" value="<%=dato40 %>" ></td>
		<td><input type="submit" name="btnViernes1" id="btnViernes1" value="<%=dato53 %>" ></td>
		</tr>
		
		<tr>
		<td>7AM</td>
		<td><input type="submit" name="btnLunes2" id="btnLunes2" value="<%=dato2 %>" ></td>
		<td><input type="submit" name="btnMartes2" id="btnMartes2" value="<%=dato15 %>" ></td>
		<td><input type="submit" name="btnMiercoles2" id="btnMiercoles2" value="<%=dato28 %>" ></td>
		<td><input type="submit" name="btnJueves2" id="btnJueves2" value="<%=dato41 %>" ></td>
		<td><input type="submit" name="btnViernes3" id="btnViernes3" value="<%=dato54 %>" ></td>
		</tr>
		
		<tr>
		<td>8AM</td>
		<td><input type="submit" name="btnLunes3" id="btnLunes3" value="<%=dato3 %>" ></td>
		<td><input type="submit" name="btnMartes3" id="btnMartes3" value="<%=dato16 %>" ></td>
		<td><input type="submit" name="btnMiercoles3" id="btnMiercoles3" value="<%=dato29 %>" ></td>
		<td><input type="submit" name="btnJueves3" id="btnJueves3" value="<%=dato42 %>" ></td>
		<td><input type="submit" name="btnViernes3" id="btnViernes3" value="<%=dato55 %>" ></td>
		</tr>
		
		<tr>
		<td>9AM</td>
		<td><input type="submit" name="btnLunes4" id="btnLunes4" value="<%=dato4 %>" ></td>
		<td><input type="submit" name="btnMartes4" id="btnMartes4" value="<%=dato17 %>" ></td>
		<td><input type="submit" name="btnMiercoles4" id="btnMiercoles4" value="<%=dato30 %>" ></td>
		<td><input type="submit" name="btnJueves4" id="btnJueves4" value="<%=dato43 %>" ></td>
		<td><input type="submit" name="btnViernes4" id="btnViernes4" value="<%=dato56 %>" ></td>
		</tr>
		
		<tr>
		<td>10AM</td>
		<td><input type="submit" name="btnLunes5" id="btnLunes5" value="<%=dato5 %>" ></td>
		<td><input type="submit" name="btnMartes5" id="btnMartes5" value="<%=dato18 %>" ></td>
		<td><input type="submit" name="btnMiercoles5" id="btnMiercoles5" value="<%=dato31 %>" ></td>
		<td><input type="submit" name="btnJueves5" id="btnJueves5" value="<%=dato44 %>" ></td>
		<td><input type="submit" name="btnViernes5" id="btnViernes5" value="<%=dato57 %>" ></td>
		</tr>
		
		<tr>
		<td>11AM</td>
		<td><input type="submit" name="btnLunes6" id="btnLunes6" value="<%=dato6 %>" ></td>
		<td><input type="submit" name="btnMartes6" id="btnMartes6" value="<%=dato19 %>" ></td>
		<td><input type="submit" name="btnMiercoles6" id="btnMiercoles6" value="<%=dato32 %>" ></td>
		<td><input type="submit" name="btnJueves6" id="btnJueves6" value="<%=dato45 %>" ></td>
		<td><input type="submit" name="btnViernes6" id="btnViernes6" value="<%=dato58 %>" ></td>
		</tr>
		
		<tr>
		<td>12AM</td>
		<td><input type="submit" name="btnLunes7" id="btnLunes7" value="<%=dato7 %>" ></td>
		<td><input type="submit" name="btnMartes7" id="btnMartes7" value="<%=dato20 %>" ></td>
		<td><input type="submit" name="btnMiercoles7" id="btnMiercoles7" value="<%=dato33 %>" ></td>
		<td><input type="submit" name="btnJueves7" id="btnJueves7" value="<%=dato46 %>" ></td>
		<td><input type="submit" name="btnViernes7" id="btnViernes7" value="<%=dato59 %>" ></td>
		</tr>
		
		<tr>
		<td>1PM</td>
		<td><input type="submit" name="btnLunes8" id="btnLunes8" value="<%=dato8 %>" ></td>
		<td><input type="submit" name="btnMartes8" id="btnMartes8" value="<%=dato21 %>" ></td>
		<td><input type="submit" name="btnMiercoles8" id="btnMiercoles8" value="<%=dato34 %>" ></td>
		<td><input type="submit" name="btnJueves8" id="btnJueves8" value="<%=dato47 %>" ></td>
		<td><input type="submit" name="btnViernes8" id="btnViernes8" value="<%=dato60 %>" ></td>
		</tr>
		
		<tr>
		<td>2PM</td>
		<td><input type="submit" name="btnLunes9" id="btnLunes9" value="<%=dato9 %>" ></td>
		<td><input type="submit" name="btnMartes9" id="btnMartes9" value="<%=dato22 %>" ></td>
		<td><input type="submit" name="btnMiercoles9" id="btnMiercoles9" value="<%=dato35 %>" ></td>
		<td><input type="submit" name="btnJueves9" id="btnJueves9" value="<%=dato48 %>" ></td>
		<td><input type="submit" name="btnViernes9" id="btnViernes9" value="<%=dato61 %>" ></td>
		</tr>
		
		<tr>
		<td>3PM</td>
		<td><input type="submit" name="btnLunes10" id="btnLunes10" value="<%=dato10 %>" ></td>
		<td><input type="submit" name="btnMartes10" id="btnMartes10" value="<%=dato23 %>" ></td>
		<td><input type="submit" name="btnMiercoles10" id="btnMiercoles10" value="<%=dato36 %>" ></td>
		<td><input type="submit" name="btnJueves10" id="btnJueves10" value="<%=dato49 %>" ></td>
		<td><input type="submit" name="btnViernes10" id="btnViernes10" value="<%=dato62 %>" ></td>
		</tr>
		
		<tr>
		<td>4PM</td>
		<td><input type="submit" name="btnLunes11" id="btnLunes11" value="<%=dato11 %>" ></td>
		<td><input type="submit" name="btnMartes11" id="btnMartes11" value="<%=dato24 %>" ></td>
		<td><input type="submit" name="btnMiercoles11" id="btnMiercoles11" value="<%=dato37 %>" ></td>
		<td><input type="submit" name="btnJueves11" id="btnJueves11" value="<%=dato50 %>" ></td>
		<td><input type="submit" name="btnViernes11" id="btnViernes11" value="<%=dato63 %>" ></td>
		</tr>
		
		<tr>
		<td>5PM</td>
		<td><input type="submit" name="btnLunes12" id="btnLunes12" value="<%=dato12 %>" ></td>
		<td><input type="submit" name="btnMartes12" id="btnMartes12" value="<%=dato25 %>" ></td>
		<td><input type="submit" name="btnMiercoles12" id="btnMiercoles12" value="<%=dato38 %>" ></td>
		<td><input type="submit" name="btnJueves12" id="btnJueves12" value="<%=dato51 %>" ></td>
		<td><input type="submit" name="btnViernes12" id="btnViernes12" value="<%=dato64 %>" ></td>
		</tr>
		
		<tr>
		<td>6PM</td>
		<td><input type="submit" name="btnLunes13" id="btnLunes13" value="<%=dato13 %>" ></td>
		<td><input type="submit" name="btnMartes13" id="btnMartes13" value="<%=dato26 %>" ></td>
		<td><input type="submit" name="btnMiercoles13" id="btnMiercoles13" value="<%=dato39 %>" ></td>
		<td><input type="submit" name="btnJueves13" id="btnJueves13" value="<%=dato52 %>" ></td>
		<td><input type="submit" name="btnViernes13" id="btnViernes13" value="<%=dato65 %>"></td>
		</tr>
		</table>
	</div>
</form>
                        </div>
                        
                        <div id="menu-5" class="content">
                            <div class="page-header">
                                <h2 class="page-title">Encuentranos.</h2>
                            </div>
                            <div class="content-inner">
                                <div class="row">
                                    <div class="col-md-8">
                                        <h3 class="widget-title">Envíanos un mensaje</h3>
                                        <p>No dudes en enviarnos un mensaje , te contestaremos al instante cualquier duda o sugerencia que tengas para nuestra institución.</p>
                                        <div class="row contact-form">
                                            <div class="col-md-4">
                                                <label for="name-id">Nombre:</label>
                                                <input name="name-id" type="text" id="name-id" maxlength="40">
                                            </div>
                                            <div class="col-md-4">
                                                <label for="email-id">E-mail:</label>
                                                <input name="email-id" type="text" id="email-id" maxlength="40">
                                            </div>
                                            <div class="col-md-4">
                                                <label for="subject-id">Asunto:</label>
                                                <input name="subject-id" type="text" id="subject-id" maxlength="60">
                                            </div>
                                        </div>
                                        <p class="full-row">
                                            <label for="message">Mensaje:</label>
                                            <textarea name="message" id="message" rows="6"></textarea>
                                        </p>
                                        <input class="mainBtn" type="submit" name="" value="Enviar mensaje">
                                    </div>
                                    <div class="col-md-4">
                                        <div class="information">
                                            <h3 class="widget-title">Información:</h3>
                                            <ul class="our-location">
                                                <li><span><i class="fa fa-map-marker"></i>Dirección:</span>Av. Grancolombia #12E-96 Cúcuta - Norte de Santander</li>
                                                <li><span><i class="fa fa-map-marker"></i>Telefono:</span>(7) 5776655</li>
                                                <li><span><i class="fa fa-map-marker"></i>Email:</span>oficinadeprensa@ufps.edu.co</li>
                                            </ul>
                                        </div> 
                                    </div>
                                </div>
                            </div>

                        </div>
                                     <div class="our-team">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <h3 class="widget-title">Nuestro equipo</h3>
                                        </div>
                                    </div>

                                    <!-- Informacion estudiantes -->
                                    <div class="row">
                                        <div class="col-md-4 col-sm-6">
                                            <div class="team-member">
                                                <div class="member-thumb">
                                                    <img src="images/team1.jpg" alt="">
                                                </div>
                                                <div class="member-infos">
                                                    <h4 class="member-name">Sebastian</h4>
                                                    <span class="member-role">Web Designer</span>
                                                    <p class="member-desc">Estudiante de ingeniería de sistema de la Universidad Francisco de Paula Santander.</p>
                                                    <ul class="member-social">
                                                        <li><a href="https://www.facebook.com/sebastian.castelanos/" class="fa fa-facebook"></a></li>
                                                        <li><a href="https://www.twitter.com/sebaswy" class="fa fa-twitter"></a></li>
                                                        <li><a href="https://www.instagram.com/sebaswyy/" class="fa fa-instagram"></a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div> 
                                        <div class="col-md-4 col-sm-6">
                                            <div class="team-member">
                                                <div class="member-thumb">
                                                    <img src="images/team2.jpg" alt="">
                                                </div>
                                                <div class="member-infos">
                                                    <h4 class="member-name">Felipe</h4>
                                                    <span class="member-role">Web Developer</span>
                                                    <p class="member-desc">Estudiante de ingeniería de sistema de la Universidad Francisco de Paula Santander.</p>
                                                    <ul class="member-social">
                                                        <li><a href="https://www.facebook.com/" class="fa fa-facebook"></a></li>
                                                        <li><a href="https://www.twitter.com/" class="fa fa-twitter"></a></li>
                                                        <li><a href="https://www.instagram.com/" class="fa fa-instagram"></a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
                                            <div class="team-member">
                                                <div class="member-thumb">
                                                    <img src="images/team3.jpg" alt="">
                                                </div>
                                                <div class="member-infos">
                                                    <h4 class="member-name">Javier</h4>
                                                    <span class="member-role">Back-End</span>
                                                    <p class="member-desc">Estudiante de ingeniería de sistema de la Universidad Francisco de Paula Santander.</p>
                                                    <ul class="member-social">
                                                        <li><a href="https://www.facebook.com/" class="fa fa-facebook"></a></li>
                                                        <li><a href="https://www.twitter.com/" class="fa fa-twitter"></a></li>
                                                        <li><a href="https://www.instagram.com/" class="fa fa-instagram"></a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div> <!-- Fin informacion-->
                        
                        <div class="site-footer">
                            <div class="row">
                                <div class="col-md-6">
                                    <p class="copyright-text">Copyright &copy; 2018 UFPS 
                                    </p>
                                </div>
                                <div class="col-md-6">
                                    <div class="social-icons-footer">
                                        <ul>
                                            <li><a target="_parent" href="https://www.facebook.com/Ufps.edu.co/" class="fa fa-facebook"></a></li>
                                            <li><a href="https://twitter.com/ufpscucuta" class="fa fa-twitter"></a></li>
                                            <li><a href="https://www.instagram.com/ufpscucuta/" class="fa fa-instagram"></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                
                </div>
            </div>
        </div>
    </div>

    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/jquery.mixitup.min.js"></script>
    <script src="js/jquery.nicescroll.min.js"></script>
    <script src="js/jquery.lightbox.js"></script>
    <script src="js/templatemo_custom.js"></script>
</body>
</html>