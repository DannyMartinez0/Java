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
public class n26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        
        System.out.println("ingrese un numero");
        numero1 = entrada.nextInt();
        System.out.println("ingrese un segundo numero");
        numero2 = entrada.nextInt();
        System.out.println("ingrese un tercer numero");
        numero3 = entrada.nextInt();
                
        int suma = (numero1+numero2+numero3);
        int resta = (numero1-numero2-numero3);
        int multiplicacion = (numero1*numero2*numero3);
        
        if (suma > 0 && resta > 0 && multiplicacion > 0){
            System.out.println("la suma es: "+ suma);
            System.out.println("la resta es: "+ resta);
            System.out.println("la multipĺicacion es: "+ multiplicacion);

        }
        else{
            System.out.println("los numeros son negativos.");
    }
    
  }
}
