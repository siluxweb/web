





package co.ufps.edu.dto;


import java.io.Serializable;


public class Usuario implements Serializable {
    private  int idusuario;
    private String nombre;
    private String login;
    private String passworD;
    private int tipo;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassworD() {
        return passworD;
    }

    public void setPassworD(String passworD) {
        this.passworD = passworD;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
