/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class ejercicio5 {
public static void main(String[] args) {
    Scanner ingresar = new Scanner (System.in);
    String producto = "";
    float total = 0;
    float precio = 0;
    
    while (precio >= 0)
    {
        System.out.println("ingrese el nombre del producto:");
        producto = ingresar.next();
        System.out.print("ingrese el precio del producto:");
        precio = ingresar.nextFloat();
        
        if (precio >= 1)
        {
            total = (total+precio);
        }
    }    
    System.out.println("El total es de: "+ total);
    if (total >=1500)
    {
        System.out.println("Con el descuento el total es de: "+ (total*0.1));
    }
    else if (total >=500)
    {
        System.out.println("Con el descuento el total es de: "+ (total*0.5));
    }
}}
