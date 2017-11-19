/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Triangulo {

    Scanner scan = new Scanner(System.in);
    int x1, x2, x3, y1, y2, y3;
    
    //LE CAMBIE EL NOMBRE A LA CLASE.. SE LLAMA TRINGULO PORQUE AQUI IRAN LOS CALCULOS Y LAS VALIDACIONES
    public Triangulo(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    //CALCULO DE LADO 1
    public float ladoUno() {
        
        
        int calculo = (int) Math.pow((x2-x1), 2) + (int) Math.pow((y2-y1), 2);
        
        System.out.println(calculo);
        
        float lado1 = (float) Math.sqrt(calculo);
        System.out.println("LADO 1 MIDE: "+lado1);
        
        return lado1;
    }
    //CALCULO DE LADO 2
    public float ladoDos() {
    
        int calculo = (int) Math.pow((x3-x1), 2) + (int) Math.pow((y3-y1), 2);
        
        System.out.println(calculo);
        
        float lado2 = (float) Math.sqrt(calculo);
        System.out.println("LADO 2: "+lado2);
        
        return lado2;
                
    }
    //CALCULO DE LADO 3
    public float ladoTres() {
      
        
        int calculo = (int) Math.pow((x3-x2), 2) + (int) Math.pow((y3-y2), 2);
        
        System.out.println(calculo);
        
        float lado3 = (float) Math.sqrt(calculo);
        System.out.println("LADO 3: "+lado3);
        
        return lado3;
        
    }
    
    public void tipoTriangulo(){
    
        if (ladoUno() == ladoDos() && ladoUno() == ladoTres() && ladoDos() == ladoUno() && ladoDos() == ladoTres() && ladoTres() == ladoDos() && ladoTres() == ladoUno()) {
            System.out.println("Triangulo Equilatero");   
        }else
        {System.out.println("Triangulo Escaleno");}
        
        if (ladoUno() == ladoDos() || ladoUno() == ladoTres() || ladoDos() == ladoUno() || ladoDos() == ladoTres() || ladoTres() == ladoDos() || ladoTres() == ladoUno() ) {
            System.out.println("Triangulo Isósceles");
        }
        
    }
    /**
     * VALIDACION PARA  VER SI ES EQUILATERO ISOSELES O ESCALENO
     * SACAR EL AREA  Y PERIMETRO SEGUN LOS LADOS QUE SAQUE
     * Y MOSTRAR TODOS LOS DATOS
     */

}
