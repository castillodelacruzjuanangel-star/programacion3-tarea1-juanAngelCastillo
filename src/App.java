import java.util.Scanner;

public class App {

    //determina si un numero entero es par o impar
    public static void esPar(int num) {
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    //imprime la tabla de multiplicar del 1 al 12 de un numero solicitado
    public static void tablaMultiplicar(int num) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }

    //cuenta todas la vocales de una cadena de caracteres
    public static void contarVocales(String palabra) {
        int cantidadVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toUpperCase().charAt(i); //convierte cada letra de la cadena en mayuscula
            if ("AEIOU".indexOf(letra) != -1) {
                cantidadVocales++;
            }
        }
        System.out.println("La cadena ingresada tiene " + cantidadVocales + " vocales");
    }

    //calcula el promedio de notas de un curso
    public static void promedioNota(int cantidadEstudiantes) {
        int notaTotal = 0; //acumula la nota total del curso
        Scanner cs = new Scanner(System.in);

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.print("Ingrese la calificacion del estudiante " + i + ": ");
            notaTotal += cs.nextInt();
        }
        System.out.println("El promedio de es: " + Calculadora.Division(notaTotal, cantidadEstudiantes)); //se llama al metodo Division de la clase calculadora
    }

    //metodo para crear matriz 3x3
    public static void crearMatriz() {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los elementos de la matriz: ");
        //solicita al usuario los numeros que compondran la matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                matriz[i][k] = leer.nextInt();
            }
        }

        System.out.println("Matriz resultante: ");
        //imprime la matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(matriz[i][k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);
        int num; 
        boolean salir = false; //variable booleana para controlar el bucle while

        while (!salir) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("""
                    1. Calculadora
                    2. Numero par o impar
                    3. Tabla de multiplicar
                    4. Contador de vocales
                    5. Promedio de notas
                    6. Clase estudiante
                    7. Cuenta bancaria
                    8. Herencia de vehiculo
                    9. Matriz 3x3
                    10. Sistema basico de inventario
                    11. salir de la aplicacion
                    """);

            System.out.print("Seleccione una opcion del menu: ");
            int opcion = leer.nextInt(); //lee y guarda en la variable 'opcion' la opcion seleccionada  

            switch (opcion) {
                case 1:
                    System.out.println("CAlCULADORA SIMPLE");

                    System.out.println("1. suma\n2. resta\n3. multiplicacion\n4.division");
                    int op = leer.nextInt();

                    System.out.print("Ingrese el primer numero: ");
                    int num1 = leer.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num2 = leer.nextInt();

                    if (op == 1) {
                        System.out.println(Calculadora.Suma(num1, num2));
                    } else if (op == 2) {
                        System.out.println(Calculadora.Resta(num1, num2));
                    } else if (op == 3) {
                        System.out.println(Calculadora.Multiplicar(num1, num2));
                    } else if (op == 4) {
                        System.out.println(Calculadora.Division(num1, num2));
                    } else {
                        System.out.println("La opcion seleccionada NO es valida");
                    }
                    break;
                case 2:
                    System.out.println("DETERMINA SI UN ENTERO ES PAR O IMPAR!!");

                    System.out.print("Ingrese un numero entero: ");
                    num = leer.nextInt();

                    esPar(num);
                    break;
                case 3:
                    System.out.println("TABLA DE MULTIPLICAR");

                    System.out.print("Ingrese el numero el cual desea ver su tabla: ");
                    num = leer.nextInt();

                    tablaMultiplicar(num);
                    break;
                case 4:
                    System.out.println("CONTADOR DE VOCALES");
                    leer.nextLine(); //limpia el buffer
                    System.out.print("Ingrese una cadena de caracteres: ");
                    String cadena = leer.nextLine();

                    contarVocales(cadena);
                    break;
                case 5:
                    System.out.println("PROMEDIO DE NOTAS");

                    System.out.print("Ingrese la cantidad de estudiantes del curso: ");
                    num = leer.nextInt();

                    promedioNota(num);
                    break;
                case 6: {
                    System.out.println("CLASE ESTUDIANTE");
                    Estudiante e = new Estudiante();

                    System.out.println("Ingrese los datos del estudiante: ");
                    leer.nextLine();
                    System.out.print("NOMBRE: ");
                    e.setNombre(leer.nextLine());

                    System.out.print("CARRERA: ");
                    e.setCarrera(leer.nextLine());

                    System.out.print("MATRICULA: ");
                    e.setMatricula(leer.nextInt());

                    System.out.println("Datos del estudiante:");
                    e.Imprimir();

                    break;
                }

                case 7: {
                    System.out.println("CUENTA BANCARIA");
                    CuentaBancaria cuenta = new CuentaBancaria();
                    cuenta.CrearCuenta();
                    cuenta.Imprimir();

                }
                    break;
                case 8: {
                    System.out.println("HERENCIA DE VEHICULO");

                    System.out.println("Se inicializo un objeto carro");
                    Carro auto = new Carro(); //crea un objeto de tipo Carro
                    auto.setMarca("Mercedez"); //usa el metodo 'setMarca' heredada de la clase Vehiculo
                    auto.setColor("negro");

                    System.out.println("Se inicializo un objeto motocicleta");
                    Motocicletas moto = new Motocicletas(); //crea un objeto de tipo Motocicleta
                    moto.setMarca("yamaha"); //usa el metodo 'setMarca' heredada de la clase Vehiculo
                    moto.setColor("rojo");

                    //imprime los datos de ambos objetos
                    System.out.println("Evidiencia de herencia:");
                    System.out.println("El vehiculo 1 es un carro: " + auto.getMarca() + " color: " + auto.getColor());
                    System.out.println("El vehiculo 2 es una motocicleta: " + moto.getMarca() + " color: " + moto.getColor());
                }
                    break;
                case 9:
                    System.out.println("MATRIZ 3x3");

                    crearMatriz(); //llama al metodo crearMatriz
                    break;
                case 10: {
                    System.out.println("SISTEMA BASICO DE INVENTARIO");
                    leer.nextLine();
                    Carro[] inventario = new Carro[5]; //crea un arreglo de tipo Carro 

                    for (int i = 0; i < inventario.length; i++) {
                        inventario[i] = new Carro(); //crea un objeto en la posicion i
  
                        System.out.print("Ingrese la marca del carro: ");
                        inventario[i].setMarca(leer.nextLine()); //establece la marca

                        System.out.print("Ingrese el color del carro: ");
                        inventario[i].setColor(leer.nextLine()); //establece el color
                    }
                    //imprime los autos guardados 
                    System.out.println("Resumen de inventario: ");
                    for (int i = 0; i < inventario.length; i++) {
                        System.out.println("Marca: " + inventario[i].getMarca() + " Color: " + inventario[i].getColor());
                    }
                }
                    break;
                case 11:
                    salir = true; //cambia salir como verdadero para parar el bucle
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion NO valida. Seleccione una de la opciones disponibles");     
            }
            
        }
        leer.close(); //cierra el Scanner declarado en el main
    }
}