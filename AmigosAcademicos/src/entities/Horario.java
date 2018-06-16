package entities;

import java.util.ArrayList;

public class Horario {

	public int id;
	public ArrayList<Hora> Lunes;
	public ArrayList<Hora> Martes;
	public ArrayList<Hora> Miercoles;
	public ArrayList<Hora> Jueves;
	public ArrayList<Hora> Viernes;
	
	public int idAsesor;
	
	public Horario(){
		Lunes = new ArrayList<>();
		Martes = new ArrayList<>();
		Miercoles = new ArrayList<>();
		Jueves = new ArrayList<>();
		Viernes = new ArrayList<>();
	}
	
	public Horario (int i, int idAs){
		id = i;
		Lunes = new ArrayList<>();
		Martes = new ArrayList<>();
		Miercoles = new ArrayList<>();
		Jueves = new ArrayList<>();
		Viernes = new ArrayList<>();
		idAsesor = idAs;
	}
	
	public void agregarHora(Hora hora){
		if(hora.dia.equals("Lunes")){
			Lunes.add(hora);
		}
		if(hora.dia.equals("Martes")){
			Martes.add(hora);
		}
		if(hora.dia.equals("Miercoles")){
			Miercoles.add(hora);
		}
		if(hora.dia.equals("Jueves")){
			Jueves.add(hora);
		}
		if(hora.dia.equals("Viernes")){
			Viernes.add(hora);
		}
	}
	
	public void ocupar(Hora hora){
		if(hora.dia.equals("Lunes")){
			for(int i = 0; i < Lunes.size(); i++){
				if(Lunes.get(i).hora == hora.hora){
					Lunes.get(i).ocupado = 1;
				}
			}
		}
		if(hora.dia.equals("Martes")){
			for(int i = 0; i < Martes.size(); i++){
				if(Martes.get(i).hora == hora.hora){
					Martes.get(i).ocupado = 1;
				}
			}
		}
		if(hora.dia.equals("Miercoles")){
			for(int i = 0; i < Miercoles.size(); i++){
				if(Miercoles.get(i).hora == hora.hora){
					Miercoles.get(i).ocupado = 1;
				}
			}
		}
		if(hora.dia.equals("Jueves")){
			for(int i = 0; i < Jueves.size(); i++){
				if(Jueves.get(i).hora == hora.hora){
					Jueves.get(i).ocupado = 1;
				}
			}
		}
		if(hora.dia.equals("Viernes")){
			for(int i = 0; i < Viernes.size(); i++){
				if(Viernes.get(i).hora == hora.hora){
					Viernes.get(i).ocupado = 1;
				}
			}
		}
	}
	
	public void desocupar(Hora hora){
		if(hora.dia.equals("Lunes")){
			for(int i = 0; i < Lunes.size(); i++){
				if(Lunes.get(i).hora == hora.hora){
					Lunes.get(i).ocupado = 0;
				}
			}
		}
		if(hora.dia.equals("Martes")){
			for(int i = 0; i < Martes.size(); i++){
				if(Martes.get(i).hora == hora.hora){
					Martes.get(i).ocupado = 0;
				}
			}
		}
		if(hora.dia.equals("Miercoles")){
			for(int i = 0; i < Miercoles.size(); i++){
				if(Miercoles.get(i).hora == hora.hora){
					Miercoles.get(i).ocupado = 0;
				}
			}
		}
		if(hora.dia.equals("Jueves")){
			for(int i = 0; i < Jueves.size(); i++){
				if(Jueves.get(i).hora == hora.hora){
					Jueves.get(i).ocupado = 0;
				}
			}
		}
		if(hora.dia.equals("Viernes")){
			for(int i = 0; i < Viernes.size(); i++){
				if(Viernes.get(i).hora == hora.hora){
					Viernes.get(i).ocupado = 0;
				}
			}
		}
	}
	
	public void desocuparTodo(){
		for(int i = 0; i < Lunes.size(); i++){
			Lunes.get(i).ocupado = 0;
		}
		for(int i = 0; i < Martes.size(); i++){
			Martes.get(i).ocupado = 0;
		}
		for(int i = 0; i < Miercoles.size(); i++){
			Miercoles.get(i).ocupado = 0;
		}
		for(int i = 0; i < Jueves.size(); i++){
			Jueves.get(i).ocupado = 0;
		}
		for(int i = 0; i < Viernes.size(); i++){
			Viernes.get(i).ocupado = 0;
		}
	}
}
