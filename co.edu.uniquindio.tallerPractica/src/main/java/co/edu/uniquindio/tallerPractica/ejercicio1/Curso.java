package co.edu.uniquindio.tallerPractica.ejercicio1;

public class Curso {
    private String nombre;
    private int semestre;
    private String grupo;
    private int creditos;
    private String jornada;

    public Curso (){

    }
    public Curso (String nombre, int semestre, String grupo, int creditos, String jornada){
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
    }

    public String getNombre (){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public int getSemestre (){
        return semestre;
    }
    public void setSemestre (int semestre){
        this.semestre = semestre;
    }
    public String getGrupo (){
        return grupo;
    }
    public void setGrupo (String grupo){
        this.grupo = grupo;
    }
    public int getCreditos (){
        return creditos;
    }
    public void setCreditos (int creditos){
        this.creditos = creditos;
    }
    public String getJornada (){
        return jornada;
    }
    public void setJornada (String jornada){
        this.jornada = jornada;
    }

}
