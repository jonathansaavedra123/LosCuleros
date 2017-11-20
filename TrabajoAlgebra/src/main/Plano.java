/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Plano {
    private String[][] plano = new String[10][10];
    
    public Plano() {
    }
    
        
    public void mostrarPlano(){
        for (int i = 0; i < plano.length; i++) {
            System.out.print(i);
            for (int j = 0; j < plano[i].length; j++) {
                System.out.println();
            }
        }
        
        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[i].length; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
    

    
}
