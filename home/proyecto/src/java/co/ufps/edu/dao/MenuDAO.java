/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;

import co.ufps.edu.dto.Menu;
import co.ufps.edu.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ufps.edu.co.utils.conexion.Conexion;

/**
 *
 * @author macaco
 */
public class MenuDAO {
    
    private Conexion conexion;
    public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
    
    public List <Menu> ListarMenu(int  tipo){
        ArrayList<Menu>menus= new ArrayList();
		Menu menu=null;
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rst=null;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("Usuario.registrarUsuario");
			else con= conexion.getConnection();
			String sql = "SELECT * FROM menu "
					+    "WHERE tipo = ? ";
			ps = con.prepareStatement(sql);
		 ps.setInt(1, tipo);

			rst = ps.executeQuery();
			
			while(rst.next()){
				menu = new Menu();
				
menu.setNombre(rst.getString(1));

menu.setUrl(rst.getString(2));
menu.setTipo(rst.getInt(3));
menus.add(menu);

                        }
			
		} catch (Exception e) {
                    System.out.println("error "+e.toString());
			e.printStackTrace();
			conexion.escribirLogs("UsuarioDao", "registrarUsuario", e.toString());
                       
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				conexion.escribirLogs("UsuarioDao", "registrarUsuario", e2.toString());
			}
						
			ps=null;
			con=null;
		}
		
		return menus;
	}
	
    
    
}
