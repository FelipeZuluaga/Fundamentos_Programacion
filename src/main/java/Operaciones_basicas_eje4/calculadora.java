/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones_basicas_eje4;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba el lado numero 1:");
        int n1 = entrada.nextInt();

        System.out.println("Escriba el lado numero 2:");
        int n2 = entrada.nextInt();

        Scanner en = new Scanner(System.in);
        System.out.println("escriba la operacion que quiere hacer: ");
        String ops = en.nextLine();

        operaciones op = new operaciones();
        
        switch (ops) {

            case "+":
                System.out.println("la suma es: " + op.suma(n1, n2));
                break;
            case "-":
                System.out.println("la resta es: " + op.resta(n1, n2));
                break;
            case "*":
                System.out.println("la multiplicación es: " + op.multip(n1, n2));
                break;
            case "/":
                System.out.println("la divicion es: " + op.div(n1, n2));
                break;
        }

    }
    

    //public static int suma(int num1, int num2) {
    //    int suma = num1 + num2;
    //    return suma;
    //}
    //public static int resta(int num1, int num2) {

    //    int resta = num1 - num2;
    //    return resta;
    //}

    //public static int multip(int num1, int num2) {
    //    int multip = num1 * num2;
    //    return multip;
    //}

    //public static double div(double num1, double num2) {
    //    double div = num1 / num2;
    //    return div;
    //}

}
