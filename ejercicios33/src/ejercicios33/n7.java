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
public class n7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float presupuesto = 0;
        float urgencia = (float) 0.37;
        float pediatria = (float) 0.42;
        float traumatologia = (float) 0.21;
        float pres_ur = 0;
        float pres_pedi = 0;
        float pres_trau = 0;
        float total_ur = 0;
        float total_trau = 0;
        float total_pedi = 0;
        
        System.out.println("Ingrese el presupuesto del hospital:");
        presupuesto = entrada.nextFloat();
        pres_ur = presupuesto * urgencia;
        pres_pedi = presupuesto * pediatria;
        pres_trau = presupuesto * traumatologia;
        total_ur = presupuesto - pres_ur;
        total_pedi = presupuesto - pres_pedi;
        total_trau = presupuesto - pres_trau;
        
        System.out.println("El presupuesto es de: "+ presupuesto+ " el presupuesto de urgencia es de:"
                + total_ur);
        System.out.println("El presupuesto es de: " + presupuesto+ " el presupuesto de pediatria es de:"
        + total_pedi);
        System.out.println("El presupuesto es de: "+ presupuesto+ " el presupuesto de traumatologia es de"
        + total_trau);
        
    }
    
}
