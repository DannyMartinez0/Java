/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int valor1 = 0;
    int valor2 = 0;
    float multiplicacion = 0;
  
            
    System.out.print("ingrese quetzales:.");
    valor1 = Integer.valueOf(entrada.next());
    System.out.print("ingrese valor del dolar:.");
    valor2 = Integer.valueOf(entrada.next());
    
    
    multiplicacion = valor1 * valor2;
    
    System.out.println("Los Quetzales en dolares son:."+ multiplicacion);
    }
  
}
