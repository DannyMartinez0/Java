/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.arreglo;

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
        Scanner entrada = new Scanner(System.in);
        int valores[];
        valores = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero:. ");
            valores[i] = entrada.nextInt();
        }
        System.out.println("Los numeros son:. ");
        for (int i = 0; i < 5; i++) {
            System.out.println(valores[i]);
        }
        
    }
    
}
