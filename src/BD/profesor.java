package BD;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class profesor {
    BDConnect cc= new BDConnect();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst= null;
    String []  nombresColumnas = {"ID","Nombre","Telefono","Correo","Sexo"};
    String [] registros = new String[5];

    public profesor(){
        cn= cc.conexion();

    }

    DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

    public DefaultTableModel mostrarP(){

        try{
            pst = cn.prepareStatement("SELECT * FROM profesor");
            rs = pst.executeQuery();
            while(rs.next()){
                registros [0] = rs.getString(1);
                registros [1] = rs.getString(2);
                registros [2] = rs.getString(3);
                registros [3] = rs.getString(4);
                registros [4] = rs.getString(5);
                modelo.addRow(registros);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR: "+e.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return modelo;
    }

    public void DeleteProfesor(int id){

        try{
            pst = cn.prepareStatement("DELETE FROM profesor WHERE idprofesor = "+id+";");
            int registro = pst.executeUpdate();
            if (registro>0) {

                JOptionPane.showMessageDialog(null, "ELIMINACION COMPLETADA CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "El ID NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR: "+e.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InsertPro(int id, String nombre, String tel, String mail, String sex){

        try(Statement stm = cn.createStatement()){
            rs = stm.executeQuery("SELECT * FROM profesor WHERE idprofesor = "+id+";");
            rs.next();
            rs.getInt("idprofesor");
            JOptionPane.showMessageDialog(null, "EL ID YA ESTA REGISTRADO!!!"
                    + "", "ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            try{
                pst = cn.prepareStatement("INSERT INTO profesor"
                        + "(idprofesor, nombre, telefono, correo, sexo) "
                        + "VALUES (?,?,?,?,?)");
                pst.setInt(1, id);
                pst.setString(2, nombre);
                pst.setString(3, tel);
                pst.setString(4, mail);
                pst.setString(5, sex);
                //ps.executeUpdate();
                int registro = pst.executeUpdate();
                if (registro>0) {

                    JOptionPane.showMessageDialog(null, "REGISTRO COMPLETADO CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR DATOS :"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}