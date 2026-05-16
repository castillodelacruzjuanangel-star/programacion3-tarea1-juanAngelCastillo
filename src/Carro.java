

public class Carro extends Vehiculo{
    private int cantidadPuertas;
    private boolean esAutomatico;
    private boolean esElectrico;
    private int capacidadMaletero;

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public boolean getEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    
    public boolean setEsElectrico(){
        return esElectrico;
    }
    
    public void getEsElectrico(boolean esElectrico){
        this.esElectrico =  esElectrico;
    }
}
