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
public class n22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float distancia = 0;
        
        System.out.println("ingrese una distancia en metros:.");
        distancia = entrada.nextFloat();
        System.out.println("la distancia en pulgadas es de:."+(distancia*39.37));
        System.out.println("la distancia en pies es de:."+(distancia*3.28));
    }
    
}
