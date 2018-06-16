package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Asesoria;
import entities.Estudiante;
import util.Conexion;

public class EstudianteDao implements EstudianteDaoM{

	private Conexion cn;
    List<Estudiante> estudiantes;
	
    public EstudianteDao() {
        this.cn = Conexion.getConexion();
    }
    
	@Override
	public List<Estudiante> list() {
		AsesoriaDao aseD; 
		String sql = "select * from estudiante";
		estudiantes = new ArrayList<Estudiante>();

        try {
            ResultSet res = cn.find(sql);
            
            while (res.next()) {
            	Estudiante c = new Estudiante();
            	aseD = new AsesoriaDao();
                List<Asesoria> asesorias = new ArrayList<>();
                asesorias = aseD.list();
                for(int i = 0; i < asesorias.size(); i++){
                	if(asesorias.get(i).idEstudiante == res.getInt(2)){
                		c.asesorias.add(asesorias.get(i));
                	}
                }
                c.nombre = res.getString(1);
                c.codigo = res.getInt(2);
                c.semestre = res.getInt(3);
                c.carrera = res.getString(4);
            	c.celular = res.getInt(5);
            	c.clave = res.getString(6);
            	c.documento = res.getInt(7);
            	estudiantes.add(c);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return estudiantes;
	}

	@Override
	public Estudiante find(int id) {
		AsesoriaDao aseD; 
		try {
            ResultSet res = cn.find("SELECT * FROM estudiante where codigo = " + id + " ");
            while (res.next()) {
            	Estudiante o = new Estudiante();
            	aseD = new AsesoriaDao();
                List<Asesoria> asesorias = new ArrayList<>();
                asesorias = aseD.list();
                for(int i = 0; i < asesorias.size(); i++){
                	if(asesorias.get(i).idAsesor == id){
                		o.asesorias.add(asesorias.get(i));
                	}
                }
            	o.nombre = res.getString("nombre");
            	o.codigo = res.getInt("codigo");
            	o.semestre = res.getInt("semestre");
            	o.carrera = res.getString("carrera");
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
	public void insert(Estudiante o) {
		try {
            String consulta = "INSERT INTO estudiante (nombre, codigo, semestre, carrera, celular, clave, cedula) VALUES ('" + o.nombre + "', " + "'" + o.codigo + "', " + "'" + o.semestre + "', " + "'" + o.carrera + "', " + "'" + o.celular + "', " + "'" + o.clave + "', " + "'" + o.documento + "')";
            System.out.println(consulta);
            cn.insert(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void update(Estudiante o) {
		String sql = "UPDATE estudiante SET nombre='" + o.nombre + "'," + "semestre='" + o.semestre + "'," + "carrera='" + o.carrera + "'," + "celular='" + o.celular + "'," + "clave='" + o.clave + "'," + "cedula='" + o.documento + "'" + " WHERE codigo=" + o.codigo;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void delete(Estudiante o) {
		try {
            cn.clear("estudiante", "codigo",o.codigo);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}

}
