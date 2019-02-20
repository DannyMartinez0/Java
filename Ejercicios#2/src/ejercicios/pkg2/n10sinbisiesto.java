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
public class n10sinbisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int day = 0;
        int mounth = 0;
        int year = 0;
        
        System.out.println("Ingrese dia:.");
        day = entrada.nextInt();
        System.out.println("Ingrese mes:.");
        mounth = entrada.nextInt();
        System.out.println("Ingrese anio:.");
        year = entrada.nextInt();
        
        if (mounth >=1 && mounth <=12){
            switch (mounth){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
                break;
                case 4: case 6: case 9: case 11: day = 30;
                break;
                case 2:
                    if ((year%4==0 && year%100!=0) || year%400==0){
                        if (day >=1 && day <= 29)
                        System.out.println("fecha correcta");
                        else{
                            System.out.println("fecha incorrecta");
                        }
                      }
                    else{
                        if (day >=1 && day <=28)
                            System.out.println("fecha correcta");
                        else{
                            System.out.println("fecha incorrecta");
                        }
                    }
            }
            if (day !=0){
                System.out.println("el mes es: "+ mounth + " del anio: "+ year + " tiene: "+ day + " dias");
            }
        }
        else{
            System.out.println("es incorrecto");
        }
    }
}
