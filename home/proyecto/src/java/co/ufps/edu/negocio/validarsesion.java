/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.negocio;

import co.ufps.edu.dao.MenuDAO;
import co.ufps.edu.dao.UsuarioDAO;
import co.ufps.edu.dto.Menu;
import co.ufps.edu.dto.Usuario;
import java.util.List;

/**
 *
 * @author macaco
 */
public class validarsesion {
    private UsuarioDAO usuarioDao;
    private MenuDAO menudao;
	
	public validarsesion() {
		usuarioDao = new UsuarioDAO();
                menudao= new MenuDAO();
	}
    public Usuario verificarLogin(Usuario usuario){
		try {
			String password = usuario.getPassworD();
			usuario = usuarioDao.buscarUsuario(usuario.getLogin());
			if (usuario!=null){ 
				if (!password.equals(usuario.getPassworD())) 
                                    usuario=null;
			} 
		} catch (Exception e) {
			e.printStackTrace();
			usuario=null;
                        System.out.println("error");
			usuarioDao.getConexion().escribirLogs("VerificarSesion", "verificarLogin", e.toString());
		}
		return usuario;
	}
    
    public List<Menu>listarmenu(int tipo){
        return menudao.ListarMenu(tipo);
    }
}
