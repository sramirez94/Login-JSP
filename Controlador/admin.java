/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Salvador RL
 */
public class admin {
    private String usuario;
    private String contrasena;
    private conexion cnn = new conexion();
    public String insertar3(){
        if ((verificau(usuario, contrasena)==true)&&verificac(usuario, contrasena)==true){
            return "-1";
        }
        return "1";
    }
    public boolean verificau(String key, String pss){
        String sql = "SELECT * FROM users WHERE usuario = '" + key.toString() + 
                "' AND contrasena = '" + pss.toString() + "'";
        if(getCnn().verificar(sql) ==1)
            return true;
            return false;
    }
    public boolean verificac(String key, String pss){
        String sql = "SELECT * FROM users WHERE usuario = '" + key.toString() 
                + "' AND contrasena = '" + pss.toString() + "'";
        if(getCnn().verificar(sql) == 1)
            return true;
            return false;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena(){
        return contrasena;
    }
    public void setcontrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public conexion getCnn(){
        return cnn;
    }
}
