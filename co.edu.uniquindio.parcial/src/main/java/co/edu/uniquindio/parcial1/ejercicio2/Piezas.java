package co.edu.uniquindio.parcial1.ejercicio2;

public class Piezas {
    private String nombre;
    private String numeroParte;
    private String descripcion;
    private int cantidadDisponible;
    private String proveedor;
    public Piezas (){

    }

    public Piezas(String nombre, String numeroParte, String descripcion, int cantidadDisponible, String proveedor) {
        this.nombre = nombre;
        this.numeroParte = numeroParte;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroParte() {
        return numeroParte;
    }

    public void setNumeroParte(String numeroParte) {
        this.numeroParte = numeroParte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
