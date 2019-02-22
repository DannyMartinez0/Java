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
public class n5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float descuento = (float)0.35;
        float precio_des = 0;
        float precio = 0;
        float total= 0;
        
        System.out.println("Ingrese el precio del producto a cobrar:");
        precio = entrada.nextFloat();
        precio_des = precio * descuento;
        total = precio - precio_des;
        System.out.println("el monto es de:"+ precio+ " el descuento es de: "+ precio_des + " el total a pagar es de:"+ total);
    }
    
}
