public class Operaciones{
    public static void main(String args[]){
        int numUno = 4;
        int numDos = 8;
        int res = 0;

        res = numUno + numDos / 2;
        System.out.println("El resultado sin parentesis es: " + res);

        res = (numUno + numDos) / 2;
        System.out.println("El resultado con parentesis es: " + res);

    }
}