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
public class n9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float sueldo_t = 0;
        float horas_t = 0;
        float sueldo_h = 0;
        float hora_ex = 0;
        float doble = 0;
        float sueldo_d = 0;
        
        System.out.println("Ingrese horas trabajadas del empleado:");
        horas_t = entrada.nextFloat();
        System.out.println("Ingrese sueldo por la hora de trabajo:");
        sueldo_h = entrada.nextFloat();
        System.out.println("Ingrese horas extras del empleado:");
        hora_ex = entrada.nextFloat();
        doble = hora_ex * hora_ex;
        sueldo_t = horas_t * sueldo_h;
        sueldo_d = doble + sueldo_t;
        
        System.out.println("El sueldo es de: "+ sueldo_t+ " por sus horas extras: "+ doble 
                + " El sueldo total es de: "+ sueldo_d);
        
        
    }
    
}
