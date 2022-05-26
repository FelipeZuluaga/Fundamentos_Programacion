/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos_y_funciones_Eje2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author black
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner es = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre =  es.nextLine();
        
        System.out.println("Tipo de Documento:"); 
        String tp =  es.nextLine();
        
        System.out.println("N.° de documento: ");
        int nd = es.nextInt();
        
        
        System.out.println("Edad: ");
        int edad = es.nextInt();
        
        System.out.println("Sexo: ");
        String sexo = es.next();
        
        System.out.println("Peso: ");
        double peso = es.nextDouble();
        
        System.out.println("Altura: ");
        double altura = es.nextDouble();
        
            
       if(edad == 18 || edad > 18){
            float IMC = (float) (peso / (altura * altura));
            
            System.out.println("El " + nombre + "con el tipo de documento " + tp + "y numero de ciudadania " + nd + " y de sexo "+sexo+"");
            System.out.println(" es mayor de edad");
            System.out.println("El IMC de usted es:  "+ IMC);  
       } 
       else{
           System.out.println("El " + nombre + "con el tipo de documento " + tp + "y numero de ciudadania " + nd + " y de sexo "+sexo+"");
           float IMC = (float) (peso / (altura * altura));
           System.out.println("usted "+nombre+ "es menor de edad");
           System.out.println("El IMC de usted es:  "+ IMC);
       } 
    }
    //El Otro Scenario esenario 
    
            //Cambiarle escritura Y atributos 
    //if(edad < 18){
        //System.out.println(" es menor de edad");
        //System.out.println("El IMC de usted es:  "+ IMC);  
    
    //}
    //else if(edad == 18){
            //System.out.println(" es mayor de edad");
            //System.out.println("El IMC de usted es:  "+ IMC);
    //else if(edad > 18 ){
            //System.out.println("es mayor de edad");
            //System.out.println("El IMC de usted es:  "+ IMC);
    //}
    //else{
        ////System.out.println("Algo esta fallando en el Sistema");
    //}
        
        
}
