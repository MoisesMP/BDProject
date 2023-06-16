package BD;

import Entidades.Programas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class modulo {
    BDConnect cc= new BDConnect();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst= null;
    String [] nombresColumnas = {"ID","Descripcion","Numero de Creditos","ID Programa"};
    String [] registros = new String[4];

    public modulo(){
        cn= cc.conexion();
    }

    public ArrayList<Programas> getProgramas(){
        ArrayList<Programas> ListaProgramas= new ArrayList();
        //String SQL = "SELECT programa.idprograma, programa.descripcion, programa.duración FROM estudiante INNER JOIN programa ON estudiante.idprograma = programa.idprograma;";
        Programas progr = new Programas(0, "Seleccione un Programa", 0);
        ListaProgramas.add(progr);
        try {
            pst = cn.prepareStatement("SELECT * FROM programa");
            rs = pst.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String Descrip = rs.getString(2);
                int duracion = rs.getInt(3);
                Programas prog = new Programas(id, Descrip, duracion);
                ListaProgramas.add(prog);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return ListaProgramas;
    }

    DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

    public DefaultTableModel mostrarModulo(){
        try{
            pst = cn.prepareStatement("SELECT * FROM modulo");
            rs = pst.executeQuery();
            while(rs.next()){
                registros [0] = rs.getString(1);
                registros [1] = rs.getString(2);
                registros [2] = rs.getString(3);
                registros [3] = rs.getString(4);
                modelo.addRow(registros);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return modelo;
    }



    public void InsertModulo(int idm,String Descrip, int ncredi, int idP){
        try(Statement stm = cn.createStatement()){
            rs = stm.executeQuery("SELECT * FROM modulo WHERE idmodulo = "+idm+";");
            rs.next();
            rs.getInt("idmodulo");
            JOptionPane.showMessageDialog(null, "EL ID YA ESTA REGISTRADO!!!"
                    + "", "ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            try{
                pst = cn.prepareStatement("INSERT INTO modulo"
                        + "(idmodulo, descripcion, nrodecreditos, idprograma)"
                        + " VALUES (?,?,?,?)");
                pst.setInt(1, idm);
                pst.setString(2, Descrip);
                pst.setInt(3, ncredi);
                pst.setInt(4, idP);
                int registro = pst.executeUpdate();
                if (registro>0) {

                    JOptionPane.showMessageDialog(null, "REGISTRO COMPLETADO CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "Error al insertar datos :"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
