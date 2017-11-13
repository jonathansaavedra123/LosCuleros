
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
            System.out.println("INGRESE PUNTO NUMERO 1: ");
            
            String puntos1 = scan.nextLine();

            String[] vPuntos;
            vPuntos = puntos1.split(",");
        
            int x1 = Integer.parseInt(vPuntos[0]);
            int y1 = Integer.parseInt(vPuntos[1]);
            
            System.out.println("INGRESE PUNTO NUMERO 2: ");
            
            
            String puntos2 = scan.nextLine();

            String[] vPuntos2;
            vPuntos2 = puntos1.split(",");
        
            int x2 = Integer.parseInt(vPuntos[0]);
            int y2 = Integer.parseInt(vPuntos[1]);
            
            System.out.println("INGRESE PUNTO NUMERO 3: ");
            
            
            String puntos3 = scan.nextLine();

            String[] vPuntos3;
            vPuntos3 = puntos1.split(",");
        
            int x3 = Integer.parseInt(vPuntos[0]);
            int y3 = Integer.parseInt(vPuntos[1]);
            
            
            
            
        }
    }
    
}
