
public class Vehiculo {
    private String matricula;
    private String color;
    private String marca;
    private int fabricacion;
    private double precio;
    private String dueño;
    private int cantidadRuedas;
    
    public Vehiculo(){}

    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
    }

    public Vehiculo(int fabricacion, int cantidadRuedas) {
        this.fabricacion = fabricacion;
        this.cantidadRuedas = cantidadRuedas;
    }

    //getters
    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public String getDueño() {
        return dueño;
    }

    //setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    
}
