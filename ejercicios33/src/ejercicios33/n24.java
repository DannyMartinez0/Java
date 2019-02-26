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
public class n24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float peso = 0;
        System.out.println("ingrese el peso en kilos");
        peso = entrada.nextFloat();
        
        System.out.println("el peso en gramos es de:."+ (peso*1000));
        System.out.println("el peso en libras es de:."+ (peso*2.20462));
        System.out.println("el peso en toneladas es de:."+ (peso*0.001));
        
    }
    
}
