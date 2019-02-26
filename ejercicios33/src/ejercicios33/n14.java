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
public class n14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int a = 0;
        int b = 0;
        int c = 0;
        int concatenado = 0;
        System.out.println("Ingrese un numero");
        a = entrada.nextInt();
        System.out.println("Ingrese un numero");
        b = entrada.nextInt();
        System.out.println("Ingrese un numero");
        c = entrada.nextInt();
        
        concatenado = Integer.valueOf(String.valueOf(a)+String.valueOf(b)+ String.valueOf(c));
        System.out.println("los numeros son: "+ concatenado);
    }
    
}
