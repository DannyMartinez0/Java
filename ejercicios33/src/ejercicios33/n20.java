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
public class n20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int hombres = 0;
        int mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres:");
        hombres = entrada.nextInt();
        System.out.println("Ingresa la cantidad de mujeres:");
        mujeres = entrada.nextInt();
        
        total = hombres + mujeres;
        
        System.out.println("El porcentaje de mujeres es de:" + ((mujeres *100) / total));
        System.out.println("El porcentaje de hombres es de:" + ((hombres *100) / total));
    }
    
}
