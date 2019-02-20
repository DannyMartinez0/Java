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
public class Ejercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
       float nota1 = 0;
       float nota2 = 0;
       float nota3 = 0;
       float nota4 = 0;
       float suma = 0;
       float promedio = 0;
       
       System.out.println("Ingrese primera nota:. ");
       nota1 = entrada.nextFloat();
       System.out.println("Ingrese segunda nota:. ");
       nota2 = entrada.nextFloat();
       System.out.println("Ingrese tercera nota:. ");
       nota3 = entrada.nextFloat();
       System.out.println("Ingrese cuarta nota:. ");
       nota4 = entrada.nextFloat();
       
       suma = (nota1 + nota2 + nota3 + nota4);
       promedio = (suma / 4);
       
       System.out.println("El Promedio es:."+ promedio);
       
    }
    
}
