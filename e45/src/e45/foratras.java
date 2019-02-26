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
public class foratras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        System.out.println("Nombre:.");
        nombre = sc.next();
        
        for(int i = nombre.length() -1 ; i>= 0; i--){
            //System.out.println("El valor de i es:."+i);
            System.out.print(nombre.subSequence(i, i+1));
            
        }
    }
    
}
