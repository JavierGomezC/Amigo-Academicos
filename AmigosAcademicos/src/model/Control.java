package model;

import java.util.ArrayList;
import java.util.List;

import entities.Asesor;
import entities.Asesoria;
import entities.Estudiante;
import entities.Fecha;
import entities.Hora;
import entities.Horario;
import entities.Sesion;

public class Control {

	public List<Asesor> asesores;
	public List<Estudiante> estudiantes;
	
	public int horario;
	
	public EstudianteDao estuDao;
	public AsesorDao aseDao;
	public AsesoriaDao asesoDao;
	public HoraDao horaDao;
	public HorarioDao horarioDao;
	public SesionDao sesionDao;
	
	public Control(){
		asesores = new ArrayList<>();
		estudiantes = new ArrayList<>();
		
		estuDao = new EstudianteDao();
		aseDao = new AsesorDao();
		asesoDao = new AsesoriaDao();
		horaDao = new HoraDao();
		horarioDao = new HorarioDao();
		sesionDao = new SesionDao();
		
		horario = 0;
	}
	
	public static void main(String[] args){
		Control con = new Control();
 
		con.registrarAsesor("Carlos Rene", 11505372, 10, "Ing Sistemas", 3415125, "Programacion Web", "1234", 105897235);
		con.registrarAsesor("Alguien", 115123, 5, "Ing de algo", 3315634, "Matealgo", "miclave", 1090513);
		
		/*Asesor o = new Asesor("Carlos Rene", 11505372, 10, "Ing Sistemas", 3415125, "Programacion Web", "1234", 105897235);
		con.aseDao.delete(o);
		o = new Asesor("Alguien", 115123, 5, "Ing de algo", 3315634, "Matealgo", "miclave", 1090513);
		con.aseDao.delete(o);
		
		Hora p = new Hora(0, 0, "0", 0);
		p.idHorario = 0;
		con.horaDao.deleteHorario(p);
		p.idHorario = 1;
		con.horaDao.deleteHorario(p);*/
		
		/*Sesion o = new Sesion();
		o.id = 0;
		o.idActualA = 0;
		o.idActualE = 0;
		con.sesionDao.insert(o);*/
	}
	
	//Acciones del Estudiante
	public int inicioSesionEstudiante(int cod, String cla, int doc){
		estudiantes = estuDao.list();
		for(int i = 0; i < estudiantes.size(); i++){
			if(estudiantes.get(i).codigo == cod && estudiantes.get(i).clave.equals(cla) && estudiantes.get(i).documento == doc){
				Sesion o = sesionDao.find(0);
				o.idActualE = estudiantes.get(i).codigo;
				sesionDao.update(o);
				//0 Siginifica que se pudo iniciar sesion correctamente
				return 0;
			}
			if(estudiantes.get(i).codigo == cod && !estudiantes.get(i).clave.equals(cla) || estudiantes.get(i).documento != doc){
				//1 Algun parametro no coincide
				return 1;
			}
		}
		//2 Siginifica que no se encontro el codigo registrado
		return 2;
	}
	
	public boolean registrarEstudiante(String nom, int cod, int sem, String car, int cel, String cla, int doc){
		boolean existe = false;
		estudiantes = estuDao.list();
		for(int i = 0; i < estudiantes.size(); i++){
			if(estudiantes.get(i).codigo == cod){
				existe = true;
			}
		}
		if(!existe){
			Estudiante es = new Estudiante(nom, cod, sem, car, cel, cla, doc);
			estuDao.insert(es);
			return true;
		}else
			return false;
	}
	
		//Un estudiante puede convertirse en asesor
	public void estudianteaAsesor(int cod, String mat){
		estudiantes = estuDao.list();
		for(int i = 0; i < estudiantes.size(); i++){
			if(estudiantes.get(i).codigo == cod){
				registrarAsesor(estudiantes.get(i).nombre, estudiantes.get(i).codigo, estudiantes.get(i).semestre, estudiantes.get(i).carrera, estudiantes.get(i).celular, mat, estudiantes.get(i).clave, estudiantes.get(i).documento);
			}
		}
	}
	
	public void solicitarAsesoria(int id, int ase, String tem, int dia, int mes, int anio, Hora ho){
		Fecha fe = new Fecha(dia, mes, anio);
		Sesion o = sesionDao.find(0);
		int sesionEst = o.idActualE;
		estudiantes = estuDao.list();
		asesores = aseDao.list();
		estudiantes.get(sesionEst).solicitarAsesoria(id, ase, tem, fe, ho);
		asesores.get(ase).agregarAsesoria(id, sesionEst, tem, fe, ho);
		Asesoria as = new Asesoria(id, ase, sesionEst, tem, fe, ho);
		asesoDao.insert(as);
	}
	
	public void cancelarAsesoria(int id){
		Sesion o = sesionDao.find(0);
		int sesionEst = o.idActualE;
		Asesoria as = estudiantes.get(sesionEst).asesorias.get(id);
		asesoDao.delete(as);
		estudiantes.get(sesionEst).cancelarAsesoria(id);
		asesores.get(as.idAsesor).cancelarAsesoria(id);
		estuDao.update(estudiantes.get(sesionEst));
		aseDao.update(asesores.get(as.idAsesor));
	}
	
		//Da una puntuacion de 1 a 5 a un asesor
	public void puntuarAsesor(int idAs, int pun){
		asesores.get(idAs).agregarPuntuacion(pun);
		aseDao.update(asesores.get(idAs));
	}
	
	//Acciones del Asesor
	public int inicioSesionAsesor(int cod, String cla, int doc){
		asesores = aseDao.list();
		for(int i = 0; i < asesores.size(); i++){
			if(asesores.get(i).codigo == cod && asesores.get(i).clave.equals(cla) && asesores.get(i).documento == doc){
				Sesion o = sesionDao.find(0);
				o.idActualA = asesores.get(i).codigo;
				sesionDao.update(o);
				//0 Siginifica que se pudo iniciar sesion correctamente
				return 0;
			}
			if(asesores.get(i).codigo == cod) {
				if(!asesores.get(i).clave.equals(cla) || asesores.get(i).documento != doc){
				//1 Siginifica clave incorrecta
				return 1;
				}
			}
		}
		//2 Siginifica que no se encontro el codigo registrado
		return 2;
	}
	
	public boolean registrarAsesor(String nom, int cod, int sem, String car, int cel, String mat, String cla, int doc){
		boolean existe = false;
		asesores = aseDao.list();
		for(int i = 0; i < estudiantes.size(); i++){
			if(estudiantes.get(i).codigo == cod){
				existe = true;
			}
		}
		if(!existe){
			Asesor es = new Asesor(nom, cod, sem, car, cel, mat, cla, doc);
			aseDao.insert(es);
			List<Horario> hors = new ArrayList<>();
			hors = horarioDao.list();
			horario = hors.size();
			System.out.println(horario);
			Horario o = new Horario(horario, cod);
			horarioDao.insert(o);
			
			List<Hora> ho = horaDao.list();
			int id = ho.size();
			Hora h = new Hora(6, 0, "Lunes", id);
			h.idHorario = horario;

			h.hora = 6;
			horaDao.insert(h);
			for(int i = 7; i < 19; i++){
				h.hora = i;
				id++;
				h.id = id;
				horaDao.insert(h);
			}
			
			h.dia = "Martes";
			for(int i = 6; i < 19; i++){
				h.hora = i;
				id++;
				h.id = id;
				horaDao.insert(h);
			}
			
			h.dia = "Miercoles";
			for(int i = 6; i < 19; i++){
				h.hora = i;
				id++;
				h.id = id;
				horaDao.insert(h);
			}
			
			h.dia = "Jueves";
			for(int i = 6; i < 19; i++){
				h.hora = i;
				id++;
				h.id = id;
				horaDao.insert(h);
			}
			
			h.dia = "Viernes";
			for(int i = 6; i < 19; i++){
				h.hora = i;
				id++;
				h.id = id;
				horaDao.insert(h);
			}
			
			return true;
		}else
			return false;
	}
	
		//El asesor da por terminada la asesoria
	public void terminarAsesoria(int idAs){
		int sesionAse = 0;
		for(int i = 0; i < asesores.size(); i++) {
			Sesion o = sesionDao.find(0);
			if(asesores.get(i).codigo == o.idActualA) {
				sesionAse = i;
			}
		}
		asesores.get(sesionAse).terminarAsesoria(idAs);
		Asesoria as = asesores.get(sesionAse).asesorias.get(idAs);
		estudiantes.get(as.idEstudiante).terminarAsesoria(idAs);
		asesoDao.update(as);
	}
	
	public void actualizarHora(int h, int m, String d, int ocu, int id){
		int sesionAse = 0;
		for(int i = 0; i < asesores.size(); i++) {
			Sesion o = sesionDao.find(0);
			if(asesores.get(i).codigo == o.idActualA) {
				sesionAse = i;
			}
		}
		Hora ho = new Hora(h, m, d, id);
		asesores = aseDao.list();
		int idH = asesores.get(sesionAse).horarioAsesorias.id;
		ho.idHorario = idH;
		ho.ocupado = ocu;
		horaDao.update(ho);
	}
	
	public Horario mostrarHorario(int idAse){
		int idAsesor = 0;
		asesores = aseDao.list();
		for(int i = 0; i < asesores.size(); i++) {
			if(idAse == asesores.get(i).codigo) {
				idAsesor = i;
			}
		}
		int idH = asesores.get(idAsesor).horarioAsesorias.id;
		return horarioDao.find(idH);
	}
	
	public Horario horario(){
		asesores = aseDao.list();
		int sesionAse = 0;
		for(int i = 0; i < asesores.size(); i++) {
			Sesion o = sesionDao.find(0);
			if(asesores.get(i).codigo == o.idActualA) {
				sesionAse = i;
			}
		}
		return asesores.get(sesionAse).horarioAsesorias;
	}
	
	public List<Asesor> listaAsesores(String car, String mat) {
		List<Asesor> as = aseDao.list();
		List<Asesor> ase = new ArrayList<>();
		for(int i = 0; i < as.size(); i++) {
			if(as.get(i).carrera.equals(car) && as.get(i).materia.equals(mat))
				ase.add(as.get(i));
		}
		return ase;
	}
}