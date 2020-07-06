package e8_cajm;
import java.util.Scanner;
public class E8_CAJM {
     public static void main(String[] args) {
        Scanner eluyuyuy = new Scanner(System.in);

        double num,raizCubica,potencia;
        System.out.print("Escribe un numero: ");
        num=eluyuyuy.nextInt();

raizCubica = Math.cbrt(num);//para sacar raiz cubica
potencia = Math.pow(raizCubica, 3);//potencia
System.out.println("El numero que ingresaste es la tercera potencia de "+raizCubica);

if(potencia==num){
System.out.println("Tu número es un cubo. :)");
}else{
System.out.println("Tu numero no es cubo");
      } 
}
    }
