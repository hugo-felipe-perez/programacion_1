package co.edu.uniquindio.estudiante.model;

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

    //funcion para calcular el promedio del curso
    public void calcularPromedioCurso(double definitivaEstudiante1, double definitivaEstudiante2,
                                      double definitivaEstudiante3) {
        double promedioCurso = (definitivaEstudiante1 + definitivaEstudiante2 + definitivaEstudiante3) / 3;
        System.out.println("El promedio del curso es: " + promedioCurso);
    }

    //funcion para el promedio de edad
    public void calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
        double promedioEdad = (estudiante1.getEdad() + estudiante2.getEdad() + estudiante3.getEdad()) / 3.0;
        System.out.println("El promedio de edad del curso es: " + promedioEdad);
    }

    //funcion para calcular el promedio de la nota 1 de los estudiantes
    public void promedioNota1(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
        double promedioNota1 = (estudiante1.getNota1() + estudiante2.getNota1() + estudiante3.getNota1()) / 3;
        System.out.println("el promedio de la nota 1 es: " + promedioNota1);
    }

    // funcion para calcular la nota mayor del curso
    public void notaMayor(double definitivaEstudiante1, double definitivaEstudiante2, double definitivaEstudiante3) {
        String mensaje = "";
        if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante2 > definitivaEstudiante3) {
            mensaje = "La nota mayor es la del estudiante 1.";
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 > definitivaEstudiante3){
            mensaje = "La nota mayor es la del estudiante 2.";
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 < definitivaEstudiante3){
            mensaje = "La nota mayor es la del estudiante 3.";
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 == definitivaEstudiante3){
            mensaje = "La nota mayor es la del estudiante 2 y estudiante 3 con un valor igual de: "+definitivaEstudiante2;
        }
        else if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante2 == definitivaEstudiante3){
            mensaje = "La nota mayor es la del estudiante 1.";
        }
        else if (definitivaEstudiante1 == definitivaEstudiante2 && definitivaEstudiante2 == definitivaEstudiante3){
            mensaje = "Las notas del estudiante 1, del estudiante 2 y el estudiante 3 son iguales.";
        }
        else if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante1 == definitivaEstudiante3){
            mensaje = "Las nota mayor es la del estudiante 1 y estudiante 3 con un valor igual de: "+definitivaEstudiante1;
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante1 == definitivaEstudiante3){
            mensaje = "La nota mayor es la del estudiante 2:";
        }
        else if (definitivaEstudiante1 == definitivaEstudiante2 && definitivaEstudiante2 > definitivaEstudiante3) {
            mensaje = "La nota mayor es la del estudiante 1 y estudiante 3 con un valor igual de: " + definitivaEstudiante1;
        }
        else if (definitivaEstudiante1 == definitivaEstudiante2 && definitivaEstudiante2 < definitivaEstudiante3){
            mensaje = "La nota mayor es la del es del estudiante 3";
        }
        else if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante2 < definitivaEstudiante3
                && definitivaEstudiante1 > definitivaEstudiante3){
            mensaje = "La nota mayor es la del estudiante 1";
        }
        else if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante2 < definitivaEstudiante3
                && definitivaEstudiante1 < definitivaEstudiante3){
            mensaje = "La nota mayor es la del estudiante 3";
        }
        System.out.println(mensaje);
    }
    //funcion para calcular la nota menor del curso
    public void notaMenor (double definitivaEstudiante1, double definitivaEstudiante2, double definitivaEstudiante3) {
        String mensaje = "";
        if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 < definitivaEstudiante3) {
            mensaje = "La nota menor es la del estudiante 1.";
        }
        else if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante2 < definitivaEstudiante3){
            mensaje = "La nota menor es la del estudiante 2.";
        }
        else if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante2 > definitivaEstudiante3){
            mensaje = "La nota menor es la del estudiante 3.";
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 == definitivaEstudiante3){
            mensaje = "La nota menor es la del estudiante 2 y estudiante 3 con un valor igual de: "+definitivaEstudiante2;
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 == definitivaEstudiante3){
            mensaje = "La nota menor es la del estudiante 1.";
        }
        else if (definitivaEstudiante1 == definitivaEstudiante2 && definitivaEstudiante2 == definitivaEstudiante3){
            mensaje = "Las notas del estudiante 1, del estudiante 2 y el estudiante 3 son iguales.";
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante1 == definitivaEstudiante3){
            mensaje = "Las nota menor es la del estudiante 1 y estudiante 3 con un valor igual de: "+definitivaEstudiante1;
        }
        else if (definitivaEstudiante1 > definitivaEstudiante2 && definitivaEstudiante1 == definitivaEstudiante3){
            mensaje = "La nota menor es la del estudiante 2:";
        }
        else if (definitivaEstudiante1 == definitivaEstudiante2 && definitivaEstudiante2 < definitivaEstudiante3) {
            mensaje = "La nota menor es la del estudiante 1 y estudiante 2 con un valor igual de: " + definitivaEstudiante1;
        }
        else if (definitivaEstudiante1 == definitivaEstudiante2 && definitivaEstudiante2 > definitivaEstudiante3){
            mensaje = "La nota menor es la del es del estudiante 3";
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 > definitivaEstudiante3
                && definitivaEstudiante1 > definitivaEstudiante3){
            mensaje = "La nota menor es la del estudiante 1";
        }
        else if (definitivaEstudiante1 < definitivaEstudiante2 && definitivaEstudiante2 > definitivaEstudiante3
                && definitivaEstudiante1 < definitivaEstudiante3){
            mensaje = "La nota menor es la del estudiante 3";
        }
        System.out.println(mensaje);
    }

    //funcion para verificar si el estudiante aprobo el curso - nota minima para aprobar: 3.0
    public void verificarAprobo (double definitivaEstudiante1, double definitivaEstudiante2,
                                 double definitivaEstudiante3){
        String mensaje = "";
        //verificar estudiante 1
        if (definitivaEstudiante1 >= 3.0){
            mensaje += "El estudiante 1 aprobo con una definitiva de: "+definitivaEstudiante1;
        }
        else {
            mensaje += "\nEl estudiante 1 reprobo con una definitiva de: "+definitivaEstudiante1;
        }
        //verificar estudiante 2
        if (definitivaEstudiante2 >= 3.0){
            mensaje += "\nEl estudiante 2 aprobo con una definitiva de: "+definitivaEstudiante2;
        }
        else {
            mensaje += "\nEl estudiante 2 reprobo con una definitiva de: "+definitivaEstudiante2;
        }
        //verificar estudiante 3
        if (definitivaEstudiante3 >= 3.0){
            mensaje += "\nEl estudiante 3 aprobo con una definitiva de: "+definitivaEstudiante3;
        }
        else {
            mensaje += "\nEl estudiante 3 reprobo con una definitiva de: "+definitivaEstudiante3;
        }
        System.out.println(mensaje);
    }
    //funcion para verificar que porcentaje gano y que porcentaje perdio el curso
    public void porcentajeAprobacionReprobacion (double definitivaEstudiante1, double definitivaEstudiante2,
                                                 double definitivaEstudiante3){
        double aprobaron = 0;
        double reprobaron = 0;
        if (definitivaEstudiante1 >= 3.0 ){
            aprobaron += 1;
        }
        else {
            reprobaron += 1;
        }
        if (definitivaEstudiante2 >= 3.0){
            aprobaron += 1;
        }
        else {
            reprobaron += 1;
        }
        if (definitivaEstudiante3 >= 3.0){
            aprobaron += 1;
        }
        else {
            reprobaron += 1;
        }
        double porcentajeAprobaron = (aprobaron/3)*100;
        double porcentajeReprobaron = (reprobaron/3)*100;
        System.out.println("Porcentaje de estudiantes que aprobo: "+porcentajeAprobaron+"%\n"+
                "Porcentaje de estudiantes que reprobo: "+porcentajeReprobaron+"%");
    }
    //funcion para verificar que estudiante tiene todas sus notas sobre 4
    public void estudianteNotasMayor4 (Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){
        String mensaje = "";
        if (estudiante1.getNota1() >= 4.0 && estudiante1.getNota2() >= 4.0 && estudiante1.getNota3() >= 4.0){
            mensaje = "el estudiante 1 tiene todas las notas sobre 4.";
        }
        else if (estudiante2.getNota2() >= 4.0 && estudiante2.getNota2() >= 4.0 && estudiante2.getNota3() >= 4.0){
            mensaje = "E estudiante 2 tiene todas las notas sobre 4.";
        }
        else if (estudiante3.getNota1() >= 4.0 && estudiante3.getNota2() >= 4.0 && estudiante3.getNota3() >= 4.0){
            mensaje = "El estudiante 3 tiene todas las notas sobre 4";
        }
        System.out.println(mensaje);
    }
    //funcion para saber la nota maxima de cada estudiante
    public void notaMaxima (Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){
        String mensaje1 = "";
        String mensaje2 = "";
        String mensaje3 = "";
        if (estudiante1.getNota1() > estudiante1.getNota2()) {
            if (estudiante1.getNota1() > estudiante1.getNota3()) {
                mensaje1 = "la nota maxima del estudiante 1 es: "+estudiante1.getNota1();
            }
            else {
                mensaje1 = "La nota maxima del estudiante 1 es: "+estudiante1.getNota3();
            }
        }
        else {
            if (estudiante1.getNota2() > estudiante1.getNota3()) {
                mensaje1 = "La nota maxima del estudiante 1 es: "+estudiante1.getNota2();
            }
            else {
                mensaje1 = "La nota maxima del estudiante 1 es: "+estudiante1.getNota3();
            }
        }
        if (estudiante2.getNota1() > estudiante2.getNota2()) {
            if (estudiante2.getNota1() > estudiante2.getNota3()) {
                mensaje2 = "la nota maxima del estudiante 2 es: "+estudiante2.getNota1();
            }
            else {
                mensaje2 = "La nota maxima del estudiante 2 es: "+estudiante2.getNota3();
            }
        }
        else {
            if (estudiante2.getNota2() > estudiante2.getNota3()) {
                mensaje2 = "La nota maxima del estudiante 2 es: "+estudiante2.getNota2();
            }
            else {
                mensaje2 = "La nota maxima del estudiante 2 es: "+estudiante2.getNota3();
            }
        }
        if (estudiante3.getNota1() > estudiante3.getNota2()) {
            if (estudiante3.getNota1() > estudiante3.getNota3()) {
                mensaje3 = "la nota maxima del estudiante 3 es: "+estudiante3.getNota1();
            }
            else {
                mensaje3 = "La nota maxima del estudiante 3 es: "+estudiante3.getNota3();
            }
        }
        else {
            if (estudiante3.getNota2() > estudiante3.getNota3()) {
                mensaje3 = "La nota maxima del estudiante 3 es: "+estudiante3.getNota2();
            }
            else {
                mensaje3 = "La nota maxima del estudiante 3 es: "+estudiante3.getNota3();
            }
        }
        System.out.println(mensaje1+"\n"+mensaje2+"\n"+mensaje3);
    }
}


