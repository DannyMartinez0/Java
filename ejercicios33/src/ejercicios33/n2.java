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
public class n2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        float kilometro = 0;
        float precio =(float) 10.50;
        float costo = 0;
        System.out.println("Ingrese los kilometros por recorrer:. ");
        kilometro = entrada.nextFloat();
        costo = kilometro * precio;
        System.out.println("El precio del viaje es de: "+ precio);
        
    }
    
}
