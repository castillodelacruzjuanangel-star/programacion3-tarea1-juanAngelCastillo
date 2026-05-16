import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(){}

    public CuentaBancaria(String numeroCuenta, String titular, double saldo){
        setNumeroCuenta(numeroCuenta);
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo =  saldo;
    }

    public void Imprimir(){
        System.out.println("No: " + getNumeroCuenta() + " Titular: " + getTitular() + " Saldo: " + getSaldo());
    }

    public void CrearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos de la cuenta: ");
   
        System.out.print("Titula: ");
        setTitular(leer.nextLine());

        System.out.print("Numero de cuenta: ");
        setNumeroCuenta(leer.nextLine());

        System.out.print("Saldo: ");
        setSaldo(leer.nextDouble());
        leer.close();
    }
}
