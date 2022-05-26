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
public class operaciones {

    public int suma(int num1, int num2) {
        Scanner es = new Scanner(System.in);

        int suma = num1 + num2;
        return suma;
    }

    public int resta(int num1, int num2) {

        int resta = num1 - num2;
        return resta;
    }

    public int multip(int num1, int num2) {

        int multip = num1 * num2;
        return multip;
    }

    public double div(double num1, double num2) {

        double div = num1 / num2;
        return div;
    }

}
