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
public class n21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float P = (float) 0.25;
        float saldo = 0;
        float saldo_n = 0;
        
        System.out.println("ingrese su sueldo anterior");
        System.out.println("calcular su aumento");
        saldo = entrada.nextFloat();
        saldo_n = saldo*P;
        
        System.out.println("su nuevo sueldo es de "+(saldo+saldo_n));
    }
    
}
