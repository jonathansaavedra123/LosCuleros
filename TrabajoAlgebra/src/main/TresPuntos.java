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

    public void primerPunto() {
        System.out.println("INGRESE PUNTOS SEPARADOS POR UNA ,");
        System.out.println("INGRESE PUNTO NUMERO 1: ");

        String puntos1 = scan.nextLine();

        String[] vPuntos;
        vPuntos = puntos1.split(",");

        x1 = Integer.parseInt(vPuntos[0]);
        y1 = Integer.parseInt(vPuntos[1]);
    }

    public void segundoPunto() {
        System.out.println("INGRESE PUNTO NUMERO 2: ");

        String puntos2 = scan.nextLine();

        String[] vPuntos2;
        vPuntos2 = puntos2.split(",");

        x2 = Integer.parseInt(vPuntos2[0]);
        y2 = Integer.parseInt(vPuntos2[1]);
    }

    public void tercerPunto() {
        System.out.println("INGRESE PUNTO NUMERO 3: ");

        String puntos3 = scan.nextLine();

        String[] vPuntos3;
        vPuntos3 = puntos3.split(",");

        x3 = Integer.parseInt(vPuntos3[0]);
        y3 = Integer.parseInt(vPuntos3[1]);

    }

    public void mostrarValores() {
        System.out.println(x1 + "" + x2 + "" + x3);
        System.out.println(y1 + "" + y2 + "" + y3);
    }

    public void calcularLargo() {
        int largoAB = (x2 - x1);
        int largoAB2 = (y2 - y1);
        largoAB = (int) Math.pow(largoAB, 2);
        largoAB2 = (int) Math.pow(largoAB2, 2);
        int sumaxy = largoAB + largoAB2;
       
        float resultado1 = (float) Math.sqrt(sumaxy);
        
        System.out.println(resultado1);

    }
}
