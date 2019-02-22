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
public class n3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        double hora = 0;
        double costo = (double) 1.5;
        double cobro = 0;
        
        System.out.println("Ingrese horas consumidas: ");
        hora = entrada.nextInt();
        cobro = (hora * costo);
        
        if (hora >=15 && hora <20){
            System.out.println("tienes tres hora gratis.");
            System.out.println("el total a pagar es: "+ cobro);
        }
        else if (hora >=10 && hora <15){
            System.out.println("tienes dos horas gratis.");
            System.out.println("el total a pagar es: "+ cobro);
        }
        else if (hora >=5 && hora <10){
            System.out.println("tienes una horas gratis.");
            System.out.println("el total a pagar es: "+ cobro);
        }
        else{
            System.out.println("no tiene horas gratis");
        }
    }
}
