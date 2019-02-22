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
public class n32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float pulgada = (float) 0.39737;
        float centimetro = 0;
        float total = 0;
        System.out.println("Ingrese los centimetros a convertir en pulgadas:");
        centimetro = entrada.nextFloat();
        total = centimetro * pulgada;
        System.out.println("las pulgadas son: "+ total);
    }
    
}
