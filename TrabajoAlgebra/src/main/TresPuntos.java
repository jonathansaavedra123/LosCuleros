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
public class TresPuntos {

    Scanner scan = new Scanner(System.in);
    int x1, x2, x3, y1, y2, y3;

    public TresPuntos(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    
    public float ladoUno() {
        System.out.println("RAIZ DE (X2-X1)al cruadrado + (Y2-Y1)al cuadrado");
        
        int calculo = (int) Math.pow((x2-x1), 2) + (int) Math.pow((y2-y1), 2);
        
        System.out.println(calculo);
        
        float lado1 = (float) Math.sqrt(calculo);
        System.out.println("LADO 1 MIDE: "+lado1);
        
        return lado1;
    }

    public float ladoDos() {
        System.out.println("RAIZ DE (X3-X1)al cruadrado + (Y3-Y1)al cuadrado");
        
        int calculo = (int) Math.pow((x3-x1), 2) + (int) Math.pow((y3-y1), 2);
        
        System.out.println(calculo);
        
        float lado2 = (float) Math.sqrt(calculo);
        System.out.println("LADO 2: "+lado2);
        
        return lado2;
                
    }

    public float ladoTres() {
        System.out.println("RAIZ DE (X3-X1)al cruadrado + (Y3-Y1)al cuadrado");
        
        int calculo = (int) Math.pow((x3-x2), 2) + (int) Math.pow((y3-y2), 2);
        
        System.out.println(calculo);
        
        float lado3 = (float) Math.sqrt(calculo);
        System.out.println("LADO 3: "+lado3);
        
        return lado3;
        
    }

}
