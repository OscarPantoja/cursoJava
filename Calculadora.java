public class Calculadora {
    public static void main(String args[]){
        
        int operacion = 8;
        int numUno = 8;
        int numDos = 2;
        int resultado = 0;

        if(operacion == 1){
            resultado = numUno + numDos;
            System.out.println("La suma de los numeros es: " + resultado);
        } else if (operacion == 2){
            resultado = numUno - numDos;
            System.out.println("La resta de los numeros es: " + resultado);
        } else if (operacion == 3){
            resultado = numUno * numDos;
            System.out.println("La multiplicacion de los numeros es: " + resultado); 
        } else if (operacion == 4){
            resultado = numUno / numDos;
            System.out.println("La division de los numeros es: " + resultado); 
        } else {
            System.out.println("La opcion que elegiste no es valida"); 
        }
    }
}