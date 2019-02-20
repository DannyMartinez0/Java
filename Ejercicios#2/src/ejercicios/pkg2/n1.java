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
public class n1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float radio = 0;
        float area = 0;
        float PI = (float) 3.1416;
        
        System.out.println("Ingrese el radio de un circulo:. ");
        radio = entrada.nextFloat();
        
        area = radio * PI * PI;
        
        System.out.println("el Area del circulo es:. "+ area);
    }
    
}
