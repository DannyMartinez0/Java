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
public class n3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        
        System.out.println("Ingrese un numero.");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese un numero.");
        valor2 = entrada.nextInt();
        
        if (valor1 == valor2){
            System.out.println("Los numeros son iguales:. "+ valor1 +"--" + valor2);
        }
        else{
            System.out.println("Los numeros no son iguales:. "+ valor1 + "--"+ valor2);
        }
        
    }
    
}
