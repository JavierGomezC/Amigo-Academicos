package model;

import java.util.List;

import entities.Asesoria;

public interface AsesoriaDaoM {
	public List<Asesoria> list();
	public Asesoria find(int id);
	public void insert(Asesoria o);
	public void update(Asesoria o);
	public void delete(Asesoria o);
}
