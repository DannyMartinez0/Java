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
public class n33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float libra = (float) ((float) 1/ 2.2046);
        float kg = 0;
        float total = 0;
        System.out.println("Ingrese kilogramos a convertir a libras:");
        kg = entrada.nextFloat();
        total = kg * libra;
        System.out.println("las libras son: "+ total);
    }
    
}
