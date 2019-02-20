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
public class n8numerocapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero = 0;
        int resto = 0;
        int falta = 0;
        int invertido = 0;
        
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        falta = numero;
        
        while (falta!=0){
            resto =falta%10;
            invertido = invertido * 10 + resto;
            falta= falta/10;
        }
            
        if (invertido == numero){
            System.out.println("el numero es capicua");
        }else{
            System.out.println("el numeor no es capicua");
        }
    }
  }