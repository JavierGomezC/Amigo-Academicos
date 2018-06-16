package entities;

public class Asesoria {

	public int id;
	public int idAsesor;
	public int idEstudiante;
	public String tema;
	public Fecha fecha;
	public Hora hora;
	public boolean terminada;
	
	public Asesoria(){
		
	}
	
	public Asesoria (int id, int ase, int es, String tem, Fecha fe, Hora ho){
		this.id = id;
		this.idAsesor = ase;
		this.idEstudiante = es;
		this.tema = tem;
		this.fecha = fe;
		this.hora = ho;
		this.terminada = false;
	}
}
