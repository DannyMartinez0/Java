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
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float valor1 = 0;
        float valor2 = 0;
        float total = 0;
        
        System.out.println("convertir dolar a quetzal");
        System.out.println("ingrese dolares:.");
        valor1 = entrada.nextFloat();
        System.out.println("ingrese quetzales:.");
        valor2 = entrada.nextFloat();
        
        total = (valor1/valor2);
        
        System.out.println("cantidad convertida es:."+ total);
        
    }
    
}
