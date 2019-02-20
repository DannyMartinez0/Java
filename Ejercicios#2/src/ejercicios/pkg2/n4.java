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
public class n4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int valor1 = 0;
        
        System.out.println("Ingrese un numero:.");
        valor1 = entrada.nextInt();
        if (valor1 > 0){
            System.out.println("el numero es positivo: "+ valor1);
        }
        else if (valor1 < 0){
            System.out.println("el numero es negativo: "+ valor1);
        }
        else{
            System.out.println("el numero es cero: "+ valor1);
        }
    }
    
}
