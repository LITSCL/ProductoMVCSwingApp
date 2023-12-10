package cl.inacap.productomvcswingapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class BDUtil {
	private final String servidor = "localhost"; 
	private final String baseDeDatos = "dbproductomvcswingapp"; 
	private final String usuario = "root"; 
	private final String clave = "root"; 
	private Connection conexion;
	
	public boolean conectar() {
		try {
			String url = "jdbc:mysql://" + servidor + ":3306/" + baseDeDatos; 
			Class.forName("com.mysql.jdbc.Driver");
			this.conexion=DriverManager.getConnection(url, usuario, clave);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public Connection getConexion() {
		return conexion;
	}
	
	public void desconectar() {
		try {
			this.conexion.close();	
		} catch (Exception ex) {
			
		}
	}
} 
