/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author danny
 */
public class ejercicio3 {
public static void main(String[] args) {
    Scanner ingreso = new Scanner (System.in);
    int decision = 0;
    float cantidadQ = 0;
    float cantidadD = 0;
    float valorQ = 0;
    float totalQ = 0;
    float total = 0;
    
    System.out.println("Desea convertir dolar a quetzal (1) \n si desea convertir quetzales a dolar");
    decision = ingreso.nextInt();
    
    if (decision == 1)
    {
    System.out.println("Convertidor de dolares a quetzales");
    cantidadD = ingreso.nextFloat();
    System.out.println("Ingrese precio del dolar");
    valorQ = ingreso.nextFloat();
    totalQ = cantidadD * valorQ;
    System.out.println("El total de quetzales es:"+ totalQ);
    }
    else if (decision == 2)
    {
    System.out.println("Convertidor de quetzales a dolares.");
    System.out.println("Ingrese precio del dolar:");
    cantidadD = ingreso.nextFloat();
    System.out.println("ingrese quetzales:");
    cantidadQ = ingreso.nextFloat();    
    total = (cantidadQ/cantidadD);
    System.out.println("la cantidad en dolares es"+ total);
    }
    else
    {
        System.out.println("invalida la opcion");
    }
    }}
