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
public class n30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero = 0;
        int resultado = 0;
        
        System.out.println("Ingrese un numero:");
        numero = entrada.nextInt();
        resultado = (int) Math.sqrt(numero);
        System.out.println("la raiz cuadrada es:" + resultado);
    }
    
}
