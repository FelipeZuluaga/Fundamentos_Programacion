/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial_eje5;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner es = new Scanner(System.in);
        
        System.out.println("intruducta un numero:"); 
        int n=  es.nextInt();
        
        //mostrar Resultado 
        
        System.out.println("El factorial de:  "  + n +  " es: " + factorial(n));
    }
    public static double factorial(int num){
        double bandera = 1;
        for(int i = 2; i <= num; i++){
          bandera *=i;
        }
        return bandera;
    }
}
