package co.edu.uniquindio.tallerPractica.ejercicio2;

public class Visitante {
    private String nombres;
    private String apellidos;
    private int edad;
    private String identificacion;
    private String tipoVisitante;
    private String sexo;
    private double peso;

    public Visitante (){

    }
    public Visitante(String nombres, String apellidos, int edad, String identificacion, String tipoVisitante,
                     String sexo, double peso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.identificacion = identificacion;
        this.tipoVisitante = tipoVisitante;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoVisitante() {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante) {
        this.tipoVisitante = tipoVisitante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
