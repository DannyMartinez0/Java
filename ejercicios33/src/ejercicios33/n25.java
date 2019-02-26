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
public class n25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("ingrese un numero");
        numero1 = entrada.nextInt();
        System.out.println("ingrese un segundo numero");
        numero2 = entrada.nextInt();
        if (numero1 >= 0 && numero2 >= 0)
        {
            System.out.println("la suma es:."+(numero1+numero2));
            System.out.println("la multiplicacion es:."+(numero1*numero2));
        }
        else{
            System.out.println("ingrese un numero positivo");
        }
        
    }
    
}
