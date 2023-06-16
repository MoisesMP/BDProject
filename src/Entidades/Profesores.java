package Entidades;

public class Profesores {
    private int idprofesor;
    private String nombre;
    private String telefono;
    private String correo;
    private String sexo;

    public Profesores() {
    }

    public Profesores(int idprofesor, String nombre, String telefono, String correo, String sexo) {
        this.idprofesor = idprofesor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.sexo = sexo;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString(){
        return  idprofesor+" - "+nombre;
    }

}

