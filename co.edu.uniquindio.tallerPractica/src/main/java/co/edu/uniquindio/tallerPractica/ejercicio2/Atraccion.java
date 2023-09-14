package co.edu.uniquindio.tallerPractica.ejercicio2;

import co.edu.uniquindio.tallerPractica.ejercicio1.Estudiante;

public class Atraccion {
    private String nombre;
    private String horario;
    private String descripcion;
    private int edadMinima;
    private String nivelPeligro;
    private double pesoMaximo;
    public Atraccion (){

    }
    public Atraccion(String nombre, String horario, String descripcion, int edadMinima, String nivelPeligro, double pesoMaximo) {
        this.nombre = nombre;
        this.horario = horario;
        this.descripcion = descripcion;
        this.edadMinima = edadMinima;
        this.nivelPeligro = nivelPeligro;
        this.pesoMaximo = pesoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public void apruebaAtracciones (Visitante visitante,Atraccion atraccion1,Atraccion atraccion2,Atraccion atraccion3){
        if (visitante.getEdad() >= atraccion1.getEdadMinima()){
            System.out.println("El visitante " + visitante.getNombres() + visitante.getApellidos() + "puede subir a "
                    + atraccion1.getNombre());
        }
        if (visitante.getEdad() >= atraccion2.getEdadMinima()){
            System.out.println("El visitante " + visitante.getNombres() + visitante.getApellidos() + "puede subir a "
                    + atraccion2.getNombre());
        }
        if (visitante.getEdad() >= atraccion3.getEdadMinima()){
            System.out.println("El visitante " + visitante.getNombres() + visitante.getApellidos() + "puede subir a "
                    + atraccion3.getNombre());
        }
    }
    public void atraccionesNiños (Atraccion atraccion1,Atraccion atraccion2,Atraccion atraccion3){
        int atraccionesNiños = 0;
        String informacion = "";
        if (atraccion1.getEdadMinima() >= 3 && atraccion1.getEdadMinima() <= 10){
            atraccionesNiños += 1;
            informacion += "\nnombre: "+ atraccion1.getNombre() +"\nhorario: "+atraccion1.getHorario()
                    +"\ndescripcion: "+atraccion1.getDescripcion()+"\nedad minima: "+atraccion1.getEdadMinima()
                    +"\n"+atraccion1.getNivelPeligro()+"\npeso maximo: "+atraccion1.getPesoMaximo()+"Kg";
        }
        if (atraccion2.getEdadMinima() >= 3 && atraccion2.getEdadMinima() <= 8){
            atraccionesNiños += 1;
            informacion += "\nnombre: "+ atraccion2.getNombre() +"\nhorario: "+atraccion2.getHorario()
                    +"\ndescripcion: "+atraccion2.getDescripcion()+"\nedad minima: "+atraccion2.getEdadMinima()
                    +"\n"+atraccion2.getNivelPeligro()+"\npeso maximo: "+atraccion2.getPesoMaximo()+"Kg";
        }
        if (atraccion3.getEdadMinima() >= 3 && atraccion3.getEdadMinima() <= 8){
            atraccionesNiños += 1;
            informacion += "nombre: "+ atraccion3.getNombre() +"\nhorario: "+atraccion3.getHorario()
                    +"\ndescripcion: "+atraccion3.getDescripcion()+"\nedad minima: "+atraccion3.getEdadMinima()
                    +"\n"+atraccion3.getNivelPeligro()+"\npeso maximo: "+atraccion3.getPesoMaximo()+"Kg";
        }
        System.out.println("La cantidad de atrracciones para niños es de: "+atraccionesNiños +
                "\ny su respectiva informacion:\n"+informacion);
    }

}
