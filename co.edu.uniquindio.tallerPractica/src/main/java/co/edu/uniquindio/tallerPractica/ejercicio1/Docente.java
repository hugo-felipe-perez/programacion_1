package co.edu.uniquindio.tallerPractica.ejercicio1;

public class Docente {
    private String nombre;
    private int edad;
    private String correo;

    public Docente (){

    }
    public Docente (String nombre, int edad, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public int getEdad (){
        return edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public String getCorreo (){
        return correo;
    }
    public void setCorreo (String correo){
        this.correo = correo;
    }

    public void promedioCurso (double definitivaEstudiante1,double definitivaEstudiante2,
                               double definitivaEstudiante3){
        double definitivaCurso = (definitivaEstudiante1 + definitivaEstudiante2 + definitivaEstudiante3) /3;
        System.out.println("La definitiva del curso es: " + definitivaCurso);
    }
}
