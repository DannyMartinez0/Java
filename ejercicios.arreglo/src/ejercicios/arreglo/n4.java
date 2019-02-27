/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.arreglo;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class n4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in); 
        
        int a[], b[], c[];
        
        a = new int [10];
        b = new int [10];
        c = new int [20];
        
        System.out.println("Digite el primer arreglo:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero:.");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Digite el segundo arreglo:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero:.");
            b[i] = entrada.nextInt();
        }
        
        int j=0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.print("\nEl tercer arreglo es:.");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println("");
        
    }
    
}
