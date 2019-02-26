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
public class n18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float tasa = (float) 0.15;
        float compra = 0;
        float descuento = 0;
        
        System.out.println("Ingrese valor de la compra:");
        compra = entrada.nextFloat();
        
        descuento = compra * tasa;
        System.out.println("Tu descuento es:"+ descuento);
        
        System.out.println("Tu total a pagar es:" + (compra - descuento));
        
    }
    
}
