package co.edu.uniquindio.tallerPractica.ejercicio1;

public class Estudiante {
    private String nombre;
    private String correo;
    private int semestre;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;

    //constructor

    public Estudiante (){

    }

    public Estudiante (String nombre,String correo,int semestre,int edad, double nota1,double nota2,double nota3){
        this.nombre = nombre;
        this.correo = correo;
        this.semestre = semestre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCorreo (){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public int getSemestre (){
        return semestre;
    }
    public void setSemestre (int semestre){
        this.semestre = semestre;
    }
    public int getEdad (){
        return edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public double getNota1 (){
        return nota1;
    }
    public void setNota1 (double nota1){
        this.nota1 = nota1;
    }
    public double getNota2 (){
        return nota2;
    }
    public void setNota2 (double nota2){
        this.nota2 = nota2;
    }
    public double getNota3 (){
        return nota3;
    }
    public void setNota3 (double nota3){
        this.nota3 = nota3;
    }

    public double calcularDefinitivaEstudiantes (Estudiante estudiante){
        double nota1 = estudiante.getNota1();
        double nota2 = estudiante.getNota2();
        double nota3 = estudiante.getNota3();
        double definitiva = (nota1 + nota2 + nota3)/3;
        return definitiva;
    }
}
