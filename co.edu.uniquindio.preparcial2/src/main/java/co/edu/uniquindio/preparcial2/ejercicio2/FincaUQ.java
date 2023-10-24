package co.edu.uniquindio.preparcial2.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class FincaUQ {
    private String nombre;
    public static List<Tarea> listaTareas = new ArrayList<>();
    public static  List<Empleado> listaEmpleados = new ArrayList<>();

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

    public static List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public static void setListaTareas(List<Tarea> listaTareas) {
        FincaUQ.listaTareas = listaTareas;
    }

    public static List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public static void setListaEmpleados(List<Empleado> listaEmpleados) {
        FincaUQ.listaEmpleados = listaEmpleados;
    }



    @Override
    public String toString() {
        return "FincaUQ{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
