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
public class n17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float tasa = (float) 0.10;
        float sueldo = (float) 0;
        float venta1 = (float) 0;
        float venta2 = (float) 0;
        float venta3 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese sueldo base:");
        sueldo = entrada.nextFloat();
        
        System.out.println("Ingrese valor de la primera venta:");
        venta1 = entrada.nextFloat();
        System.out.println("Ingrese valor de la segunda venta:");
        venta2 = entrada.nextFloat();
        System.out.println("Ingrese valor de la tercera venta:");
        venta3 = entrada.nextFloat();
        
        comision = (venta1 + venta2 + venta3) * tasa;
        
        System.out.println("su sueldo es: " + sueldo);
        System.out.println("su comision es: "+ comision);
        System.out.println("Total:"+ (sueldo+comision));
    }
    
}
