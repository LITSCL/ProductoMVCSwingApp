package cl.inacap.productomvcswingapp.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.inacap.productomvcswingapp.model.dto.Producto;
import cl.inacap.productomvcswingapp.util.BDUtil;


public class ProductoDAO {
	private BDUtil bdUtil = new BDUtil();
	
	public boolean save(Producto pr) {
		boolean resultado;
		try {
			System.out.println("Conexi�n a la DB: " + bdUtil.conectar());
			String sql = "INSERT INTO producto" + "(nombre,precio,stock)" + " VALUES('" + pr.getNombre() + "','" + pr.getPrecio() + "','" + pr.getStock() + "')"; 
			Statement st = bdUtil.getConexion().createStatement();
			st.executeUpdate(sql);
			resultado = true;
			System.out.println("Ejecuci�n del SQL: " + resultado);
		} catch (Exception ex) {
			resultado = false;
			System.out.println("Ejecuci�n del SQL: " + resultado);
			
		} finally { 
			bdUtil.desconectar(); 
		}
		return resultado;
	}
	
	public List<Producto> getAll(){
		List<Producto> productos = new ArrayList<Producto>();
		
		boolean resultado;
		try {
			
			System.out.println("Conexi�n a la DB: " + bdUtil.conectar());
		
			String sql = "SELECT nombre,precio,sotck" + " FROM producto";
			PreparedStatement st = bdUtil.getConexion().prepareStatement(sql); 
		
			ResultSet rs=st.executeQuery();
			resultado=true;
			System.out.println("Ejecuci�n del SQL: " + resultado);
			while (rs.next()) { 
				Producto pr = new Producto();
				pr.setNombre(rs.getString(1));
				pr.setPrecio(rs.getInt(2));
				pr.setStock(rs.getInt(3));
				
				productos.add(pr);
			}
			rs.close(); 
		} catch (Exception ex) {
			resultado = false;
			System.out.println("Ejecuci�n del SQL: " + resultado);
			productos = null;
			
		} finally { 
			bdUtil.desconectar(); 
		}

		return productos;
	}
}
