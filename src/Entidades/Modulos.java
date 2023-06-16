package Entidades;

public class Modulos {
    private int idmodulo;
    private String descripcion;
    private int nrodecreditos;
    private int idprograma;

    public Modulos() {
    }

    public Modulos(int idmodulo, String descripcion, int nrodecreditos, int idprograma) {
        this.idmodulo = idmodulo;
        this.descripcion = descripcion;
        this.nrodecreditos = nrodecreditos;
        this.idprograma = idprograma;
    }

    public int getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(int idmodulo) {
        this.idmodulo = idmodulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnrodecreditos() {
        return nrodecreditos;
    }

    public void setNrodecreditos(int nrodecreditos) {
        this.nrodecreditos = nrodecreditos;
    }

    public int getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(int idprograma) {
        this.idprograma = idprograma;
    }



    public String toString(){
        return  idmodulo+" - "+descripcion;
    }
}
