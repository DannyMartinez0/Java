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
public class n6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        float salario = 0;
        float descuento = (float) 0.03;
        float aumento = (float) 0.08;
        float salario_au = 0;
        float salario_des = 0;
        float salario_total_aum_des = 0;
        float salario_total_des = 0;
        
        System.out.println("Ingrese sueldo del empleado:");
        salario = entrada.nextFloat();
        salario_au = salario * aumento;
        salario_des = salario * descuento;
        salario_total_aum_des = salario +salario_au - salario_des;
        salario_total_des = salario - salario_des;
        if (salario > 800){
            System.out.println("sueldo: "+ salario + " obtuvo un aumento de: "+ salario_au+ 
                    " y un descuento de: "+ salario_des +" y su salario total es de: "
                    + salario_total_aum_des);
        }
        else{
            System.out.println("sueldo: "+ salario+ " obtuvo un descuento de: "+ salario_des +
                    " y su salario total es de: "+ salario_total_des);
        }
    }   
}