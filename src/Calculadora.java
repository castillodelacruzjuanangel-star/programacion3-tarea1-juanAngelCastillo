

public class Calculadora {

    public static int Multiplicar(int num1, int num2){
        return num1 + num2;
    }

    public static int Suma(int num1, int num2){
        return num1 + num2;
    }

    public static int Resta(int num1, int num2){
        return num1 - num2;
    }

    public static int Division(int num1, int num2){
        try{
            int resultado = num1 / num2;
            return resultado;
        }catch(ArithmeticException e){
            System.out.println("ERROR! No se puede dividir entre cero.");
            System.out.println("Detalle tecnicos: " + e.getMessage());
        }finally{
            System.out.println(" Operacion finalizada.");
        }
        return 0;
    }
}
