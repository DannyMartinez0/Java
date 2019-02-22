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
public class n29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float promedio = 0;
        
        System.out.println("Ingrese primera nota:");
        nota1 = entrada.nextFloat();
        System.out.println("Ingrese segunda nota:");
        nota2 = entrada.nextFloat();
        System.out.println("Ingrese tercera nota:");
        nota3 = entrada.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        if (promedio >= 9.5 && promedio <16){
            System.out.println("Aprobado"+ promedio);
        }
        else if(promedio >=16 && promedio <20){
            System.out.println("Aprobado"+ Math.round(promedio));
        }
        else{
            System.out.println("no aprobado: "+ promedio);
        }
        
    }
}
