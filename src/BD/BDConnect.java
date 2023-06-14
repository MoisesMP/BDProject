package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class BDConnect {
    Connection Connect=null; //Connection Reference Statement
    String Driver =  "com.mysql.cj.jdbc.Driver"; //Add Driver
    String url ="jdbc:mysql://localhost/estudiante"; // ?autoReconnet=true&useSSL=false";
    String user = "root";
    String password = "";

    public Connection conexion(){
        try{
            Class.forName(Driver);//.newInstance();
            Connect = DriverManager.getConnection(url, user, password);
            //conectar=DriverManager.getConnection("jdbc:mysql://localhost/estudiante","root",""); // Default Config
            //System.out.print("Successful\n");
            //JOptionPane.showMessageDialog(null, "Successful");

        }catch(ClassNotFoundException e){
            System.out.print("Class Not Found Exception : "+e.getMessage());
            //JOptionPane.showMessageDialog(null,"Class Not Found Exception : "+e.getMessage()); //Error Code
        }catch(SQLException e){
            System.out.print("Database connection failed, Error: "+e.getMessage());
            //JOptionPane.showMessageDialog(null, "Database connection failed, Error:  "+e.getMessage()); // Error Code
        }
  /*catch(Exception e) {
             JOptionPane.showMessageDialog(null, "Database connection failed, Error:  "+e.getStackTrace()); // Error Code
 }  */
        return Connect;
    }
}