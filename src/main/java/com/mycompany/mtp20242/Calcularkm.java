/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mtp20242;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Calcularkm {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a kilometragem percorrida: ");
        double kmPer = input.nextDouble();
        
        System.out.println("Digite a quantos litros de gasolina: ");
        double gasUs = input.nextDouble();
        
        double kmLit = kmPer / gasUs;
        
        System.out.printf("O consumo foi de %.2f km/l\n", kmLit);
        
        input.close();
    }
}
