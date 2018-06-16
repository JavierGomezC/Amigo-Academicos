package model;

import java.util.List;

import entities.Hora;

public interface HoraDaoM {
	public List<Hora> list();
	public Hora find(int id);
	public void insert(Hora o);
	public void update(Hora o);
	public void delete(Hora o);
}
