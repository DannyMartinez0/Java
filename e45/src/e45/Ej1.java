/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e45;

import java.util.Scanner;

/**
 *
 * @author zeus
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir un numero entre 0 y 9999 y decir cuantas cifras tiene
        Scanner entrada = new Scanner(System.in);
        int dato = 0;
        /*
        System.out.println("ingresa un numero:.");
        dato = Integer.valueOf(entrada.next());
        System.out.print("El numero de cifras es:.");
        System.out.print(String.valueOf(dato).length());
        */
        
        System.out.print("Ingresa un numero:.");
        dato = Integer.valueOf(entrada.next());
        
        if(dato >= 0 && dato <=9999){
            if(dato >= 0 && dato <= 9){
                System.out.println("El numero:. "+dato+" tiene 1 cifra");
            }
            else if(dato >= 10 && dato <=99){
                System.out.println("El numero:. "+dato+" tiene 2 cifras");
            }
            else if(dato >= 100 && dato <=999){
                System.out.println("El numero:. "+dato+" tiene 3 cifras");
            }
            else if(dato >= 1000 && dato <=9999){
                System.out.println("El numero:. "+dato+" tiene 4 cifras");
            }
            
        }else{
            System.out.println("No valido.");
        }
            
        
    }
    
}
