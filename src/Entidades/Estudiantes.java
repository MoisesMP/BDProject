package Entidades;

public class Estudiantes {
    private int idestudiante;
    private String nombre;
    private String direccion;
    private String tel;
    private String sex;
    private String correo;
    private int IdPrograma;

    public Estudiantes(int idestudiante, String nombre, String direccion, String tel, String sex, String correo, int IdPrograma) {
        this.idestudiante = idestudiante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tel = tel;
        this.sex = sex;
        this.correo = correo;
        this.IdPrograma = IdPrograma;
    }

    public Estudiantes(){

    }

    public Estudiantes(int idestudiante, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdPrograma() {
        return IdPrograma;
    }

    public void setIdPrograma(int IdPrograma) {
        this.IdPrograma = IdPrograma;
    }

    public String toString(){
        return  idestudiante+" - "+nombre;
    }

}