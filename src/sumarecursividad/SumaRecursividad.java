package sumarecursividad;
import java.util.Scanner;

public class SumaRecursividad {
    
    static Scanner entrada = new Scanner(System.in);
    
    static int fact(int numero){
        if (numero==0) {
            return 1;
        }else{
            return numero*fact(numero-1);
                    }
    }
   
   
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        SumaRecursividad.fact(numero);
        System.out.println(numero+"! = "+fact(numero));
    }
}
    