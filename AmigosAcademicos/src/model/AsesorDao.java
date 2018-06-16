package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Asesor;
import entities.Asesoria;
import util.Conexion;

public class AsesorDao implements AsesorDaoM{

	private Conexion cn;
    List<Asesor> asesores;

    public AsesorDao() {
        this.cn = Conexion.getConexion();
    }
	
	@Override
	public List<Asesor> list() {
		AsesoriaDao aseD; 
		HorarioDao hod;
		String sql = "select * from asesor";
		asesores = new ArrayList<Asesor>();

        try {
            ResultSet res = cn.find(sql);
            while (res.next()) {
            	Asesor c = new Asesor();
            	aseD = new AsesoriaDao();
                List<Asesoria> asesorias = new ArrayList<>();
                asesorias = aseD.list();
                for(int i = 0; i < asesorias.size(); i++){
                	if(asesorias.get(i).idAsesor == res.getInt(2)){
                		c.asesorias.add(asesorias.get(i));
                	}
                }
                hod = new HorarioDao();
                c.horarioAsesorias = hod.buscarPorAsesor(res.getInt(2));
                c.nombre = res.getString(1);
                c.codigo = res.getInt(2);
                c.semestre = res.getInt(3);
                c.carrera = res.getString(4);
                c.materia = res.getString(5);
                c.puntuacion = res.getInt(6);
            	c.puntuaciones = res.getInt(7);
            	c.puntuaPromedio = res.getFloat(8);
            	c.celular = res.getInt(9);
            	c.clave = res.getString(10);
            	c.documento = res.getInt(11);
                asesores.add(c);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return asesores;
	}

	@Override
	public Asesor find(int id) {
		AsesoriaDao aseD; 
		HorarioDao hod;
		try {
            ResultSet res = cn.find("SELECT * FROM asesor where codigo = " + id + " ");
            while (res.next()) {
            	Asesor o = new Asesor();
            	aseD = new AsesoriaDao();
                List<Asesoria> asesorias = new ArrayList<>();
                asesorias = aseD.list();
                for(int i = 0; i < asesorias.size(); i++){
                	if(asesorias.get(i).idAsesor == id){
                		o.asesorias.add(asesorias.get(i));
                	}
                }
                hod = new HorarioDao();
                o.horarioAsesorias = hod.buscarPorAsesor(id);
            	o.nombre = res.getString("nombre");
            	o.codigo = res.getInt("codigo");
            	o.semestre = res.getInt("semestre");
            	o.carrera = res.getString("carrera");
            	o.materia = res.getString("materia");
            	o.puntuacion = res.getInt("puntuacion");
            	o.puntuaciones = res.getInt("puntuaciones");
            	o.puntuaPromedio = res.getFloat("puntuacionprom");
            	o.celular = res.getInt("celular");
            	o.clave = res.getString("clave");
            	o.documento = res.getInt("cedula");
                return o;
            }
            res.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
	}

	@Override
	public void insert(Asesor o) {
		try {
            String consulta = "INSERT INTO asesor (nombre, codigo, semestre, carrera, materia, puntuacion, puntuaciones, puntuacionprom, celular, clave, cedula) VALUES ('" + o.nombre + "', " + "'" + o.codigo + "', " + "'" + o.semestre + "', " + "'" + o.carrera + "', " + "'" + o.materia + "', " + "'" + o.puntuacion + "', " + "'" + o.puntuaciones + "', " + "'" + o.puntuaPromedio + "', " + "'" + o.celular + "', " + "'" + o.clave + "', " + "'" + o.documento + "')";
            System.out.println(consulta);
            cn.insert(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void update(Asesor o) {
		String sql = "UPDATE asesor SET nombre='" + o.nombre + "'," + "semestre='" + o.semestre + "'," + "carrera='" + o.carrera + "'," + "materia='" + o.materia + "'," + "puntuacion='" + o.puntuacion + "'," + "puntuaciones='" + o.puntuaciones + "'," + "puntuacionprom='" + o.puntuaPromedio + "'," + "celular='" + o.celular + "'," + "clave='" + o.clave + "'," + "cedula='" + o.documento + "'" + " WHERE codigo=" + o.codigo;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void delete(Asesor o) {
		try {
            cn.clear("asesor", "codigo",o.codigo);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}

}