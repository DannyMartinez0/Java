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
public class n31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float pi = (float) 3.1416;
        float radio = 0;
        float area= 0;
        
        System.out.println("Ingrese el radio de un circulo:");
        radio = entrada.nextFloat();
        area = pi * (radio * radio);
        System.out.println("El area del circulo es de: "+ area + "cm2");
    }
    
}
