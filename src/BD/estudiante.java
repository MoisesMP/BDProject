package BD;

import Entidades.Modulos;
import Entidades.Programas;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class estudiante {
    BDConnect cc= new BDConnect();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps= null;
    String []  nombresColumnas = {"ID","Nombre","Direccion","Telefono","Sexo","Correo","ID Programa"};
    String [] registros = new String[7];
    //Programas prog = new Programas();




    public estudiante(){
        cn= cc.conexion();
    }

    public ArrayList<Programas> getProgramas(){
        ArrayList<Programas> ListaProgramas= new ArrayList();
        Programas progr = new Programas(0, "Seleccione un Programa", 0);
        ListaProgramas.add(progr);
        //String SQL = "SELECT programa.idprograma, programa.descripcion, programa.duración FROM estudiante INNER JOIN programa ON estudiante.idprograma = programa.idprograma;";
        try {
            ps = cn.prepareStatement("SELECT * FROM programa");
            rs = ps.executeQuery();
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

    DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

    public DefaultTableModel mostrarEstudiantes(){
        try{
            ps = cn.prepareStatement("SELECT * FROM estudiante");
            rs = ps.executeQuery();
            while(rs.next()){
                registros [0] = rs.getString(1);
                registros [1] = rs.getString(2);
                registros [2] = rs.getString(3);
                registros [3] = rs.getString(4);
                registros [4] = rs.getString(5);
                registros [5] = rs.getString(6);
                registros [6] = rs.getString(7);
                modelo.addRow(registros);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return modelo;
    }

    public void DeleteEstudiante(int id){
        try{
            ps = cn.prepareStatement("DELETE FROM estudiante WHERE idestudiante = "+id+";");
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

    public void InsertEstudiante(int id, String nombre, String direc, String tel, String sex, String mail, int idP){
        try(Statement stm = cn.createStatement()){
            rs = stm.executeQuery("SELECT * FROM estudiante WHERE idestudiante = "+id+";");
            rs.next();
            rs.getInt("idestudiante");
            JOptionPane.showMessageDialog(null, "EL ID YA ESTA REGISTRADO!!!"
                    + "", "ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            try{
                ps = cn.prepareStatement("INSERT INTO estudiante"
                        + "(idestudiante, nombre, direccion, tel, sexo, correo, idprograma) "
                        + "VALUES (?,?,?,?,?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, nombre);
                ps.setString(3, direc);
                ps.setString(4, tel);
                ps.setString(5, sex);
                ps.setString(6, mail);
                ps.setInt(7, idP);
                int registro = ps.executeUpdate();
                if (registro>0) {

                    JOptionPane.showMessageDialog(null, "REGISTRO COMPLETADO CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "Error al insertar datos :"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
