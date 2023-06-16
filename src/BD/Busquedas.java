package BD;


import Entidades.Matricula;
import Entidades.Programas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Busquedas {

    BDConnect cc= new BDConnect();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps= null;



    public Busquedas(){
        cn = cc.conexion();
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



    public DefaultTableModel mostrarEstudiantesPrograma(String descripcion){
        String []  nombresColumnas = {"ID Estudiante","Nombre Estudiante","ID Programa","Descripcion Programa"};
        String [] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        try{
            ps = cn.prepareStatement("SELECT estudiante.idestudiante, estudiante.nombre, programa.idprograma, programa.descripcion "
                    + "FROM estudiante INNER JOIN programa ON estudiante.idprograma = programa.idprograma "
                    + "WHERE programa.descripcion = '"+descripcion+"';");
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

    public ArrayList<Matricula> getFecha(){
        ArrayList<Matricula> ListaMatricula= new ArrayList();
        Matricula ma = new Matricula(0,0 , 0, "Seleccione una Fecha");
        ListaMatricula.add(ma);
        //String SQL = "SELECT programa.idprograma, programa.descripcion, programa.duración FROM estudiante INNER JOIN programa ON estudiante.idprograma = programa.idprograma;";
        try {
            ps = cn.prepareStatement("SELECT * FROM matricula");
            rs = ps.executeQuery();
            while(rs.next()){
                int ide = rs.getInt(1);
                int idm = rs.getInt(2);
                int idp = rs.getInt(3);
                String fecha = rs.getString(4);
                Matricula mat = new Matricula(ide, idm, idp, fecha);
                ListaMatricula.add(mat);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return ListaMatricula;
    }


    public DefaultTableModel mostrarEstudiantesFechaMatricula(String fecha){
        String []  nombresColumnas = {"ID Estudiante","Fecha","Nombre"};
        String [] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        try{
            ps = cn.prepareStatement("SELECT matricula.idestudiante, matricula.fecha, estudiante.nombre "
                    + "FROM matricula INNER JOIN estudiante ON matricula.idestudiante = estudiante.idestudiante "
                    + "WHERE matricula.fecha = '"+fecha+"';");
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
}