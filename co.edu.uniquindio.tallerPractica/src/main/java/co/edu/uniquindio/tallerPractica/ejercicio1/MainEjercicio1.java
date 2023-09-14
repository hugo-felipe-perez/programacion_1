package co.edu.uniquindio.tallerPractica.ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiantes("Hugo","hugo@gmail",2,21,3.5,
                4.0,4.7);
        Estudiante estudiante2 = crearEstudiantes("Maria","pepita@mail.com",1,15,
                2,1.5,4.5);
        Estudiante estudiante3 = crearEstudiantes("Pepe","pepe@mai.com",4,15,4,
                4.5,4.8);
        Docente docente1 = crearDocentes ("jose",2,"jose@gmail.com");
        double definitivaEstudiante1 = estudiante1.calcularDefinitivaEstudiantes(estudiante1);
        double definitivaEstudiante2 = estudiante2.calcularDefinitivaEstudiantes(estudiante2);
        double definitivaEstudiante3 = estudiante3.calcularDefinitivaEstudiantes(estudiante3);
        docente1.promedioCurso(definitivaEstudiante1,definitivaEstudiante2,definitivaEstudiante3);
    }

    private static Estudiante crearEstudiantes (String nombre,String correo,int semestre,int edad,double nota1,
                                                double nota2,double nota3){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setEdad(edad);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);
        return estudiante;
    }
    private static Docente crearDocentes (String nombre,int edad,String correo){
        Docente docente = new Docente();
        docente.setNombre(nombre);
        docente.setEdad(edad);
        docente.setCorreo(correo);
        return docente;
    }

}
