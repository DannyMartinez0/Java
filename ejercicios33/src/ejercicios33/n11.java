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
public class n11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float presio_s= (float) 0.25;
        float hora = 0;
        float minuto = 0; 
        float segundo = 0;
        float tiempo_s = 0;
        
        System.out.println("Ingrese las horas:.");
        hora = entrada.nextFloat();
        System.out.println("Ingrese los minutos:.");
        minuto = entrada.nextFloat();
        System.out.println("Ingrese los segundos:.");
        segundo = entrada.nextFloat();
        tiempo_s = segundo + (minuto * 60)+ ((hora * 60) * 60);
        System.out.println("el costo es de: "+ (tiempo_s * presio_s));
    }
    
}
