package ejecucion;
import java.util.Scanner;

import proceso.Operaciones;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);




        System.out.println("Ingrese el valor uno" );
        int numeroUno = scanner.nextInt();

        System.out.println("Ingrese el valor dos" );
        int numeroDos= scanner.nextInt();


        Operaciones operaciones = new Operaciones(numeroUno,numeroDos);

        System.out.println("--------------------------------------------------------");
        System.out.println("Seleccione la operacion aritmetica que desea realizar   ");
        System.out.println("--------------------------------------------------------");
        System.out.println("1)  Suma");
        System.out.println("2)  Resta");
        System.out.println("3)  Multiplicacion");
        System.out.println("4)  Division");
        System.out.println("--------------------------------------------------------");

        int opciones = scanner.nextInt();
        int resultado;

        // Perform the chosen operation
        switch (opciones) {
            case 1:
                resultado = operaciones.opSuma();
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = operaciones.opResta();
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = operaciones.opMultiplicacion();
                System.out.println("El resultado de multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = operaciones.opDivision();
                 {
                    System.out.println("el resultado de la division es: " + resultado);
                }
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }


        scanner.close();

       // video
       // int resultadoSuma = operaciones.suma();
       // System.out.println("El resultado de la suma es:" + resultadoSuma);


    }



}