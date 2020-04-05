/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcajm002;

import java.util.Scanner;

/**
 *
 * @author charl
 */
public class ProgCAJM002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escaner=new Scanner(System.in);
            int v1,v2;
                System.out.println("Escribe valor: ");
                v1=escaner.nextInt();
                System.out.println("Escribe el otro valor: ");
                v2=escaner.nextInt();
                    String[][] mat1 = new String[v1][v2];
                    String[][] mat2 = new String[v1][v2];
                    String[][] mat3 = new String[v1][v2];
                   
                    for(int i=0;i<v1;i++){
                        for(int j=0;j<v2;j++){
                            if((i==0 && j<v2)||(j==0 && i<v1)||(j==v1-1 && i==j)){
                                mat1[i][j]="0";
                            }else{
                                mat1[i][j]="1";
                            }
                        }
                        for(i=0;i<v1;i++){
                        for(int j=0;j<v2;j++){
                            System.out.print(mat1[i][j]+ " ");
                        }
                        System.out.println();
                        }
                    }
                        System.out.print("Segunda matriz: ");
                            for(int i=0;i<v1;i++){
                                for(int j=0;j<v2;j++){
                                if((i==j)||(i+j==v1)){
                                    mat2[i][j]="0";
                                }else{
                                    mat2[i][j]="1";
                                }
                                }
                                    for(i=0;i<v1;i++){
                                        for(int j=0;j<v2;j++){
                                        System.out.print(mat2[i][j] + " ");
                                        }
                                        System.out.println();
                                    }
                            }
                                
                                 System.out.println("Tercera matriz: ");
                                    for(int i=0;i<v1;i++){
                                    for(int j=0;j<v2;j++){
                                        if((i+j==(v2-1))){
                                            mat3[i][j]= " ";}
                                        if(i+j>v1){
                                            mat3[i][j]="1";
                                        }else{
                                            mat3[i][j]="0";
                                        }
                                    }
                                        for(i=0;i<v1;i++){
                                        for(int j=0;j<v2;j++){
                                        System.out.print(mat3[i][j] + " ");
                                        }
                                        System.out.println();
                                    }
                                    }
    
    
}}
