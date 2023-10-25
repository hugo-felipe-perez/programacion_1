package co.edu.uniquindio.preparcial2.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    private double salario;
    private int numeroHorasTrabajo;
    private TipoContrato tipoContrato;
    public List<Tarea> listaTareasAsociadas = new ArrayList<>();
    FincaUQ ownedByFincaUQ;
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo) {
        this.salario = salario;
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroHorasTrabajo() {
        return numeroHorasTrabajo;
    }

    public void setNumeroHorasTrabajo(int numeroHorasTrabajo) {
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public FincaUQ getOwnedByFincaUQ() {
        return ownedByFincaUQ;
    }

    public void setOwnedByFincaUQ(FincaUQ ownedByFincaUQ) {
        this.ownedByFincaUQ = ownedByFincaUQ;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public List<Tarea> getListaTareasAsociadas() {
        return listaTareasAsociadas;
    }

    public void setListaTareasAsociadas(List<Tarea> listaTareasAsociadas) {
        this.listaTareasAsociadas = listaTareasAsociadas;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                ", numeroHorasTrabajo=" + numeroHorasTrabajo +
                ", tipoContrato=" + tipoContrato +
                ", ownedByFincaUQ=" + ownedByFincaUQ +
                '}';
    }
}
