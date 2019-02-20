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
public class n6leerdigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int cant = 0;
        int numero = 0;
        
        System.out.println("ingrese un numero: ");
        numero = entrada.nextInt();
        
        if(numero < 0){
            numero = numero * -1;
        }
        cant = Integer.toString(numero).length();
        System.out.println("la cantidad en digitos es de:. "+ cant);
    }
    
}
