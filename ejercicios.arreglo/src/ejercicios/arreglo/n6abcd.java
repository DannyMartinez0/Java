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
public class n6abcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        char abecedario[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            abecedario[j] = (char) i;
        }   
        
        String cadena = "";
        int menos = -1;
        
        do
        {
            System.out.println("Elija un numero entre 0 y " +(abecedario.length -1));
            menos = entrada.nextInt();
            
            if (!(menos >= 0 && menos <= abecedario.length -1))
            {
                System.out.println("Error, ingrese otro numero");
            }
            else
            {
                if (menos != -1)
                {
                    cadena += abecedario[menos];
                }
            }
        } while (menos != -1);
        System.out.println(cadena);
    }
    
}
