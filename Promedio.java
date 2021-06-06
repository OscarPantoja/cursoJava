public class Promedio{
    public static void main(String args[]){
        int matematicas = 7;
        int biologia = 10;
        int quimica = 9;
        int promedio = 0;

        promedio = (matematicas + biologia + quimica)/3;

        if( promedio >= 6 ) {
            System.out.println("Promedio: " + promedio + " El alumno aprobo");
        }else{
            System.out.println("Promedio: " + promedio + " El alumno reprobo");
        }
            
    }
}