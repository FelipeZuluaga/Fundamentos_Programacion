/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Operadores_relacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner es = new Scanner(System.in);
        
        System.out.println("intruducta su edad:"); 
        int edad =  es.nextInt();
        
        if(edad == 18){
            System.out.println("El es mayor de edad");
        }
        else if(edad <= 18){
            System.out.println("El es menor que de edad");
        }
        else if (edad >= 18){
            System.out.println("El es mayor de edad");
        }
        else if (edad != 18){
            System.out.println("El es mayor de edad");
        }
    }
    
}
