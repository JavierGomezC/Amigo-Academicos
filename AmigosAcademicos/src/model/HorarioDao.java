package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Hora;
import entities.Horario;
import util.Conexion;

public class HorarioDao implements HorarioDaoM{
	
	private Conexion cn;
    List<Horario> horarios;
	
    public HorarioDao() {
        this.cn = Conexion.getConexion();
    }
    
	@Override
	public List<Horario> list() {
	    HoraDao horasd;
		String sql = "select * from horario";
		horarios = new ArrayList<Horario>();

        try {
            ResultSet res = cn.find(sql);
            while (res.next()) {
            	Horario c = new Horario();
                c.id = res.getInt(1);
                horasd = new HoraDao();
                List<Hora> horas = new ArrayList<>();
                horas = horasd.list();
                for(int i = 0; i < horas.size(); i++){
                	if(horas.get(i).idHorario == c.id){
                		if(horas.get(i).dia.equals("Lunes")){
                			c.Lunes.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Martes")){
                			c.Martes.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Miercoles")){
                			c.Miercoles.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Jueves")){
                			c.Jueves.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Viernes")){
                			c.Viernes.add(horas.get(i));
                		}
                	}
                }
                c.idAsesor = res.getInt(2);
                horarios.add(c);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return horarios;
	}
	
	public Horario buscarPorAsesor(int id){
		HoraDao horasd; 
		try {
            ResultSet res = cn.find("SELECT * FROM horario where idAsesor = " + id + " ");
            while (res.next()) {
            	Horario o = new Horario();
            	o.id = res.getInt("id");
            	o.idAsesor = res.getInt("idAsesor");
            	horasd = new HoraDao();
                List<Hora> horas = new ArrayList<>();
                horas = horasd.list();
                for(int i = 0; i < horas.size(); i++){
                	if(horas.get(i).idHorario == o.id){
                		if(horas.get(i).dia.equals("Lunes")){
                			o.Lunes.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Martes")){
                			o.Martes.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Miercoles")){
                			o.Miercoles.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Jueves")){
                			o.Jueves.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Viernes")){
                			o.Viernes.add(horas.get(i));
                		}
                	}
                }
                return o;
            }
            res.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
	}

	@Override
	public Horario find(int id) {
		HoraDao horasd; 
		try {
            ResultSet res = cn.find("SELECT * FROM horario where id = " + id + " ");
            while (res.next()) {
            	Horario o = new Horario();
            	o.id = res.getInt("id");
            	o.idAsesor = res.getInt("idAsesor");
            	horasd = new HoraDao();
                List<Hora> horas = new ArrayList<>();
                horas = horasd.list();
                for(int i = 0; i < horas.size(); i++){
                	if(horas.get(i).idHorario == o.id){
                		if(horas.get(i).dia.equals("Lunes")){
                			o.Lunes.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Martes")){
                			o.Martes.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Miercoles")){
                			o.Miercoles.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Jueves")){
                			o.Jueves.add(horas.get(i));
                		}
                		if(horas.get(i).dia.equals("Viernes")){
                			o.Viernes.add(horas.get(i));
                		}
                	}
                }
                return o;
            }
            res.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
	}

	@Override
	public void insert(Horario o) {
		try {
            String consulta = "INSERT INTO horario (id, idAsesor) VALUES ('" + o.id + "', " + "'" + o.idAsesor + "')";
            System.out.println(consulta);
            cn.insert(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void update(Horario o) {
		String sql = "UPDATE horario SET idAsesoria='" + o.idAsesor + "'" + " WHERE id=" + o.id;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void delete(Horario o) {
		try {
            cn.clear("horario", "id",o.id);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}

}
