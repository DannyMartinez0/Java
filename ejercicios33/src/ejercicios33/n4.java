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
public class n4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        double bs = 0;
        double bs_dolar = (double) 2.15;
        double dolar_euro = (double) 1.45;
        double cambiod = 0;
        double cambioe = 0;
        
        System.out.println("ingrese una cantidad de bs a convertir a dolar y a euro:");
        bs = entrada.nextDouble();
        cambiod = bs * bs_dolar;
        cambioe = cambiod * dolar_euro;
        System.out.println("El cambio de bs a dolar es de:"+ cambiod + " el cambio de dolar a euro es de: "+ cambioe);        
    }
}
