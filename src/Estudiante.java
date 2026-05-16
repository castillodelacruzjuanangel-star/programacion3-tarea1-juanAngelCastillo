public class Estudiante {
    private String nombre;
    private String carrera;
    private int matricula;

    public Estudiante(){}

    /*public Estudiante(String nombre, String carrera, int matricula){
        this.nombre = nombre;
        this.carrera = carrera;
        this.matricula = matricula;
    }*/

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCarrera(){
        return carrera;
    }

    public int getMatricula(){
        return matricula;
    }

    public void Imprimir(){
        System.out.println("Nombre: " + getNombre() + " Matricula: " + getMatricula() + " Carrera: " + getCarrera());
    }
}
