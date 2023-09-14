package co.edu.uniquindio.parcial1.ejercicio1;

public class Curso {
    private String nombre;
    private int semestre;
    private String grupo;
    private int creditos;
    private String jornada;
    private String programa;
    private String facultad;

    public Curso (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void estaturaMayor (Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){
        if(estudiante1.getEstatura() > estudiante2.getEstatura() && estudiante1.getEstatura() > estudiante3.getEstatura()){
            System.out.println("El estudiante con mayor altura es: "+estudiante1.getNombre()+", y su informacion: "
            +"\nnombre: "+estudiante1.getNombre()+"\napellido: "+estudiante1.getApellido()+"\nfecha de nacimiento: "
            +estudiante1.getFechaNacimiento()
            +"\nedad: "+estudiante1.getEdad()+"\ncorreo: "+estudiante1.getCorreo()+"\nsemestre: "+estudiante1.getSemestre()
            +"\nestatura: "+estudiante1.getEstatura()+"\nnota1: "+estudiante1.getNota1()+"\nnota2: "
            +estudiante1.getNota2()+"\nnota3: "+estudiante1.getNota3()+"\nnota4: "+estudiante1.getNota4()
            +"\nnota5: "+estudiante1.getNota5());
        }
        else if (estudiante2.getEstatura() > estudiante1.getEstatura() && estudiante2.getEstatura() > estudiante3.getEstatura()){
            System.out.println("El estudiante con mayor altura es: "+estudiante2.getNombre()+", y su informacion: "
                    +"\nnombre: "+estudiante2.getNombre()+"\napellido: "+estudiante2.getApellido()+"\nfecha de nacimiento: "
                    +estudiante2.getFechaNacimiento()
                    +"\nedad: "+estudiante2.getEdad()+"\ncorreo: "+estudiante2.getCorreo()+"\nsemestre: "+estudiante2.getSemestre()
                    +"\nestatura: "+estudiante2.getEstatura()+"\nnota1: "+estudiante2.getNota1()+"\nnota2: "
                    +estudiante1.getNota2()+"\nnota3: "+estudiante2.getNota3()+"\nnota4: "+estudiante2.getNota4()
                    +"\nnota5: "+estudiante2.getNota5());
        }
        else if (estudiante3.getEstatura() > estudiante1.getEstatura() && estudiante3.getEstatura() > estudiante2.getEstatura()){
            System.out.println("El estudiante con mayor altura es: "+estudiante3.getNombre()+", y su informacion: "
                    +"\nnombre: "+estudiante3.getNombre()+"\napellido: "+estudiante3.getApellido()+"\nfecha de nacimiento: "
                    +estudiante3.getFechaNacimiento()
                    +"\nedad: "+estudiante3.getEdad()+"\ncorreo: "+estudiante3.getCorreo()+"\nsemestre: "+estudiante3.getSemestre()
                    +"\nestatura: "+estudiante3.getEstatura()+"\nnota1: "+estudiante3.getNota1()+"\nnota2: "
                    +estudiante3.getNota2()+"\nnota3: "+estudiante3.getNota3()+"\nnota4: "+estudiante3.getNota4()
                    +"\nnota5: "+estudiante3.getNota5());
        }
    }
    public String estudiantesNota5Mayor4 (Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){
        Estudiante estudiantesNotaMayor4;
        if (estudiante1.getNota5() >= 4 ){
            estudiantesNotaMayor4 += estudiante1;
        }
        if (estudiante2.getNota5() >= 4){
            estudiantesNotaMayor4 += estudiante2;
        }
        if (estudiante3.getNota5() >= 4){
            estudiantesNotaMayor4 += estudiante3;
        }
        return estudiantesNotaMayor4;
    }
}
