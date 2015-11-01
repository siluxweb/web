/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.ufps.edu.facade;

import co.ufps.edu.dto.Menu;
import co.ufps.edu.dto.Usuario;
import co.ufps.edu.negocio.validarsesion;
import java.util.List;

/**
 *
 * @author macaco
 */
public class InicioSession {
    
    private validarsesion validar;
    
    public InicioSession(){
        validar = new validarsesion();
    }
    
    
    public Usuario verifcarLogin(Usuario user){
        return validar.verificarLogin(user);
    }
    
    public List<Menu> Menu (int tipo){
        return validar.listarmenu(tipo);
    }
}
