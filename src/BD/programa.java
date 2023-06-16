package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class programa {
    BDConnect cc= new BDConnect();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps= null;
    String []  nombresColumnas = {"ID","Descripcion","Duracion"};
    String [] registros = new String[3];

    public programa(){
        cn= cc.conexion();
    }
    DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

    public DefaultTableModel mostrarPrograma(){
        //Statement st = cn.createStatement();
        try{
            ps = cn.prepareStatement("SELECT * FROM programa");
            rs = ps.executeQuery();
            while(rs.next()){
                registros [0] = rs.getString(1);
                registros [1] = rs.getString(2);
                registros [2] = rs.getString(3);
                modelo.addRow(registros);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return modelo;
    }

    public void DeletePrograma(int id){
        try{
            ps = cn.prepareStatement("DELETE FROM programa WHERE idprograma = "+id+";");
            int registro = ps.executeUpdate();
            if (registro>0) {

                JOptionPane.showMessageDialog(null, "ELIMINACION COMPLETADA CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "El ID NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR: "+e.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InsertProgram(int id, String descrip, int duracion){
        try(Statement stm = cn.createStatement()){
            rs = stm.executeQuery("SELECT * FROM programa WHERE idprograma = "+id+";");
            rs.next();
            rs.getInt("idprograma");
            JOptionPane.showMessageDialog(null, "EL ID YA ESTA REGISTRADO!!!"
                    + "", "ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            try{
                ps = cn.prepareStatement("INSERT INTO programa"
                        + "(idprograma, descripcion, duración)"
                        + " VALUES (?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, descrip);
                ps.setInt(3, duracion);
                int registro = ps.executeUpdate();
                if (registro>0) {

                    JOptionPane.showMessageDialog(null, "REGISTRO COMPLETADO CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR DATOS :"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }


        }
    }

}
