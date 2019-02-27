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
public class n1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        arreglo = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("introduzca un numero:");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("Los numeros son:");
        
        for (int i = 4; i >=  0; i--) {
            System.out.println("El numero es:. "+ arreglo[i]);
        }
    }
    
}
