/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class Pruebas {

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
        if (day > 0 && day < 31){
            System.out.println("El dia es:"+ day);
        }
        else{
            System.out.println("dia incorrcto");
        }
        System.out.println("ingrese un mes:.");
        mounth = entrada.nextInt();
        if (mounth >0 && mounth <13){
            System.out.println("El mes es:"+ mounth);
        }
        else{
            System.out.println("el mes es incorrecto");
        }
        System.out.println("ingrese un a;o");
        year = entrada.nextInt();
        if (year >0){
            System.out.println("El a;o es:"+ year);
        }
        else{
            System.out.println("Datos incorrectos");
        }
    }
    
}
