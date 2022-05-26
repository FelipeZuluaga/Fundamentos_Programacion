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
public class Operador_logico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner es = new Scanner(System.in);
        
        System.out.println("intruducta su codigo"); 
        int nb =  es.nextInt();
        
        System.out.println("intruducta su cedula:"); 
        int cd =  es.nextInt();
        
        
        
        if(nb == 1236598 && cd == 1234566 ){
            System.out.println("El nombre y la cedula son correctos y conciden");
        }
        else if (nb != nb || cd == cd){
            System.out.println("incorrecto no conciden");
        }
    }
    
}
