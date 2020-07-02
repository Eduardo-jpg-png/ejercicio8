package cubo;
import java.util.Scanner;
public class Cubo {
    public static void main(String[] args) {
        double n1, c;
        int raiz=0;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Introduce el numero : ");
        n1=sc.nextInt();
        c=Math.cbrt(n1);
        raiz = (int) c;
        if (c==raiz){
            System.out.println("Es un cubo : " + c);
        }
        else{
            System.out.println("No es un cubo " );
        }
    }
    
}
