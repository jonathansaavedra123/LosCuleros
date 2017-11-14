
package main;

import java.util.Scanner;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("BIENVEENIDO AL SISTEMA DE FIGURAS GEOMETRICAS");
        System.out.println("CUANTOS PUNTOS DESEA INGRESAR: (OP 1.- 3 PUNTOS OP 2.- 4 PUNTOS)");
        int opcion = 0;
        while(true){
            try {
                System.out.print("INGRESE OPCION: ");
                opcion = Integer.parseInt(scan.nextLine());
                
                break;
        
            } catch (Exception e) {
                System.out.println("NUMERO INGRESADO NO VALIDO");
            }
        }
        
        if(opcion == 1){
            System.out.println("INGRESE PUNTOS SEPARADOS POR UNA ,");
            
            //INGRESO DEL PUNTO 1
            System.out.println("INGRESE PUNTO NUMERO 1: ");
            String puntos1 = scan.nextLine();

            String[] vPuntos;
            vPuntos = puntos1.split(",");
        
            int x1 = Integer.parseInt(vPuntos[0]);
            int y1 = Integer.parseInt(vPuntos[1]);
            
            //INGRESO DEL PUNTO 2
            System.out.println("INGRESE PUNTO NUMERO 2: ");
            
            String puntos2 = scan.nextLine();

            String[] vPuntos2;
            vPuntos2 = puntos2.split(",");
        
            int x2 = Integer.parseInt(vPuntos2[0]);
            int y2 = Integer.parseInt(vPuntos2[1]);
            
            //INGRESO DEL PUNTO 3
            System.out.println("INGRESE PUNTO NUMERO 3: ");
            
            String puntos3 = scan.nextLine();

            String[] vPuntos3;
            vPuntos3 = puntos3.split(",");
        
            int x3 = Integer.parseInt(vPuntos3[0]);
            int y3 = Integer.parseInt(vPuntos3[1]);
            
            
            // creacion del objeto triangulo
            Triangulo t = new Triangulo(x1, x2, x3, y1, y2, y3);
            //metodo para sacar el lado 1
            t.ladoUno();
            //metodo para sacar el lado 2
            t.ladoDos();
            //metodo para sacar el lado 3
            t.ladoTres();
            
            
        }
    }
    
}
