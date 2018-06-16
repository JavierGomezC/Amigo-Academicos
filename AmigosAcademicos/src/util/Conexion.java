package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	private static Conexion db;
    private Statement statement;
    
    private String Usuario = "root";
    private String Password = "";
    private String Host = "localhost";
    private String Puerto = "3306";
    private String BasedeDatos = "amigos_academicos";
    private String NombreDeClase = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://" + Host + ":" + Puerto + "/" + BasedeDatos;
    public static Connection con;

    public Conexion() {
        try {
            Class.forName(NombreDeClase);
            System.out.println("Conectado");

            con = (Connection)DriverManager.getConnection(URL, Usuario, Password);
        } catch (SQLException e) {
            System.err.println("ERROR  " + e);
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR  " + e);
        }

    }

    public static Conexion getConexion() {
        if(db == null){
            db = new Conexion();
        }
        return db;
    }
    
    public ResultSet find(String query) throws SQLException{
        statement = db.con.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
    
    public int insert(String insertQuery) throws SQLException{
        statement = db.con.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
    }
    
    public boolean clear(String clearQuery, String cod, int id) throws SQLException {
        statement = db.con.createStatement();
        boolean res = statement.execute("DELETE FROM "+clearQuery+" WHERE "+cod+" = "+id);
        return res;
    }
}