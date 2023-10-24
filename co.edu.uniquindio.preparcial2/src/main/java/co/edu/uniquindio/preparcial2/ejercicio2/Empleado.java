package co.edu.uniquindio.preparcial2.ejercicio2;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private double salario;
    private int numeroHorasTrabajo;
    FincaUQ ownedByFincaUQ;
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.salario = salario;
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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



    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", numeroHorasTrabajo=" + numeroHorasTrabajo +
                '}';
    }
}
