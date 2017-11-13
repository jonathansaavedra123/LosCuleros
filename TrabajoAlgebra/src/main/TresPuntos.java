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
    Scanner scan = new  Scanner(System.in);

    public void primerPunto() {
        System.out.println("INGRESE PUNTOS SEPARADOS POR UNA ,");
        System.out.println("INGRESE PUNTO NUMERO 1: ");

        String puntos1 = scan.nextLine();

        String[] vPuntos;
        vPuntos = puntos1.split(",");

        int x1 = Integer.parseInt(vPuntos[0]);
        int y1 = Integer.parseInt(vPuntos[1]);
    }

    public void segundoPunto() {
        System.out.println("INGRESE PUNTO NUMERO 2: ");

        String puntos2 = scan.nextLine();

        String[] vPuntos2;
        vPuntos2 = puntos2.split(",");

        int x2 = Integer.parseInt(vPuntos2[0]);
        int y2 = Integer.parseInt(vPuntos2[1]);
    }

    public void tercerPunto() {
        System.out.println("INGRESE PUNTO NUMERO 3: ");

        String puntos3 = scan.nextLine();

        String[] vPuntos3;
        vPuntos3 = puntos3.split(",");

        int x3 = Integer.parseInt(vPuntos3[0]);
        int y3 = Integer.parseInt(vPuntos3[1]);

    }
}
