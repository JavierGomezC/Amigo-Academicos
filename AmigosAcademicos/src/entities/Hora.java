package entities;

public class Hora {
	
	public int hora;
	public int minuto;
	public String dia;
	public int ocupado;
	
	public int idAsesoria;
	public int idHorario;
	public int id;
	
	public Hora(){}
	
	public Hora(int h, int m, String d, int id){
		hora = h;
		minuto = m;
		dia = d;
		this.id = id;
		ocupado = 0;
		idAsesoria = 0;
		idHorario = 0;
	}
}
