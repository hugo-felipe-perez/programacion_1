package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.model.Estudiante;
import co.edu.uniquindio.estudiante.model.Docente;

public class Main {
    public static void main(String[] args) {
        //crearEstudiantes();
        Estudiante estudiante1 = new Estudiante("Juan","juan@mail.com",3,17,3,
                3.5,4.5);
        Estudiante estudiante2 = new Estudiante("Maria","pepita@mail.com",1,15,
                2,1.5,4.5);
        Estudiante estudiante3 = new Estudiante("Pepe","pepe@mai.com",4,15,4,
                4.5,4.8);
        Estudiante estudiante4 = new Estudiante("hugo","hugo@2002",2,21,4.0,
                3.5,4.5);
        Docente docente1 = new Docente ("hugo",28,"hgjdjg");
        Docente docente2 = new Docente();
        Estudiante estudiante5 = new Estudiante();
        estudiante1.calcularDefinitivaEstudiante1(estudiante1);
        double definitivaEstudiante1 = estudiante1.calcularDefinitivaEstudiantes(estudiante1);
        double definitivaEstudiante2 = estudiante2.calcularDefinitivaEstudiantes(estudiante2);
        double definitivaEstudiante3 = estudiante3.calcularDefinitivaEstudiantes(estudiante3);
        docente1.calcularPromedioCurso(definitivaEstudiante1,definitivaEstudiante2,definitivaEstudiante3);
        docente1.calcularPromedioEdad(estudiante1,estudiante2,estudiante3);
        docente1.promedioNota1(estudiante1,estudiante2,estudiante3);
        docente1.notaMayor(definitivaEstudiante1,definitivaEstudiante2,definitivaEstudiante3);
        docente1.notaMenor(definitivaEstudiante1,definitivaEstudiante2,definitivaEstudiante3);
        docente1.verificarAprobo(definitivaEstudiante1,definitivaEstudiante2,definitivaEstudiante3);
        docente1.porcentajeAprobacionReprobacion(definitivaEstudiante1,definitivaEstudiante2,definitivaEstudiante3);
        docente1.estudianteNotasMayor4(estudiante1,estudiante2,estudiante3);
        docente1.notaMaxima(estudiante1,estudiante2,estudiante3);
    }

    /*public static void crearEstudiantes() {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setSemestre(3);
        estudiante1.setEdad(17);
        estudiante1.setCorreo("juan@mail.com");
        estudiante1.setNota1(3);
        estudiante1.setNota2(3.5);
        estudiante1.setNota3(4.5);


        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("María");
        estudiante2.setSemestre(1);
        estudiante2.setEdad(15);
        estudiante2.setCorreo("pepita@mail.com");
        estudiante2.setNota1(2);
        estudiante2.setNota2(1.5);
        estudiante2.setNota3(4.5);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Pepe");
        estudiante3.setSemestre(4);
        estudiante3.setEdad(20);
        estudiante3.setCorreo("pepe@mail.com");
        estudiante3.setNota1(4);
        estudiante3.setNota2(4.5);
        estudiante3.setNota3(4.8);

        calcularDefinitivaEstudiante1(estudiante1);
        calcularPromedioCurso(estudiante1, estudiante2, estudiante3);
        calcularPromedioEdad(estudiante1, estudiante2, estudiante3);
        promedioNota1(estudiante1, estudiante2, estudiante3);
        notaMayor(estudiante1,estudiante2,estudiante3);
        notaMenor(estudiante1,estudiante2,estudiante3);
        verificarAprobo(estudiante1,estudiante2,estudiante3);
        porcentajeAprobacionReprobacion(estudiante1,estudiante2,estudiante3);
        estudianteNotasMayor4(estudiante1,estudiante2,estudiante3);
        notaMaxima(estudiante1,estudiante2,estudiante3);
    }*/
}