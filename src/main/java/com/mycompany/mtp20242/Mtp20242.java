/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mtp20242;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Mtp20242 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("adicione um número: ");
        int n1 = input.nextInt();
        
        System.out.println("adicione outro número: ");
        int n2 = input.nextInt();
        
        int soma = n1 + n2;
        
        System.out.println("A soma de " + n1 + " e " + n2 + " é: " + soma);

        input.close();

    }
} 