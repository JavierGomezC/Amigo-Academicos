package entities;

import java.util.ArrayList;

public class Estudiante extends Persona{
	
	public ArrayList<Asesoria> asesorias;
	
	public Estudiante(){
		super();
	}
	
	public Estudiante(String nom, int cod, int sem, String car, int cel, String cla, int doc) {
		super(nom, cod, sem, car, cel, cla, doc);
		asesorias = new ArrayList<>();
	}

	public void solicitarAsesoria(int id, int ase, String tem, Fecha fe, Hora ho){
		Asesoria asesoria = new Asesoria(id, ase, codigo, tem, fe, ho);
		asesorias.add(asesoria);
	}
	
	public void terminarAsesoria(int id){
		for(int i = 0; i < asesorias.size(); i++){
			if(asesorias.get(i).id == id){
				asesorias.get(i).terminada = true;
			}
		}
	}
	
	public void cancelarAsesoria(int id){
		for(int i = 0; i < asesorias.size(); i++){
			if(asesorias.get(i).id == id){
				asesorias.remove(i);
			}
		}
	}
}
