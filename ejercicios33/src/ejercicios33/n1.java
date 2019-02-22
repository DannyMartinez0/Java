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
public class n1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float prestamo = 0;
        float tasa_anual = (float) 0.27;
        
        System.out.println("Ingrese cantidad del prestamo:.");
        prestamo = entrada.nextFloat();
        tasa_anual = prestamo * tasa_anual;
        
        System.out.println("La tasa del prestamo es de: "+ tasa_anual);
        
    }
    
}
