package model;

import java.util.List;

import entities.Horario;

public interface HorarioDaoM {
	public List<Horario> list();
	public Horario find(int id);
	public void insert(Horario o);
	public void update(Horario o);
	public void delete(Horario o);
}
