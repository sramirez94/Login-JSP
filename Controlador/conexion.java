/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Salvador RL
 */
public class conexion {
    ResultSet res=null;
    private Connection con= null;
    Statement st=null;
    String driver="org.postgresql.Driver";
    String url="jdbc:postgresql://127.0.0.1/seg_informatica";
    String userDB="postgres";
    String passDB="11julio1994";
    public conexion(){
        conectar();
    }
    public int conectar(){
        try{
            Class.forName(driver);
        }
        catch (ClassNotFoundException e){
            System.out.println("No se pudo cargal el driver :-( "+driver);
			return -1;
        }
        try{
            con=DriverManager.getConnection(url,userDB,passDB);
        }
        catch(SQLException e){
            System.out.println("No se pudo realizar la conexion :-(");
			return -2;
        }
	return 1;
    }
     public ResultSet consultar(String sql){
         try{
            st=getCon().createStatement();
            res= st.executeQuery(sql);
         }
        catch(SQLException e){
            return null;
        }
         return res;
     }
     public int verificar(String sql){
        try{
            st=getCon().createStatement();
            res= st.executeQuery(sql);
            if (res.next())
                return 1;
            st.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return -1;
    }
       public Connection getCon() {
        return con;
    }
}
