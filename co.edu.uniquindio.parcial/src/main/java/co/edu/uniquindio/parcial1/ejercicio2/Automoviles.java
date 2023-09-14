package co.edu.uniquindio.parcial1.ejercicio2;

public class Automoviles {
    private String nombreModelo;
    private String tipoCarroceria;
    private String tipoMotor;
    private int capacidadPasajeros;
    private double precioBase;
    private String opcionesAdicionales;
    public Automoviles (){

    }

    public Automoviles(String nombreModelo, String tipoCarroceria, String tipoMotor, int capacidadPasajeros,
                       double precioBase, String opcionesAdicionales) {
        this.nombreModelo = nombreModelo;
        this.tipoCarroceria = tipoCarroceria;
        this.tipoMotor = tipoMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioBase = precioBase;
        this.opcionesAdicionales = opcionesAdicionales;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getOpcionesAdicionales() {
        return opcionesAdicionales;
    }

    public void setOpcionesAdicionales(String opcionesAdicionales) {
        this.opcionesAdicionales = opcionesAdicionales;
    }
}
