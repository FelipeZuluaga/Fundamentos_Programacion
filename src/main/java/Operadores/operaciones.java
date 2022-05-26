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
public class operaciones {
  
    
    public int suma() {

        Scanner es = new Scanner(System.in);

        // Ejercicio de suma 
        System.out.println("intruducta el primer numero:");
        int num1 = es.nextInt();
        System.out.println("intruducta el segundo numero:");
        int num2 = es.nextInt();
        int suma = num1 + num2; 
        return suma;    
    }
    public int resta() {
           
        Scanner es = new Scanner(System.in);

        // Ejercicio de Resta 
        System.out.println("intruducta el primer numero:");
        int num1 = es.nextInt();
        System.out.println("intruducta el segundo numero:");
        int num2 = es.nextInt();
        int resta = num1 - num2; 
        return resta;    
    }
    
    public int aumenta(){
        
        int x = 5;
        
        x++;
        
        return x;
    }
    public int disminuye(){
        
     
        int x = 5;
        
        x--;
        
        return x;
    }
    public int aut(){
              
        int x = 5;
        
        x += 8;
        return x;
    }
    public int dis(){
        
        int x = 8;
        
        x -= 5;
        return x;
    }
    public int mul(){
        int x = 8;
        
        x *= 5;
        return x;
    }
    public int div(){   
        int x = 8;
        
        x /= 5;
        return x;
    }
    public int Res(){   
        int x = 8;
        
        x %= 5;
        return x;
    }
}   
