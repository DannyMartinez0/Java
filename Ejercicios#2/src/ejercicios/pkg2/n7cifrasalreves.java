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
public class n7cifrasalreves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int cant;
        int numero = 0;
        
        System.out.println("Ingrese un numero:.");
        numero = entrada.nextInt();
        
        
        while (numero>0){
            cant=numero%10;
            numero=numero/10;
            System.out.print(cant);
        }
        System.out.println("");
    }
    
}
