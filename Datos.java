import java.util.Scanner;

public class Datos{
    public static void main(String args[]){
        
        Scanner entradaDatos = new Scanner(System.in);
        String nombre = "";
        int numUno = 0, numDos = 0, resultado = 0;

        System.out.println("Cual es tu nombre?");
        nombre = entradaDatos.nextLine();

        System.out.println("Ingresa un numero: ");
        numUno = entradaDatos.nextInt();

        System.out.println("Ingresa un numero: ");
        numDos = entradaDatos.nextInt();

        resultado = numUno + numDos;
        System.out.println("Hola " + nombre + " el resultado de la suma es: " + resultado);
    }
}
