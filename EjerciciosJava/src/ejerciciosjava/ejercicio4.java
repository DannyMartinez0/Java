/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author danny
 */
public class ejercicio4 {
    public static void main(String[] args) {
    Scanner ingresar = new Scanner (System.in);
    float numero = 0;
    float cubo = 0;
    float cuadrado = 0;
    int incremento = 0;
    
    while (incremento !=5)
    {
        System.out.println("ingrese el numero para elevarlo al cubo y al cuadrado: ");
        numero = ingresar.nextFloat();
        cubo = numero*numero*numero;
        cuadrado = numero*numero;
        System.out.println("El numero al cuadrado es: "+ cuadrado);
        System.out.println("El numero al cubo es: "+ cubo);
        incremento++;
    }}
}

