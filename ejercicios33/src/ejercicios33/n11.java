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
public class n11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero= 0;
        int hora = 0;
        int minuto = 0; 
        int segundo = 0;
        System.out.println("ingrese los segundos ");
        numero=entrada.nextInt();
        hora=numero/3600;
        minuto=(numero-(3600*hora))/60;
        segundo=numero-((hora*3600)+(minuto*60));
        System.out.println(hora+"h "+minuto+"m "+segundo+"s");
    }
    
}
