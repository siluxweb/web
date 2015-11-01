/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.dao;

import co.ufps.edu.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ufps.edu.co.utils.conexion.Conexion;

/**
 *
 * @author macaco
 */
public class UsuarioDAO {
    private Conexion conexion;
    public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
    
    public Usuario buscarUsuario(String login){
		Usuario usuario=null;
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rst=null;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("Usuario.registrarUsuario");
			else con= conexion.getConnection();
			String sql = "SELECT * FROM usuario "
					+    "WHERE login = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, login);
			rst = ps.executeQuery();
			
			if(rst.next()){
				usuario = new Usuario();
				
				usuario.setIdusuario(rst.getInt(1));
				usuario.setNombre(rst.getString(2));
				usuario.setLogin(rst.getString(3));
				usuario.setPassworD(rst.getString(4));
				usuario.setTipo(rst.getInt(5));
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
		
		return usuario;
	}
	
    
}
