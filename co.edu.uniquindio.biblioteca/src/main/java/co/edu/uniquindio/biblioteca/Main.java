package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Libro;

public class Main {
    public static void main(String[] args) {
        crearLibros();

    }

    public static void crearLibros(){
        Libro libro1 = new Libro();
        libro1.setNombre("El viejo y el mar");
        libro1.setEditorial("Charles Scribner's Sons");
        libro1.setGenero("Novela, Historia de mar");
        libro1.setAutor("Ernest Hemingway");
        libro1.setAnioPublicacion(1951);
        libro1.setNumeroPaginas(127);

        Libro libro2 = new Libro();
        libro2.setNombre("Calculo integral");
        libro2.setEditorial("Editorial Sudamericana");
        libro2.setGenero("Novela, Narracion");
        libro2.setAutor("Gabriel García Márquez");
        libro2.setAnioPublicacion(1982);
        libro2.setNumeroPaginas(471);

        Libro libro3 = new Libro();
        libro3.setNombre("Don quijote de la mancha");
        libro3.setEditorial("Editorial Porrúa S.A. de C.V.");
        libro3.setGenero("Aventura");
        libro3.setAutor("Miguel De Cervantes");
        libro3.setAnioPublicacion(1605);
        libro3.setNumeroPaginas(1560);

        Libro libro4 = new Libro();
        libro4.setNombre("La odisea");
        libro4.setEditorial("Club Internacional del Libro");
        libro4.setGenero("Poema epico");
        libro4.setAutor("Homero");
        libro4.setAnioPublicacion(700);
        libro4.setNumeroPaginas(448);

        Libro libro5 = new Libro();
        libro5.setNombre("La maria");
        libro5.setEditorial("Samuel");
        libro5.setGenero("Novela");
        libro5.setAutor("Jorge Isaac");
        libro5.setAnioPublicacion(1867);
        libro5.setNumeroPaginas(231);

        calcularVocalesYConsonantes(libro1,libro2,libro3,libro4,libro5);
        cambiarNombre(libro2);
    }

    public static void calcularVocalesYConsonantes (Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        int vocales = 0;
        int consonantes = 0;

        if (libro1.getNombre().charAt(0) == 'A' || libro1.getNombre().charAt(0) == 'a'
                || libro1.getNombre().charAt(0) == 'E' || libro1.getNombre().charAt(0) == 'e'
                || libro1.getNombre().charAt(0) == 'I' || libro1.getNombre().charAt(0) == 'i'
                || libro1.getNombre().charAt(0) == 'O' || libro1.getNombre().charAt(0) == 'o'
                || libro1.getNombre().charAt(0) == 'U' || libro1.getNombre().charAt(0) == 'u'){
            vocales += 1;
        }
        else {
            consonantes += 1;
        }
        if (libro2.getNombre().charAt(0) == 'A' || libro2.getNombre().charAt(0) == 'a'
                || libro2.getNombre().charAt(0) == 'E' || libro2.getNombre().charAt(0) == 'e'
                || libro2.getNombre().charAt(0) == 'I' || libro2.getNombre().charAt(0) == 'i'
                || libro2.getNombre().charAt(0) == 'O' || libro2.getNombre().charAt(0) == 'o'
                || libro2.getNombre().charAt(0) == 'U' || libro2.getNombre().charAt(0) == 'u'){
            vocales += 1;
        }
        else {
            consonantes += 1;
        }
        if (libro3.getNombre().charAt(0) == 'A' || libro3.getNombre().charAt(0) == 'a'
                || libro3.getNombre().charAt(0) == 'E' || libro3.getNombre().charAt(0) == 'e'
                || libro3.getNombre().charAt(0) == 'I' || libro3.getNombre().charAt(0) == 'i'
                || libro3.getNombre().charAt(0) == 'O' || libro3.getNombre().charAt(0) == 'o'
                || libro3.getNombre().charAt(0) == 'U' || libro3.getNombre().charAt(0) == 'u'){
            vocales += 1;
        }
        else {
            consonantes += 1;
        }
        if (libro4.getNombre().charAt(0) == 'A' || libro4.getNombre().charAt(0) == 'a'
                || libro4.getNombre().charAt(0) == 'E' || libro4.getNombre().charAt(0) == 'e'
                || libro4.getNombre().charAt(0) == 'I' || libro4.getNombre().charAt(0) == 'i'
                || libro4.getNombre().charAt(0) == 'O' || libro4.getNombre().charAt(0) == 'o'
                || libro4.getNombre().charAt(0) == 'U' || libro4.getNombre().charAt(0) == 'u'){
            vocales += 1;
        }
        else {
            consonantes += 1;
        }
        if (libro5.getNombre().charAt(0) == 'A' || libro5.getNombre().charAt(0) == 'a'
                || libro5.getNombre().charAt(0) == 'E' || libro5.getNombre().charAt(0) == 'e'
                || libro5.getNombre().charAt(0) == 'I' || libro5.getNombre().charAt(0) == 'i'
                || libro5.getNombre().charAt(0) == 'O' || libro5.getNombre().charAt(0) == 'o'
                || libro5.getNombre().charAt(0) == 'U' || libro5.getNombre().charAt(0) == 'u'){
            vocales += 1;
        }
        else {
            consonantes += 1;
        }
        String mensaje = "La cantidad de libros que inician con vocal son: " +vocales + "\nY la cantidad de libros que inician en consonante son: " +consonantes;
        System.out.println(mensaje);
    }
    public static void cambiarNombre (Libro libro2){
        if (libro2.getNombre().equals("Calculo integral")){
            libro2.setNombre("Calculo integral y diferencial");
        }
        System.out.println(libro2.getNombre());
    }
}