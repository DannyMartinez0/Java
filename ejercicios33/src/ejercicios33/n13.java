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
public class n13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        int cuadrado = 0;
        int cubo = 0;
        
        System.out.println("Ingrese un numero:.");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese un numero:.");
        valor2 = entrada.nextInt();
        
        cuadrado = (valor1 * 2) + (valor2 * valor2);
        cubo = (valor1 * valor1 * valor1) + (valor2 * valor2 * valor2)/3;
        
        System.out.println("la suma del doble del primero + cuadrado del segundo:. " + cuadrado);
        System.out.println("el promedio de los cubos:. "+ cubo);
        
    }
    
}
