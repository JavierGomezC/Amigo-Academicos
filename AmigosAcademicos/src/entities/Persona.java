package entities;

public class Persona {

	public String nombre;
	public int codigo;
	public int semestre;
	public String carrera;
	public int celular;
	public String clave;
	public int documento;
	
	public Persona(){
		
	}
	
	public Persona(String nom, int cod, int sem, String car, int cel, String clave, int doc){
		this.nombre = nom;
		this.codigo = cod;
		this.semestre = sem;
		this.carrera = car;
		this.celular = cel;
		this.clave = clave;
		this.documento = doc;
	}
}
