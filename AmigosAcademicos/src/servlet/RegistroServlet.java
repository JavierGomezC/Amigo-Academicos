package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Asesor;
import entities.Estudiante;
import model.AsesorDao;
import model.Control;
import model.EstudianteDao;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Control control;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        control = new Control();
        // TODO Auto-generated constructor stub
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
		PrintWriter out = response.getWriter();
		
		String nom= request.getParameter("name");
		int cod = Integer.parseInt(request.getParameter("codigo"));
		int doc = Integer.parseInt(request.getParameter("document"));
		String car = request.getParameter("carrera");
		String cla = request.getParameter("password");
		String mat = request.getParameter("materia");

		int tipo = Integer.parseInt(request.getParameter("department"));
		
		String btnRegistro = request.getParameter("btnRegistro");
		
		if(btnRegistro != null){
			if(tipo == 1) {
				Estudiante estudiante = new Estudiante(nom, cod, 0, car, 0, cla, doc);
				EstudianteDao estu = new EstudianteDao();
				estu.insert(estudiante);
				out.println("<html><head></head><body onload=\"alert('Estudiante Registrado'); window.location='index.jsp' \"></body></html>");
			}
			if(tipo == 2) {
				Asesor asesor = new Asesor(nom, cod, 0, car, 0, mat, cla, doc);
				AsesorDao as = new AsesorDao();
				as.insert(asesor);
				out.println("<html><head></head><body onload=\"alert('Asesor Registrado'); window.location='index.jsp' \"></body></html>");
			}
		}
	}

}
