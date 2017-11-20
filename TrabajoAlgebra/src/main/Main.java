package main;

import java.util.Scanner;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("============================================");

        System.out.println("BIENVENIDO AL SISTEMA DE FIGURAS GEOMETRICAS");
        System.err.println("============================================");

        System.out.println("CUANTOS PUNTOS DESEA INGRESAR: (OP 1.- 3 PUNTOS OP 2.- 4 PUNTOS)");
        int opcion = 0;
        while (true) {
            try {
               
                System.out.print("INGRESE OPCION: ");
                System.err.println("=============================");
                
                opcion = Integer.parseInt(scan.nextLine());

                break;

            } catch (Exception e) {
                System.err.println("=============================");
                System.out.println("NUMERO INGRESADO NO VALIDO");
                System.err.println("=============================");
            }
        }

        switch (opcion) {
            case 1:
                
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
                t.tipoTriangulo();
                
                break;
                
            case 2:
                
                System.out.println("INGRESE PUNTOS SEPARADOS POR UNA ,");

                //INGRESO DEL PUNTO 1
                System.out.println("INGRESE PUNTO NUMERO 1: ");
                String punto1 = scan.nextLine();

                String[] vPuntosParalelogramo;
                vPuntosParalelogramo = punto1.split(",");

                int xP1 = Integer.parseInt(vPuntosParalelogramo[0]);
                int yP1 = Integer.parseInt(vPuntosParalelogramo[1]);

                //INGRESO DEL PUNTO 2
                System.out.println("INGRESE PUNTO NUMERO 2: ");

                String punto2 = scan.nextLine();

                String[] vPuntosParalelogramo2;
                vPuntosParalelogramo2 = punto2.split(",");

                int xP2 = Integer.parseInt(vPuntosParalelogramo2[0]);
                int yP2 = Integer.parseInt(vPuntosParalelogramo2[1]);

                //INGRESO DEL PUNTO 3
                System.out.println("INGRESE PUNTO NUMERO 3: ");

                String punto3 = scan.nextLine();

                String[] vPuntosParalelogramo3;
                vPuntosParalelogramo3 = punto3.split(",");

                int xP3 = Integer.parseInt(vPuntosParalelogramo3[0]);
                int yP3 = Integer.parseInt(vPuntosParalelogramo3[1]);
                
                //INGRESO DEL PUNTO 4
                System.out.println("INGRESE PUNTO NUMERO 4: ");

                String punto4 = scan.nextLine();

                String[] vPuntosParalelogramo4;
                vPuntosParalelogramo4 = punto4.split(",");

                int xP4 = Integer.parseInt(vPuntosParalelogramo4[0]);
                int yP4 = Integer.parseInt(vPuntosParalelogramo4[1]);
                
                //CREACION DEL PALALELOGRAMO
                Paralelogramo p = new Paralelogramo(xP1,xP2,xP3,xP4,yP1,yP2,yP3,yP4);
                
                //metodo para el lado 1
                p.ladoUno();
                //metodo para el lado 2
                p.ladoDos();
                //metodo para lado 3
                p.ladoTres();
                //metodo para lado 4
                p.ladoCuatro();
                
                //comparacion de lados
                p.comparacionLados();
                
                
            case 3:
                System.err.println("==============================");
                System.out.println(" GRACIAS POR USAR EL PROGRAMA ");
                System.err.println("==============================");
                break;
            default:
                System.err.println("==============================");
                System.err.println("numero mayor al permitido");
                System.err.println("vuelva a ejecutar el programa");
                System.err.println("==============================");

    }

}
}
