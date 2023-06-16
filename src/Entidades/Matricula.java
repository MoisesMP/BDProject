package Entidades;

public class Matricula {
    private int idEstudiante;
    private int idModulo;
    private int idProfesor;
    private String fecha;

    public Matricula(int idEstudiante, int idModulo, int idProfesor, String fecha) {
        this.idEstudiante = idEstudiante;
        this.idModulo = idModulo;
        this.idProfesor = idProfesor;
        this.fecha = fecha;
    }

    public Matricula() {
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String toString(){
        return  ""+fecha;
    }
}
