package model;

import java.util.List;

import entities.Sesion;

public interface SesionDaoM {
	public List<Sesion> list();
	public Sesion find(int id);
	public void insert(Sesion o);
	public void update(Sesion o);
	public void delete(Sesion o);
}
