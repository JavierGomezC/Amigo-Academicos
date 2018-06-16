package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Hora;
import util.Conexion;

public class HoraDao implements HoraDaoM{

	private Conexion cn;
    List<Hora> horas;
	
    public HoraDao() {
        this.cn = Conexion.getConexion();
    }
    
	@Override
	public List<Hora> list() {
		String sql = "select * from hora";
		horas = new ArrayList<Hora>();

        try {
            ResultSet res = cn.find(sql);
            while (res.next()) {
            	Hora c = new Hora();
                c.hora = res.getInt(1);
                c.minuto = res.getInt(2);
                c.dia = res.getString(3);
                c.ocupado = res.getInt(4);
                c.idHorario = res.getInt(5);
                c.idAsesoria = res.getInt(6);
                c.id = res.getInt(7);
                horas.add(c);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return horas;
	}

	@Override
	public Hora find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Hora o) {
		try {
            String consulta = "INSERT INTO hora (hora, minuto, dia, ocupado, idHorario, idAsesoria, id) VALUES ('" + o.hora + "', " + "'" + o.minuto + "', " + "'" + o.dia + "', " + "'" + o.ocupado + "', " + "'" + o.idHorario + "', " + "'" + o.idAsesoria + "', " + "'" + o.id + "')";
            System.out.println(consulta);
            cn.insert(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void update(Hora o) {
		String sql = "UPDATE hora SET hora='" + o.hora + "'," + "minuto='" + o.minuto + "'," + "dia='" + o.dia + "'," + "ocupado='" + o.ocupado + "'," + "idAsesoria='" + o.idAsesoria + "'," + "idHorario='" + o.idHorario + "'" + " WHERE id=" + o.id;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	public void updateHorario(Hora o) {
		String sql = "UPDATE hora SET hora='" + o.hora + "'," + "minuto='" + o.minuto + "'," + "dia='" + o.dia + "'," + "ocupado='" + o.ocupado + "'," + "idAsesoria='" + o.idAsesoria + "'," + "id='" + o.id + "'" + " WHERE idHorario=" + o.idHorario;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}
	
	public void updateAsesoria(Hora o) {
		String sql = "UPDATE hora SET hora='" + o.hora + "'," + "minuto='" + o.minuto + "'," + "dia='" + o.dia + "'," + "ocupado='" + o.ocupado + "'," + "idHorario='" + o.idHorario + "'," + "id='" + o.id + "'" + " WHERE idAsesoria=" + o.idAsesoria;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}
	
	@Override
	public void delete(Hora o) {
		try {
            cn.clear("hora", "id",o.id);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}
	
	public void deleteHorario(Hora o) {
		try {
            cn.clear("hora", "idHorario",o.idHorario);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}
	
	public void deleteAsesoria(Hora o) {
		try {
            cn.clear("hora", "idAsesoria",o.idAsesoria);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}
}
