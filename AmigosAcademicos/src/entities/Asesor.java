package entities;

import java.util.ArrayList;

public class Asesor extends Persona{

	public ArrayList<Asesoria> asesorias;
	public Horario horarioAsesorias;
	public String materia;
	public int puntuacion;
	public int puntuaciones;
	public float puntuaPromedio;
	
	public Asesor(){
		super();
	}
	
	public Asesor(String nom, int cod, int sem, String car, int cel, String mat, String cla, int doc) {
		super(nom, cod, sem, car, cel, cla, doc);
		this.puntuacion = 0;
		this.materia = mat;
		puntuaciones = 0;
		puntuaPromedio = 0;
		asesorias = new ArrayList<>();
		horarioAsesorias = null;
	}

	public void modificarHorario(Horario newHorario){
		horarioAsesorias = newHorario;
	}
	
	public void agregarPuntuacion(int pun){
		puntuaciones++;
		puntuacion += pun;
		promediarPuntuacion();
	}
	
	public void promediarPuntuacion(){
		puntuaPromedio = puntuacion/puntuaciones;
	}
	
	public void agregarAsesoria(int id, int es, String tem, Fecha fe, Hora ho){
		Asesoria asesoria = new Asesoria(id, codigo, es, tem, fe, ho);
		asesorias.add(asesoria);
		horarioAsesorias.ocupar(asesoria.hora);
	}
	
	public void terminarAsesoria(int ase){
		for(int i = 0; i < asesorias.size(); i++){
			if(asesorias.get(i).id == ase){
				asesorias.get(i).terminada = true;
			}
		}
	}
	
	public void cancelarAsesoria(int id){
		for(int i = 0; i < asesorias.size(); i++){
			if(asesorias.get(i).id == id){
				horarioAsesorias.desocupar(asesorias.get(i).hora);
				asesorias.remove(i);
			}
		}
	}
	
	public void terminarTodasAsesoria(){
		for(int i = 0; i < asesorias.size(); i++){
			asesorias.get(i).terminada = true;
		}
		horarioAsesorias.desocuparTodo();
	}
}
