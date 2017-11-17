package main;

import java.util.Scanner;

public class Paralelogramo {

    Scanner scan = new Scanner(System.in);

    int x1, x2, x3, x4, y1, y2, y3, y4;

    public Paralelogramo(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
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
        int calculo = (int) Math.pow((x4-x1), 2) + (int) Math.pow((y4-y1), 2);
        
        System.out.println(calculo);
        
        float lado2 = (float) Math.sqrt(calculo);
        System.out.println("LADO 2 MIDE: "+lado2);
        
        return lado2;
    }

    public float ladoTres() {
        int calculo = (int) Math.pow((x4-x3), 2) + (int) Math.pow((y4-y3), 2);
        
        System.out.println(calculo);
        
        float lado3 = (float) Math.sqrt(calculo);
        System.out.println("LADO 2 MIDE: "+lado3);
        
        return lado3;
    }

    public float ladoCuatro() {
        int calculo = (int) Math.pow((x2-x3), 2) + (int) Math.pow((y2-y3), 2);
        
        System.out.println(calculo);
        
        float lado4 = (float) Math.sqrt(calculo);
        System.out.println("LADO 2 MIDE: "+lado4);
        
        return lado4;
    }

    public void calculoPerimetro() {
    
    }
    
    public void calculoArea(){
        
    }

}
