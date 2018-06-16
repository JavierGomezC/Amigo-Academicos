package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Asesoria;
import entities.Fecha;
import util.Conexion;

public class AsesoriaDao implements AsesoriaDaoM{

	private Conexion cn;
    List<Asesoria> asesorias;
	
    public AsesoriaDao() {
        this.cn = Conexion.getConexion();
    }
    
	@Override
	public List<Asesoria> list() {
		String sql = "select * from asesoria";
		asesorias = new ArrayList<Asesoria>();

        try {
            ResultSet res = cn.find(sql);
            while (res.next()) {
            	Asesoria c = new Asesoria();
                c.id = res.getInt(1);
                c.idAsesor = res.getInt(2);
                c.idEstudiante = res.getInt(3);
                c.tema = res.getString(4);
                c.terminada = res.getBoolean(5);
                Fecha fe = new Fecha(res.getInt(6), res.getInt(7), res.getInt(8));
                c.fecha = fe;
                asesorias.add(c);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return asesorias;
	}

	@Override
	public Asesoria find(int id) {
		try {
            ResultSet res = cn.find("SELECT * FROM asesoria where id = " + id + " ");
            while (res.next()) {
            	Asesoria c = new Asesoria();
            	c.id = res.getInt("id");
                c.idAsesor = res.getInt("idAsesor");
                c.idEstudiante = res.getInt("idEstudiante");
                c.tema = res.getString("tema");
                c.terminada = res.getBoolean("terminada");
                Fecha fe = new Fecha(res.getInt("dia"), res.getInt("mes"), res.getInt("anio"));
                c.fecha = fe;
                return c;
            }
            res.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
	}

	@Override
	public void insert(Asesoria o) {
		try {
            String consulta = "INSERT INTO asesoria (id, idAsesor, idEstudiante, tema, terminada, dia, mes, anio) VALUES ('" + o.id + "', " + "'" + o.idAsesor + "', " + "'" + o.idEstudiante + "', " + "'" + o.tema + "', " + "'" + o.fecha.dia + "', " + "'" + o.fecha.mes + "', " + "'" + o.fecha.anio + "')";
            System.out.println(consulta);
            cn.insert(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void update(Asesoria o) {
		String sql = "UPDATE asesoria SET idAsesor='" + o.idAsesor + "'," + "idEstudiante='" + o.idEstudiante + "'," + "tema='" + o.tema + "'," + "terminada='" + o.terminada + "'," + "dia='" + o.fecha.dia + "'," + "mes='" + o.fecha.mes + "'," + "anio='" + o.fecha.anio + "'" + " WHERE id=" + o.id;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void delete(Asesoria o) {
		try {
            cn.clear("asesoria", "id",o.id);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}
}