package co.edu.uniquindio.preparcial2.model;

import java.util.ArrayList;
import java.util.List;

public class FincaUQ {
    private String nombre;
    public List<Tarea> listaTareas = new ArrayList<>();
    public List<Empleado> listaEmpleados = new ArrayList<>();

    public FincaUQ() {
    }

    public FincaUQ(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Metodo para validar si el empleado existe o no.
     * @param cedula
     * @return
     */
    public Integer buscarEmpleado (String cedula){
        int tamanioLista = getListaEmpleados().size();
        Integer empleadoExiste = null;
        for (int i = 0; i < tamanioLista; i+=1){
            Empleado empleado = getListaEmpleados().get(i);
            if(empleado.getCedula().equalsIgnoreCase(cedula)){
                empleadoExiste = i;
                System.out.println("El cliente con la cedula "+cedula+ " ya existe, no es posible crear de nuevo.");
                break;
            }
        }
        return empleadoExiste;
    }

    /**
     * metodo para crear un empleado
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param salario
     * @param numeroHorasTrabajo
     * @return
     */
    public boolean crearEmpleado (
            String nombre,
            String apellido,
            String cedula,
            int edad,
            double salario,
            int numeroHorasTrabajo){
        if(buscarEmpleado(cedula) == null ){
            Empleado cliente = new Empleado(nombre,apellido,cedula,edad,salario,numeroHorasTrabajo);
            getListaEmpleados().add(cliente);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * metodo para eliminar un empleado
     * @param cedula
     * @return
     */
    public boolean eliminarEmpleado (String cedula){
        boolean empleadoEliminado = false;
        Integer empleado = buscarEmpleado(cedula);
        if(empleado != null){
            getListaEmpleados().remove(empleado);
            empleadoEliminado = true;
        }
        return empleadoEliminado;
    }

    /**
     * metodo para actualizar datos de un empleado
     * @param cedula
     * @return
     */
    public boolean actualizarEmpleado (String cedula){
        boolean empleadoActualizado = false;
        Empleado empleado = getListaEmpleados().get(buscarEmpleado(cedula));
        String nombre;
        String apellido;
        int edad;
        double salario;
        int numeroHorasTrabajo;
        if(empleado != null){

        }
        return empleadoActualizado;
    }

    /**
     * metodo para mostrar la informacion de los empleados
     */
    public void mostrarEmpleados() {
        for (Empleado miEmpleado : getListaEmpleados()   ) {
            System.out.println(miEmpleado.toString());
        }
    }

    /**
     * Metodo para mostrar informacion de un empleado segun su tipo
     * @param valorTipo
     */
    public void mostrarEmpleadosPorTipo(int valorTipo) {
        for (Empleado miEmpleado : getListaEmpleados() ) {

            if (valorTipo == 1 && miEmpleado instanceof Administrador ){
                System.out.println(miEmpleado.toString());
            }
            if (valorTipo == 2 && miEmpleado instanceof Jornalero ){
                System.out.println(miEmpleado.toString());
            }
            if (valorTipo == 3 && miEmpleado instanceof Recolector){
                System.out.println(miEmpleado.toString());
            }

        }
    }

    /**
     * metodo para crear tareas
     * @param numeroTarea
     * @param cedula
     */
    public void crearTareas (int numeroTarea,String cedula){
        Tarea tarea = new Tarea();
        tarea.setNumeroTarea(numeroTarea);
        Empleado empleado = obtenerEmpleado(cedula);
        if(empleado != null){
            tarea.setEmpleadoAsociado(empleado);
        }
        getListaTareas().add(tarea);
    }

    /**
     * metodo para obtener empleados
     * @param cedula
     * @return
     */
    private Empleado obtenerEmpleado(String cedula) {
        Empleado empleadoEncontrado = null;
        for (Empleado miEmpleado:getListaEmpleados()) {
            if (miEmpleado.getCedula().equals(cedula)){
                empleadoEncontrado = miEmpleado;
                break;
            }
        }
        return empleadoEncontrado;
    }

    @Override
    public String toString() {
        return "FincaUQ{" +
                "nombre='" + nombre + '\'' +
                '}';
    }



}
