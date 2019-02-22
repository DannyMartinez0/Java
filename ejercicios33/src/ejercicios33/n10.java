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
public class n10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        
        float metro_cubico =(float)0.5;
        float pared = 0;
        float revoque = 0;
        float alto = 0;
        float largo = 0;
        
        System.out.println("Ingrese alto de la pared: ");
        alto = entrada.nextFloat();
        System.out.println("Ingrese largo de la pared: ");
        largo = entrada.nextFloat();
        pared = (alto * largo);
        revoque = metro_cubico * pared;
        System.out.println("metros cubicos: "+ pared + " arena necesaria para el revoque es de: "
                + revoque + " m3");
    }
    
}
