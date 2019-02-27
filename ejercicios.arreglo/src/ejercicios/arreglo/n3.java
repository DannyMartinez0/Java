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
public class n3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int datos[];
        datos = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("introduzca un numero:. ");
            datos[i] = entrada.nextInt();
        }
        System.out.println("los numeros son:.");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("numero-"+ datos[i]+" numero-"+datos[9-i]);
        }
    }
    
}
