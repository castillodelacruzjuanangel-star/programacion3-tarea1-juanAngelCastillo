
public class Barco extends Vehiculo{
    private String tipoBote;
    private double tamanoBarco;
    private double calado;
    private int tripulacion;
    private int cantidadMotores;
    
    

    public String getTipoBote() {
        return tipoBote;
    }

    public void setTipoBote(String tipoBote) {
        this.tipoBote = tipoBote;
    }

    public double getTamanoBarco() {
        return tamanoBarco;
    }

    public void setTamanoBarco(double tamanoBarco) {
        this.tamanoBarco = tamanoBarco;
    }

    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    public int getCantidadMotores() {
        return cantidadMotores;
    }

    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }
    
}
