
package main;

import java.util.Scanner;

public class Cuatro_Puntos {
    Scanner scan = new Scanner(System.in);
    
    int X1, X2, X3, X4,Y1, Y2, Y3, Y4;
     
    
    
    public void primerPunto(){
        System.out.println("ingrese puntos separado por una coma");
        System.out.print("ingrese primer punto");
        
        String lado1 = scan.nextLine();
        
        String[] vLados;
        vLados = lado1.split(",");
        
        X1 = Integer.parseInt(vLados[0]);
        Y1 = Integer.parseInt(vLados[1]);
    }
    
     public void segundoPunto(){
        System.out.println("ingrese puntos separado por una coma");
        System.out.print("ingrese primer punto");
        
        String lado2 = scan.nextLine();
        
        String[] vLados;
        vLados = lado2.split(",");
        
        X2 = Integer.parseInt(vLados[0]);
        Y2 = Integer.parseInt(vLados[1]);
    }
     
      public void tercerPunto(){
        System.out.println("ingrese puntos separado por una coma");
        System.out.print("ingrese primer punto");
        
        String lado3 = scan.nextLine();
        
        String[] vLados;
        vLados = lado3.split(",");
        
        X3 = Integer.parseInt(vLados[0]);
        Y3 = Integer.parseInt(vLados[1]);
    }
      
       public void cuartoPunto(){
        System.out.println("ingrese puntos separado por una coma");
        System.out.print("ingrese primer punto");
        
        String lado4 = scan.nextLine();
        
        String[] vLados;
        vLados = lado4.split(",");
        
        X4 = Integer.parseInt(vLados[0]);
        Y4 = Integer.parseInt(vLados[1]);
    }
       public void mostrarValores(){
           System.out.println(X1 + "" + X2 + "" + X3 + "" + Y4);
           System.out.println(Y1 + "" + Y2 + "" + Y3 + "" + Y4);
           
           
       }
       
       public void calculoArea (){
           int 
           
       }
    
    
    
    
}
