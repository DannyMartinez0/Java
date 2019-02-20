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
public class n9fecha30dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int year = 0;
        int mounth = 0;
        int day = 0;
        
        System.out.println("Ingrese un dia:.");
        day = entrada.nextInt();
        if (day > 0 && day <31){
            System.out.println("El dia es correcto:"+ day);
        }
        else{
            System.out.println("dia incorrcto");
        }
        System.out.println("ingrese un mes:.");
        mounth = entrada.nextInt();
        if (mounth >0 && mounth <13){
            System.out.println("El mes es correcto:"+ mounth);
        }
        else{
            System.out.println("el mes es incorrecto");
        }
        System.out.println("ingrese un anio");
        year = entrada.nextInt();
        if (year >0){
            System.out.println("El anio es correcto:"+ year);
        }
        else{
            System.out.println("Datos incorrectos");
        }
    }
    
}
