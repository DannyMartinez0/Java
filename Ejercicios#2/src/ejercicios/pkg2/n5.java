/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.pkg2;

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
        
        float valor1 = 0;
        float valor2 = 0;
        
        System.out.println("Ingrese un numero: ");
        valor1 = entrada.nextFloat();
        System.out.println("Ingrese un numero: ");
        valor2 = entrada.nextFloat();
        
        if (valor1%valor2 == 0 ){
            System.out.println("los numeros son multiplos: "+ valor1 +"--"+ valor2);
        }
        else{
            System.out.println("los numeros no son multiplos: "+ valor1 +"--"+ valor2);
        }
    }
    
}
