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
public class n27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int fecha_ac = 0;
        int fecha_na = 0;
        
        System.out.println("ingrese fecha actual");
        fecha_ac = entrada.nextInt();
        System.out.println("ingrese fecha nacimiento");
        fecha_na = entrada.nextInt();
        
        int edad = (fecha_ac - fecha_na);
        
        if(edad > 0 && fecha_ac > 0 && fecha_ac > fecha_na )
        {
            System.out.println("su edad es de "+(fecha_ac - fecha_na));
        }
        else{
            System.out.println("la fecha nacimiento es negativa");
        }
        
    }
    
}
