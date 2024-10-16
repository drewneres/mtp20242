/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mtp20242;

/**
 *
 * @author Administrador
 */
public class CalcularFatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        for (int i = 1; i <= 20; i++) {
        long fatorial = calcularF(i);
        System.out.println(i + "! = " + fatorial);
    }
}  
    public static long calcularF(int n) {
         long fatorial = 1;
         
         for (int i = 1; i <= n ; i++){
             fatorial *= i;
    }
         return fatorial;
    }
}
