/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios33;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class n19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        
        System.out.println("Ingresa primera nota:.");
        nota1 = entrada.nextInt();
        System.out.println("Ingresa segunda nota:.");
        nota2 = entrada.nextInt();
        System.out.println("Ingresa tercera nota:.");
        nota3 = entrada.nextInt();
        
        System.out.println("su nota es de:"+(nota1 + nota2 + nota3));
        
    }
    
}
