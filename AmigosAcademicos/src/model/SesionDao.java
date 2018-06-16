package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Sesion;
import util.Conexion;

public class SesionDao implements SesionDaoM{

	private Conexion cn;
    List<Sesion> sesions;

    public SesionDao() {
        this.cn = Conexion.getConexion();
    }
	
	@Override
	public List<Sesion> list() {
		String sql = "select * from sesion";
		sesions = new ArrayList<Sesion>();

        try {
            ResultSet res = cn.find(sql);
            while (res.next()) {
            	Sesion c = new Sesion();
                c.idActualA = res.getInt(1);
                c.idActualE = res.getInt(2);
                c.id = res.getInt(3);
            	sesions.add(c);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return sesions;
	}

	@Override
	public Sesion find(int id) {
		try {
            ResultSet res = cn.find("SELECT * FROM sesion where id = " + id + " ");
            while (res.next()) {
            	Sesion o = new Sesion();
            	o.idActualA = res.getInt("idActualA");
                o.idActualE = res.getInt("idActualE");
                o.id = res.getInt("id");
                return o;
            }
            res.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
	}

	@Override
	public void insert(Sesion o) {
		try {
            String consulta = "INSERT INTO sesion (idActualA, idActualE, id) VALUES ('" + o.idActualA + "', " + "'" + o.idActualE + "', " + "'" + o.id + "')";
            System.out.println(consulta);
            cn.insert(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void update(Sesion o) {
		String sql = "UPDATE sesion SET idActualA='" + o.idActualA + "'," + "idActualE='" + o.idActualE + "'" + " WHERE id=" + o.id;
        try {
            cn.insert(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}

	@Override
	public void delete(Sesion o) {
		try {
            cn.clear("asesor", "id",o.id);
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
	}

}
