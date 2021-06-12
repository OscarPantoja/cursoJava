import java.util.Scanner;

public class Vacaciones {
    public static void main(String args[]){
        
        Scanner entradaDatos = new Scanner(System.in);
        String nombre = "";
        int clave = 0;
        int antiguedad = 0;

        System.out.println("Ingresa tu nombre:");
        nombre = entradaDatos.nextLine();

        System.out.println("Ingrese la clave de departamento:");
        clave = entradaDatos.nextInt();

        

        if(clave == 1){
            System.out.println("Ingrese su antiguedad en anios:");
            antiguedad = entradaDatos.nextInt();
            if(antiguedad == 1){
                System.out.println(nombre +" tiene derecho a 6 dias de vaciones");
            }else if(antiguedad >=2 && antiguedad <=6){
                System.out.println(nombre +" tiene derecho a 14 dias de vaciones");
            }else if(antiguedad == 7){
                System.out.println(nombre +" tiene derecho a 20 dias de vaciones");
            }else{
                System.out.println(nombre +" aun no tiene derecho a vacaciones");
            }
        }else if(clave == 2){
            System.out.println("Ingrese su antiguedad en anios:");
            antiguedad = entradaDatos.nextInt();
            if(antiguedad == 1){
                System.out.println(nombre +" tiene derecho a 7 dias de vaciones");
            }else if(antiguedad >=2 && antiguedad <=6){
                System.out.println(nombre +" tiene derecho a 15 dias de vaciones");
            }else if(antiguedad == 7){
                System.out.println(nombre +" tiene derecho a 22 dias de vaciones");
            }else{
                System.out.println(nombre +" aun no tiene derecho a vacaciones");
            }
        }else if(clave == 3){
            System.out.println("Ingrese su antiguedad en anios:");
            antiguedad = entradaDatos.nextInt();
            if(antiguedad == 1){
                System.out.println(nombre +" tiene derecho a 10 dias de vaciones");
            }else if(antiguedad >=2 && antiguedad <=6){
                System.out.println(nombre +" tiene derecho a 20 dias de vaciones");
            }else if(antiguedad == 7){
                System.out.println(nombre +" tiene derecho a 30 dias de vaciones");
            }else{
                System.out.println(nombre +" aun no tiene derecho a vacaciones");
            }
        }else{
            System.out.println("Ingresa una clave valida");
        }
    }
}