/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgprivate;

import java.util.Scanner;

/**
 *
 * @author charl
 */
public class Private {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arre[],nElementos,aux;
        System.out.print("Escibe la cantidad de elementos: ");
        nElementos=entrada.nextInt();
            arre = new int[nElementos];
            
            for(int i=0;i<nElementos;i++){
                System.out.print((i+1)+". Escribe un numero: ");
               arre[i] = entrada.nextInt();
            }
            
            for(int i = 0;i<(nElementos-1);i++){
                for(int j = 0;j<(nElementos-1);j++){
                    if(arre[j]>arre[j+1]){
                        aux = arre[j];
                        arre[j] = arre[j+1];
                        arre[j+1] = aux;
                    }
                }
                for(int a=(nElementos-1);a>=0;a--){
                    System.out.println(arre[a]+" ");
                
               // System.out.print(" ");
            }
            
            }
    }
    
}
