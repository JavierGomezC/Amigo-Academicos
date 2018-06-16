package model;

import java.util.List;

import entities.Estudiante;

public interface EstudianteDaoM {
	public List<Estudiante> list();
	public Estudiante find(int id);
	public void insert(Estudiante o);
	public void update(Estudiante o);
	public void delete(Estudiante o);
}
