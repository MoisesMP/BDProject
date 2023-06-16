package BD;

import Entidades.Modulos;
import Entidades.Profesores;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class impartemodulo {
    BDConnect cc= new BDConnect();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps= null;
    String []  nombresColumnas = {"ID Modulo","ID Profesor","Fecha"};
    String [] registros = new String[3];

    public impartemodulo(){
        cn= cc.conexion();
    }

    public ArrayList<Modulos> getModulos(){
        ArrayList<Modulos> ListaModulos= new ArrayList();
        Modulos modul = new Modulos(0, "Seleccione Modulo", 0, 0);
        ListaModulos.add(modul);

        try {
            ps = cn.prepareStatement("SELECT * FROM modulo");
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String Descrip = rs.getString(2);
                int nrocreditos = rs.getInt(3);
                int idprograma = rs.getInt(4);
                Modulos modu = new Modulos(id, Descrip, nrocreditos, idprograma);
                ListaModulos.add(modu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return ListaModulos;
    }

    public ArrayList<Profesores> getProfesores(){
        ArrayList<Profesores> ListaProfesores= new ArrayList();
        Profesores profe = new Profesores(0, "Seleccione un Profesor", "", "", "");
        ListaProfesores.add(profe);
        try {
            ps = cn.prepareStatement("SELECT * FROM profesor");
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String telefono = rs.getString(3);
                String correo = rs.getString(4);
                String sexo = rs.getString(5);
                Profesores prof = new Profesores(id, nombre, telefono, correo, sexo);
                ListaProfesores.add(prof);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return ListaProfesores;
    }

    DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

    public DefaultTableModel mostrarImparteModulo(){
        try{
            ps = cn.prepareStatement("SELECT * FROM impartemodulo");
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

    public void InsertImparteModulo(int idm, int idp, Date fecha){

        try {
            ps = cn.prepareStatement("INSERT INTO impartemodulo"
                    + "(idmodulo, idprofesor, fecha) "
                    + "VALUES (?,?,?)");
            ps.setInt(1, idm);
            ps.setInt(2, idp);
            ps.setDate(3, fecha);
            int registro = ps.executeUpdate();
            if (registro>0) {

                JOptionPane.showMessageDialog(null, "REGISTRO COMPLETADO CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos :"+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }


    }

}