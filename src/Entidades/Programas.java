package Entidades;

import javax.swing.JOptionPane;
public class Programas {
    private int idprograma;
    private String descripcion;
    private int duración;

    public Programas(int idprograma, String descripcion, int duración) {
        this.idprograma = idprograma;
        this.descripcion = descripcion;
        this.duración = duración;
    }

    public Programas() {

    }



    public int getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(int idprograma) {
        this.idprograma = idprograma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    void getMostrarProg(){
        String info="La información del programa es: \n";
        info += "IdPrograma: "+idprograma+"\n";
        info += "Nombre: "+descripcion+"\n";
        info += "Duracion: "+duración+"\n";
        JOptionPane.showMessageDialog(null, info);
    }

    public String toString(){
        return  idprograma+" - "+descripcion;
    }

}
