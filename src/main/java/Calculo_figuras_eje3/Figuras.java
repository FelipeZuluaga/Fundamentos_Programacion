/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo_figuras_eje3;

/**
 *
 * @author black
 */
public class Figuras {
    
  
  public float AreaCuadrado(float lado1,float lado2){
  return lado1 * lado2;
  }
  public float AreaTriangulo(float base,float altura){
  return (base * altura)/2;
  }
  public float AreaCirculo(float radio ){
      float potencia = 2;
      float pi = (float) 3.14;
      float elevado = (float) Math.pow(potencia,radio);
      
      float area = elevado * pi;
  return area;
  }
    
}
