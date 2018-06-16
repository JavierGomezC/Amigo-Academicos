package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Horario;
import model.Control;

/**
 * Servlet implementation class ControlServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Control control;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        control = new Control();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	try {
    		
		} finally {
			// TODO: handle finally clause
		}
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Login
		int cod = Integer.parseInt(request.getParameter("codigo"));
		String cla = request.getParameter("password");
		int doc = Integer.parseInt(request.getParameter("document"));
		int tipo = Integer.parseInt(request.getParameter("department"));
		
		String btnInicio = request.getParameter("btnInicio");
		
		if(btnInicio != null){
			if(tipo == 0){
				//JOptionPane.showMessageDialog(null, "Elija tipo");
				response.sendRedirect("index.jsp");
			}
			if(tipo == 1){
				int res = control.inicioSesionEstudiante(cod, cla, doc);
				if(res == 0){
					System.out.println("Inicia");
					response.sendRedirect("estudiante.jsp");
				}
				if(res == 1){
					//JOptionPane.showMessageDialog(null, "Algo mal");
					response.sendRedirect("index.jsp");
				}
				if(res == 2){
					//JOptionPane.showMessageDialog(null, "No existe");
					response.sendRedirect("index.jsp");
				}
			}
			
			if(tipo == 2){
				int res = control.inicioSesionAsesor(cod, cla, doc);
				if(res == 0){
					System.out.println("Inicia");
					Horario horario = control.horario();
					String[] datos = new String[65];
					for(int i = 0; i < datos.length; i++) {
						datos[i] = "Libre";
					}
					
					int contador = 0;
					for(int i = 0; i < horario.Lunes.size(); i++) {
						if(horario.Lunes.get(i).ocupado == 1){
							datos[contador] = "Asesoria";
						}
						contador++;
					}
					
					for(int i = 0; i < horario.Martes.size(); i++) {
						if(horario.Martes.get(i).ocupado == 1){
							datos[contador] = "Asesoria";
						}
						contador++;
					}
					
					for(int i = 0; i < horario.Miercoles.size(); i++) {
						if(horario.Miercoles.get(i).ocupado == 1){
							datos[contador] = "Asesoria";
						}
						contador++;
					}
					
					for(int i = 0; i < horario.Jueves.size(); i++) {
						if(horario.Jueves.get(i).ocupado == 1){
							datos[contador] = "Asesoria";
						}
						contador++;
					}
					
					for(int i = 0; i < horario.Viernes.size(); i++) {
						if(horario.Viernes.get(i).ocupado == 1){
							datos[contador] = "Asesoria";
						}
						contador++;
					}
					
					response.sendRedirect("Docente/asesor.jsp?dato1="+datos[0]+"&dato2="+datos[1]+"&dato3="+datos[2]+"&dato4="+datos[3]+"&dato5="+datos[4]
							+"&dato6="+datos[5]+"&dato7="+datos[6]+"&dato8="+datos[7]+"&dato9="+datos[8]+"&dato10="+datos[9]+"&dato11="+datos[10]+"&dato12="+datos[11]
									+"&dato13="+datos[12]+"&dato14="+datos[13]+"&dato15="+datos[14]+"&dato16="+datos[15]+"&dato17="+datos[16]+"&dato18="+datos[17]+"&dato19="+datos[18]
											+"&dato20="+datos[19]+"&dato21="+datos[20]+"&dato22="+datos[21]+"&dato23="+datos[22]+"&dato24="+datos[23]+"&dato25="+datos[24]+"&dato26="+datos[25]
													+"&dato27="+datos[26]+"&dato28="+datos[27]+"&dato29="+datos[28]+"&dato30="+datos[29]+"&dato31="+datos[30]+"&dato32="+datos[31]+"&dato33="+datos[32]+"&dato34="+datos[33]
															+"&dato35="+datos[34]+"&dato36="+datos[35]+"&dato37="+datos[36]+"&dato38="+datos[37]+"&dato39="+datos[38]+"&dato40="+datos[39]+"&dato41="+datos[40]+"&dato42="+datos[41]+"&dato43="+datos[42]
																	+"&dato44="+datos[43]+"&dato45="+datos[44]+"&dato46="+datos[45]+"&dato47="+datos[46]+"&dato48="+datos[47]+"&dato49="+datos[48]+"&dato50="+datos[49]+"&dato51="+datos[50]+"&dato52="+datos[51]
																			+"&dato53="+datos[52]+"&dato54="+datos[53]+"&dato55="+datos[54]+"&dato56="+datos[55]+"&dato57="+datos[56]+"&dato58="+datos[57]+"&dato59="+datos[58]+"&dato60="+datos[59]+"&dato61="+datos[60]
																					+"&dato62="+datos[61]+"&dato63="+datos[62]+"&dato64="+datos[63]+"&dato65="+datos[64]);
				}
				if(res == 1){
					//JOptionPane.showMessageDialog(null, "Algo mal");
					response.sendRedirect("index.jsp");
				}
				if(res == 2){
					//JOptionPane.showMessageDialog(null, "No existe");
					response.sendRedirect("index.jsp");
				}
			}
			
		}
	}

}