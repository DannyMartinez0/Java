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
public class n2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numeros[];
        numeros = new int[5];
        int contador_positivo = 0, contador_negativo = 0, contador_0 = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("introduzca un numero:.");
            numeros[i] = entrada.nextInt();
            if(numeros[i] > 0){
                contador_positivo++;
            }
            else if(numeros[i] < 0){
                contador_negativo++;
            }
            else{
                contador_0++;
            }
        }
        
        System.out.println("La cantidad de positivos es de:. "+ contador_positivo);
        System.out.println("La cantidad de negativos es de:. "+ contador_negativo);
        System.out.println("La cantidad de ceros es de:. "+ contador_0);
    
    }
    
}
