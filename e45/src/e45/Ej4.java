/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e45;

import java.util.Scanner;

/**
 *
 * @author zeus
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //solicitar dia mes año y validar si la fecha es correcta
        Scanner sc = new Scanner(System.in);
        int dia = 0, mes = 0, anio = 0;
        System.out.println("Ingres dia:.");
        dia = Integer.valueOf(sc.next());
        System.out.println("Ingres mes:.");
        mes = Integer.valueOf(sc.next());
        System.out.println("Ingres año:.");
        anio = Integer.valueOf(sc.next());
        
        if(anio > 0){
            if(mes > 0 && mes < 13){
                if(dia > 0 && dia < 30){
                    System.out.println("La fecha:."+dia+"-"+mes+"-"+anio+" es correcta");
                }else{
                    System.out.println("El dia es incorrecto");
                }
            }else{
                    System.out.println("El mes es incorrecto");
                }
        }else{
            System.out.println("El año es incorrecto:.");
        }
        
        
    }
    
}
