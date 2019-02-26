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
public class n12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
       
        float descuento = (float) 0.20;
        float sueldo = 0;
        
        System.out.println("Ingrese su sueldo:.");
        sueldo = entrada.nextFloat();
        System.out.println("El descuento es de: "+ (sueldo - (sueldo * descuento)));
        
    }
    
}
