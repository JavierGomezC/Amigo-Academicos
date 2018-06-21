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
 * Servlet implementation class ConfigurarHorarioServlet
 */
@WebServlet("/ConfigurarHorarioServlet")
public class ConfigurarHorarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Control control;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigurarHorarioServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		String[] datos = new String[65];
		
		String btnLunes1 = request.getParameter("btnLunes1");
		if(btnLunes1 != null) {
			if(btnLunes1.equals("Libre")) {
				modificarHorario(datos, 0, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 0, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes2 = request.getParameter("btnLunes2");
		if(btnLunes2 != null) {
			if(btnLunes2.equals("Libre")) {
				modificarHorario(datos, 1, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 1, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes3 = request.getParameter("btnLunes3");
		if(btnLunes3 != null) {
			if(btnLunes3.equals("Libre")) {
				modificarHorario(datos, 2, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 2, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes4 = request.getParameter("btnLunes4");
		if(btnLunes4 != null) {
			if(btnLunes4.equals("Libre")) {
				modificarHorario(datos, 3, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 3, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes5 = request.getParameter("btnLunes5");
		if(btnLunes5 != null) {
			if(btnLunes5.equals("Libre")) {
				modificarHorario(datos, 4, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 4, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes6 = request.getParameter("btnLunes6");
		if(btnLunes6 != null) {
			if(btnLunes6.equals("Libre")) {
				modificarHorario(datos, 5, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 5, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes7 = request.getParameter("btnLunes7");
		if(btnLunes7 != null) {
			if(btnLunes7.equals("Libre")) {
				modificarHorario(datos, 6, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 6, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes8 = request.getParameter("btnLunes8");
		if(btnLunes8 != null) {
			if(btnLunes8.equals("Libre")) {
				modificarHorario(datos, 7, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 7, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes9 = request.getParameter("btnLunes9");
		if(btnLunes9 != null) {
			if(btnLunes9.equals("Libre")) {
				modificarHorario(datos, 8, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 8, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes10 = request.getParameter("btnLunes10");
		if(btnLunes10 != null) {
			if(btnLunes10.equals("Libre")) {
				modificarHorario(datos, 9, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 9, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes11 = request.getParameter("btnLunes11");
		if(btnLunes11 != null) {
			if(btnLunes11.equals("Libre")) {
				modificarHorario(datos, 10, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 10, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes12 = request.getParameter("btnLunes12");
		if(btnLunes12 != null) {
			if(btnLunes12.equals("Libre")) {
				modificarHorario(datos, 11, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 11, 0, "Lunes", request, response);
			}
		}
		
		String btnLunes13 = request.getParameter("btnLunes13");
		if(btnLunes13 != null) {
			if(btnLunes13.equals("Libre")) {
				modificarHorario(datos, 12, 1, "Lunes", request, response);
			}else {
				modificarHorario(datos, 12, 0, "Lunes", request, response);
			}
		}
		
		String btnMartes1 = request.getParameter("btnMartes1");
		if(btnMartes1 != null) {
			if(btnMartes1.equals("Libre")) {
				modificarHorario(datos, 0, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 0, 0, "Martes", request, response);
			}
		}
		
		String btnMartes2 = request.getParameter("btnMartes2");
		if(btnMartes2 != null) {
			if(btnMartes2.equals("Libre")) {
				modificarHorario(datos, 1, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 1, 0, "Martes", request, response);
			}
		}
		
		String btnMartes3 = request.getParameter("btnMartes3");
		if(btnMartes3 != null) {
			if(btnMartes3.equals("Libre")) {
				modificarHorario(datos, 2, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 2, 0, "Martes", request, response);
			}
		}
		
		String btnMartes4 = request.getParameter("btnMartes4");
		if(btnMartes4 != null) {
			if(btnMartes4.equals("Libre")) {
				modificarHorario(datos, 3, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 3, 0, "Martes", request, response);
			}
		}
		
		String btnMartes5 = request.getParameter("btnMartes5");
		if(btnMartes5 != null) {
			if(btnMartes5.equals("Libre")) {
				modificarHorario(datos, 4, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 4, 0, "Martes", request, response);
			}
		}
		
		String btnMartes6 = request.getParameter("btnMartes6");
		if(btnMartes6 != null) {
			if(btnMartes6.equals("Libre")) {
				modificarHorario(datos, 5, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 5, 0, "Martes", request, response);
			}
		}
		
		String btnMartes7 = request.getParameter("btnMartes7");
		if(btnMartes7 != null) {
			if(btnMartes7.equals("Libre")) {
				modificarHorario(datos, 6, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 6, 0, "Martes", request, response);
			}
		}
		
		String btnMartes8 = request.getParameter("btnMartes8");
		if(btnMartes8 != null) {
			if(btnMartes8.equals("Libre")) {
				modificarHorario(datos, 7, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 7, 0, "Martes", request, response);
			}
		}
		
		String btnMartes9 = request.getParameter("btnMartes9");
		if(btnMartes9 != null) {
			if(btnMartes9.equals("Libre")) {
				modificarHorario(datos, 8, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 8, 0, "Martes", request, response);
			}
		}
		
		String btnMartes10 = request.getParameter("btnMartes10");
		if(btnMartes10 != null) {
			if(btnMartes10.equals("Libre")) {
				modificarHorario(datos, 9, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 9, 0, "Martes", request, response);
			}
		}
		
		String btnMartes11 = request.getParameter("btnMartes11");
		if(btnMartes11 != null) {
			if(btnMartes11.equals("Libre")) {
				modificarHorario(datos, 10, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 10, 0, "Martes", request, response);
			}
		}
		
		String btnMartes12 = request.getParameter("btnMartes12");
		if(btnMartes12 != null) {
			if(btnMartes12.equals("Libre")) {
				modificarHorario(datos, 11, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 11, 0, "Martes", request, response);
			}
		}
		
		String btnMartes13 = request.getParameter("btnMartes13");
		if(btnMartes13 != null) {
			if(btnMartes13.equals("Libre")) {
				modificarHorario(datos, 12, 1, "Martes", request, response);
			}else {
				modificarHorario(datos, 12, 0, "Martes", request, response);
			}
		}
		
		String btnMiercoles1 = request.getParameter("btnMiercoles1");
		if(btnMiercoles1 != null) {
			if(btnMiercoles1.equals("Libre")) {
				modificarHorario(datos, 0, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 0, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles2 = request.getParameter("btnMiercoles2");
		if(btnMiercoles2 != null) {
			if(btnMiercoles2.equals("Libre")) {
				modificarHorario(datos, 1, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 1, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles3 = request.getParameter("btnMiercoles3");
		if(btnMiercoles3 != null) {
			if(btnMiercoles3.equals("Libre")) {
				modificarHorario(datos, 2, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 2, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles4 = request.getParameter("btnMiercoles4");
		if(btnMiercoles4 != null) {
			if(btnMiercoles4.equals("Libre")) {
				modificarHorario(datos, 3, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 3, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles5 = request.getParameter("btnMiercoles5");
		if(btnMiercoles5 != null) {
			if(btnMiercoles5.equals("Libre")) {
				modificarHorario(datos, 4, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 4, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles6 = request.getParameter("btnMiercoles6");
		if(btnMiercoles6 != null) {
			if(btnMiercoles6.equals("Libre")) {
				modificarHorario(datos, 5, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 5, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles7 = request.getParameter("btnMiercoles7");
		if(btnMiercoles7 != null) {
			if(btnMiercoles7.equals("Libre")) {
				modificarHorario(datos, 6, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 6, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles8 = request.getParameter("btnMiercoles8");
		if(btnMiercoles8 != null) {
			if(btnMiercoles8.equals("Libre")) {
				modificarHorario(datos, 7, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 7, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles9 = request.getParameter("btnMiercoles9");
		if(btnMiercoles9 != null) {
			if(btnMiercoles9.equals("Libre")) {
				modificarHorario(datos, 8, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 8, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles10 = request.getParameter("btnMiercoles10");
		if(btnMiercoles10 != null) {
			if(btnMiercoles10.equals("Libre")) {
				modificarHorario(datos, 9, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 9, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles11 = request.getParameter("btnMiercoles11");
		if(btnMiercoles11 != null) {
			if(btnMiercoles11.equals("Libre")) {
				modificarHorario(datos, 10, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 10, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles12 = request.getParameter("btnMiercoles12");
		if(btnMiercoles12 != null) {
			if(btnMiercoles12.equals("Libre")) {
				modificarHorario(datos, 11, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 11, 0, "Miercoles", request, response);
			}
		}
		
		String btnMiercoles13 = request.getParameter("btnMiercoles13");
		if(btnMiercoles13 != null) {
			if(btnMiercoles13.equals("Libre")) {
				modificarHorario(datos, 12, 1, "Miercoles", request, response);
			}else {
				modificarHorario(datos, 12, 0, "Miercoles", request, response);
			}
		}
		
		String btnJueves1 = request.getParameter("btnJueves1");
		if(btnJueves1 != null) {
			if(btnJueves1.equals("Libre")) {
				modificarHorario(datos, 0, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 0, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves2 = request.getParameter("btnJueves2");
		if(btnJueves2 != null) {
			if(btnJueves2.equals("Libre")) {
				modificarHorario(datos, 1, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 1, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves3 = request.getParameter("btnJueves3");
		if(btnJueves3 != null) {
			if(btnJueves3.equals("Libre")) {
				modificarHorario(datos, 2, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 2, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves4 = request.getParameter("btnJueves4");
		if(btnJueves4 != null) {
			if(btnJueves4.equals("Libre")) {
				modificarHorario(datos, 3, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 3, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves5 = request.getParameter("btnJueves5");
		if(btnJueves5 != null) {
			if(btnJueves5.equals("Libre")) {
				modificarHorario(datos, 4, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 4, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves6 = request.getParameter("btnJueves6");
		if(btnJueves6 != null) {
			if(btnJueves6.equals("Libre")) {
				modificarHorario(datos, 5, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 5, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves7 = request.getParameter("btnJueves7");
		if(btnJueves7 != null) {
			if(btnJueves7.equals("Libre")) {
				modificarHorario(datos, 6, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 6, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves8 = request.getParameter("btnJueves8");
		if(btnJueves8 != null) {
			if(btnJueves8.equals("Libre")) {
				modificarHorario(datos, 7, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 7, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves9 = request.getParameter("btnJueves9");
		if(btnJueves9 != null) {
			if(btnJueves9.equals("Libre")) {
				modificarHorario(datos, 8, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 8, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves10 = request.getParameter("btnJueves10");
		if(btnJueves10 != null) {
			if(btnJueves9.equals("Libre")) {
				modificarHorario(datos, 9, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 9, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves11 = request.getParameter("btnJueves11");
		if(btnJueves11 != null) {
			if(btnJueves11.equals("Libre")) {
				modificarHorario(datos, 10, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 10, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves12 = request.getParameter("btnJueves12");
		if(btnJueves12 != null) {
			if(btnJueves12.equals("Libre")) {
				modificarHorario(datos, 11, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 11, 0, "Jueves", request, response);
			}
		}
		
		String btnJueves13 = request.getParameter("btnJueves13");
		if(btnJueves13 != null) {
			if(btnJueves13.equals("Libre")) {
				modificarHorario(datos, 12, 1, "Jueves", request, response);
			}else {
				modificarHorario(datos, 12, 0, "Jueves", request, response);
			}
		}
		
		String btnViernes1 = request.getParameter("btnViernes1");
		if(btnViernes1 != null) {
			if(btnViernes1.equals("Libre")) {
				modificarHorario(datos, 0, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 0, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes2 = request.getParameter("btnViernes2");
		if(btnViernes2 != null) {
			if(btnViernes2.equals("Libre")) {
				modificarHorario(datos, 1, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 1, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes3 = request.getParameter("btnViernes3");
		if(btnViernes3 != null) {
			if(btnViernes3.equals("Libre")) {
				modificarHorario(datos, 2, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 2, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes4 = request.getParameter("btnViernes4");
		if(btnViernes4 != null) {
			if(btnViernes4.equals("Libre")) {
				modificarHorario(datos, 3, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 3, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes5 = request.getParameter("btnViernes5");
		if(btnViernes5 != null) {
			if(btnViernes5.equals("Libre")) {
				modificarHorario(datos, 4, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 4, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes6 = request.getParameter("btnViernes6");
		if(btnViernes6 != null) {
			if(btnJueves6.equals("Libre")) {
				modificarHorario(datos, 5, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 5, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes7 = request.getParameter("btnViernes7");
		if(btnViernes7 != null) {
			if(btnJueves7.equals("Libre")) {
				modificarHorario(datos, 6, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 6, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes8 = request.getParameter("btnViernes8");
		if(btnViernes8 != null) {
			if(btnViernes8.equals("Libre")) {
				modificarHorario(datos, 7, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 7, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes9 = request.getParameter("btnViernes9");
		if(btnViernes9 != null) {
			if(btnViernes9.equals("Libre")) {
				modificarHorario(datos, 8, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 8, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes10 = request.getParameter("btnViernes10");
		if(btnViernes10 != null) {
			if(btnViernes10.equals("Libre")) {
				modificarHorario(datos, 9, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 9, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes11 = request.getParameter("btnViernes11");
		if(btnViernes11 != null) {
			if(btnViernes11.equals("Libre")) {
				modificarHorario(datos, 10, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 10, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes12 = request.getParameter("btnViernes12");
		if(btnViernes12 != null) {
			if(btnViernes12.equals("Libre")) {
				modificarHorario(datos, 11, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 11, 0, "Viernes", request, response);
			}
		}
		
		String btnViernes13 = request.getParameter("btnViernes13");
		if(btnViernes13 != null) {
			if(btnViernes13.equals("Libre")) {
				modificarHorario(datos, 12, 1, "Viernes", request, response);
			}else {
				modificarHorario(datos, 12, 0, "Viernes", request, response);
			}
		}
	}

	public void modificarHorario(String[] datos, int r, int ocu, String dia, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(dia.equals("Lunes")) {
			Horario horario = control.horario();
			
			control.actualizarHora(horario.Lunes.get(r).hora, 0, "Lunes", ocu, horario.Lunes.get(r).id);
			horario = control.horario();
			
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
		
		if(dia.equals("Martes")) {
			Horario horario = control.horario();
			
			control.actualizarHora(horario.Martes.get(r).hora, 0, "Martes", ocu, horario.Martes.get(r).id);
			horario = control.horario();
			
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
		
		if(dia.equals("Miercoles")) {
			Horario horario = control.horario();
			
			control.actualizarHora(horario.Miercoles.get(r).hora, 0, "Miercoles", ocu, horario.Miercoles.get(r).id);
			horario = control.horario();
			
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
		
		if(dia.equals("Jueves")) {
			Horario horario = control.horario();
			
			control.actualizarHora(horario.Jueves.get(r).hora, 0, "Jueves", ocu, horario.Jueves.get(r).id);
			horario = control.horario();
			
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
		
		if(dia.equals("Viernes")) {
			Horario horario = control.horario();
			
			control.actualizarHora(horario.Viernes.get(r).hora, 0, "Viernes", ocu, horario.Viernes.get(r).id);
			horario = control.horario();
			
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
	}
	
}
