package co.edu.uniquindio.parcial1.ejercicio1;

public class mainEjercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiantes("pepito ","perez ","15/01/2002",
                21,"hugo@gmail.com",2,1.78,4.5,3.8,2.3,3.4,
                5.0);
        Estudiante estudiante2 = crearEstudiantes("santiago","rodas","20/05/2005",
                18,"santiago@gmail.com",2,1.74,3.5,1.5,4.6,3.8,
                3.1);
        Estudiante estudiante3 = crearEstudiantes("nicolas","ceballos","05/12/2006",
                20,"nicolas@gmail.com",2,1.75,2.8,1.5,4.5,3.8,
                1.3);
        Docente docente1 = crearDocentes("jose","salazar",38,"jose@gmail.com");
        Docente docenteAuxiliar = crearDocentes("alberto","rojas",30,"alberto@gmail.com");
        Curso curso = crearCurso("programacion 1",2,"02N",3,"nocturna",
                "ingenieria de sistemas","ingenieria");
        double definitivaEstudiante1 = estudiante1.calcularDefinitiva(estudiante1);
        double definitivaEstudiante2 = estudiante2.calcularDefinitiva(estudiante2);
        double definitivaEstudiante3 = estudiante3.calcularDefinitiva(estudiante3);
        curso.estaturaMayor(estudiante1,estudiante2,estudiante3);
    }
    private static Estudiante crearEstudiantes (String nombre,String apellido,String fechaNacimiento,int edad,String correo,
                                     int semestre,double estatura,double nota1,double nota2,double nota3,double nota4,
                                     double nota5){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setFechaNacimiento(fechaNacimiento);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setEstatura(estatura);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);
        estudiante.setNota4(nota4);
        estudiante.setNota5(nota5);
        return estudiante;
    }
    private static Docente crearDocentes (String nombre,String apellido,int edad,String correo){
        Docente docente = new Docente();
        docente.setNombre(nombre);
        docente.setApellido(apellido);
        docente.setEdad(edad);
        docente.setCorreo(correo);
        return docente;
    }
    private static Curso crearCurso (String nombre,int semestre,String grupo,int creditos,String jornada,
                                     String programa,String facultad){
        Curso curso = new Curso();
        curso.setNombre(nombre);
        curso.setSemestre(semestre);
        curso.setGrupo(grupo);
        curso.setCreditos(creditos);
        curso.setJornada(jornada);
        curso.setPrograma(programa);
        curso.setFacultad(facultad);
        return curso;
    }
}
