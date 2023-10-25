package co.edu.uniquindio.preparcial2;
import java.util.Date;
import co.edu.uniquindio.preparcial2.model.*;

public class Main {
    public static void main(String[] args) {
        FincaUQ fincaUQ = inicializarDatosPrueba();
        //mostrar empleados
        fincaUQ.mostrarEmpleados();
        //crear tarea
        fincaUQ.crearTareas(1,"6367212");

    }

    private static FincaUQ inicializarDatosPrueba() {
        FincaUQ fincaUQ = new FincaUQ();
        fincaUQ.setNombre("Mi finca");
        Administrador administrador1 = new Administrador();
        administrador1.setNombre("Juan");
        administrador1.setApellido("Lopez");
        administrador1.setCedula("6367212");
        administrador1.setEdad(25);
        administrador1.setSalario(1500000);
        administrador1.setTipoContrato(TipoContrato.HORAS);
        Jornalero jornalero1 = new Jornalero();
        jornalero1.setNombre("Hugo");
        jornalero1.setApellido("Perez");
        jornalero1.setCedula("7381237");
        jornalero1.setEdad(21);
        jornalero1.setSalario(2000000);
        jornalero1.setTipoContrato(TipoContrato.TIEMPO_COMPLETO);

        Jornalero jornalero2 = new Jornalero();
        jornalero2.setNombre("Santiago");
        jornalero2.setApellido("Rodas");
        jornalero2.setCedula("464657658");
        jornalero2.setEdad(18);
        jornalero2.setSalario(2000000);
        jornalero2.setTipoContrato(TipoContrato.TIEMPO_COMPLETO);

        Tarea tarea1 = new Tarea();
        tarea1.setNumeroTarea(1);
        tarea1.setFechaInicio(new Date(2023/05/15/13/00));
        tarea1.setFechaFin(new Date(2023/05/21/07/00));
        tarea1.setDescripcion("Recoger tomates");
        tarea1.setPrioridad(Prioridad.MEDIA);

        fincaUQ.getListaEmpleados().add(administrador1);
        fincaUQ.getListaEmpleados().add(jornalero1);
        fincaUQ.getListaEmpleados().add(jornalero2);
        return fincaUQ;
    }
}