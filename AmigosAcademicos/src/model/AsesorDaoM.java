package model;

import java.util.List;

import entities.Asesor;

public interface AsesorDaoM {
	public List<Asesor> list();
	public Asesor find(int id);
	public void insert(Asesor o);
	public void update(Asesor o);
	public void delete(Asesor o);
}
