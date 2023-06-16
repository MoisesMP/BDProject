package BD;

import Entidades.Estudiantes;
import Entidades.Modulos;
import Entidades.Profesores;
import Entidades.Programas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class matricula {
    BDConnect cc= new BDConnect();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps= null;
    String []  nombresColumnas = {"ID Estudiante","ID Modulo","ID Profesor","Fecha"};
    String [] registros = new String[4];

    public matricula(){
        cn= cc.conexion();
    }

    public ArrayList<Estudiantes> getEstudiantes(){
        ArrayList<Estudiantes> ListaEstudiantes = new ArrayList();
        Estudiantes estu = new Estudiantes(0, "Seleccione un Estudiante", "", "", "", "", 0);
        ListaEstudiantes.add(estu);
        //String SQL = "SELECT programa.idprograma, programa.descripcion, programa.duración FROM estudiante INNER JOIN programa ON estudiante.idprograma = programa.idprograma;";
        try {
            ps = cn.prepareStatement("SELECT * FROM estudiante");
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String Nombre = rs.getString(2);
                String direccion = rs.getString(3);
                String telefono = rs.getString(4);
                String sexo = rs.getString(5);
                String correo = rs.getString(6);
                int idPro = rs.getInt(7);
                Estudiantes est = new Estudiantes(id, Nombre, direccion, telefono, sexo, correo, idPro);
                ListaEstudiantes.add(est);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return ListaEstudiantes;
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

    public DefaultTableModel mostrarMatricula(){
        try{
            ps = cn.prepareStatement("SELECT * FROM matricula");
            rs = ps.executeQuery();
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

    public void InsertMatricula(int ide,int idm, int idp, Date fecha){

        try {
            ps = cn.prepareStatement("INSERT INTO matricula"
                    + "(idestudiante, idmodulo, idprofesor, fecha) "
                    + "VALUES (?,?,?,?)");
            ps.setInt(1, ide);
            ps.setInt(2, idm);
            ps.setInt(3, idp);
            ps.setDate(4, fecha);
            int registro = ps.executeUpdate();
            if (registro>0) {

                JOptionPane.showMessageDialog(null, "REGISTRO COMPLETADO CON EXITO", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos :"+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }


    }
}