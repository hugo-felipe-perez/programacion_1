package co.edu.uniquindio.tallerPractica.ejercicio2;



public class MainEjercicio2 {
    public static void main(String[] args) {
        Visitante visitante1 = crearVisitantes("Hugo Felipe ","Perez Giraldo ",21,
                "1004917336","adulto","masculino",73.0);
        Visitante visitante2 = crearVisitantes("Alberto Style ","Nazario ",17,
                "674723928","Adolecente","masculino",65.5);
        Visitante visitante3 = crearVisitantes("Diana ","giraldo ",8,"6283782",
                "Niño","Femenino",57.7);
        Atraccion atraccion1 = crearAtracciones("montaña rusa","9:00am - 4:00pm","adrenalina",
                13,"nivel de peligro: medio",500);
        Atraccion atraccion2 = crearAtracciones("la cumbre","9:00am - 4:00pm","vertigo",
                18,"nivel de peligro: medio",600);
        Atraccion atraccion3 = crearAtracciones("El barco","8:00am - 5:00pm","vertigo",
                6,"nivel de peligro: bajo",800);
        atraccion1.apruebaAtracciones(visitante1,atraccion1,atraccion2,atraccion3);
        atraccion1.apruebaAtracciones(visitante2,atraccion1,atraccion2,atraccion3);
        atraccion1.apruebaAtracciones(visitante3,atraccion1,atraccion2,atraccion3);
        atraccion1.atraccionesNiños(atraccion1,atraccion2,atraccion3);
    }
    private static Visitante crearVisitantes (String nombres, String apellidos,int edad,String identificacion,
                                              String tipoVisitante,String sexo,double peso){
        Visitante visitante = new Visitante();
        visitante.setNombres(nombres);
        visitante.setApellidos(apellidos);
        visitante.setEdad(edad);
        visitante.setIdentificacion(identificacion);
        visitante.setTipoVisitante(tipoVisitante);
        visitante.setSexo(sexo);
        visitante.setPeso(peso);
        return visitante;
    }
    private static Atraccion crearAtracciones (String nombre,String horario,String descripcion,int edadMinima,
                                               String nivelPeligro,double pesoMaximo){
        Atraccion atraccion = new Atraccion();
        atraccion.setNombre(nombre);
        atraccion.setHorario(horario);
        atraccion.setDescripcion(descripcion);
        atraccion.setEdadMinima(edadMinima);
        atraccion.setNivelPeligro(nivelPeligro);
        atraccion.setPesoMaximo(pesoMaximo);
        return atraccion;
    }
}
