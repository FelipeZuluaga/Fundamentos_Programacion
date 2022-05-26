/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo_figuras_eje3;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 =1 ;
        int num2 = 2;
        int num3 = 3;
        
        System.out.println("************* Menu *************");
        System.out.println("Figura:");
        System.out.println(num1 + ".Circulo");
        System.out.println(num2 + ".Triangulo");
        System.out.println(num3 + ".Cuadrado");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("escoge una figura:");
        int fig = entrada.nextInt();
        
        Figuras f = new Figuras();
        
        if(num3 == fig){
            System.out.println("Para incontrar el area de un Cuadrado");
            
            System.out.println("Escriba el lado numero 1:");
            float lado1 = entrada.nextFloat();
            
            System.out.println("Escriba el lado numero 2:");
            float lado2 = entrada.nextFloat();        
                    
            System.out.println("El Area del cuadrado es: " + f.AreaCuadrado(lado1, lado2));
            
        }else if(num2 == fig){
            System.out.println("Para incontrar el area de un Triangulo ");
            
            System.out.println("Escriba el Base del Triangulo: ");
            float base = entrada.nextFloat();
            
            System.out.println("Escriba la altura del Triangulo: ");
            float altura = entrada.nextFloat();        
                    
            System.out.println("El Area del Triangulo es: " + f.AreaTriangulo(base, altura));
            
        }else if(num1 == fig){
            System.out.println("Para incontrar el area de un circulo ");
            
            System.out.println("Escriba el Radio del Circulo: ");
            float radio = entrada.nextFloat();   
            
            System.out.println("El Area del Circulo es: " +f.AreaCirculo(radio) );
        }
        else{
            System.out.println("Se salio Vuelva pronto");
        }
            
        
        }
         
    //Se puede hacer con el metodo swich del mismo que se uso en el ejercio 4
}
