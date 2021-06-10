import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args){
        int numero1, numero2, opcion;
        double resultado;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("1. Suma");
            System.out.println("2. Division");
            System.out.println("3. Salir");
            System.out.print("Elija opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: 
                       System.out.print("Ingrese primer número: ");
                       numero1 = entrada.nextInt();
                       System.out.print("Ingrese segundo número: ");
                       numero2 = entrada.nextInt();
                       resultado = numero1 + numero2;
                       System.out.println("El resultado de la suma es = " + resultado);
                       break;
                case 2:
                       System.out.print("Ingrese primer número: ");
                       numero1 = entrada.nextInt();
                       System.out.print("Ingrese segundo número: ");
                       numero2 = entrada.nextInt();
                       if(numero2 == 0){
                           System.out.println("No se puede dividir por cero.");
                       } else {
                           resultado = numero1/numero2;
                           System.out.println("El resultado de la división es = " + resultado);
                       }
                       break;
                case 3:
                       System.out.println("Espere un momento...");
                       try {
       
                            Thread.sleep(5*75);
                           }
                            catch (Exception e) {
                            System.out.println(e);
                           }
                       System.out.println("Saliendo...");
                       System.out.println("Proceso finalizado");
                       break;
            }
        }while( opcion != 3);
    }
}