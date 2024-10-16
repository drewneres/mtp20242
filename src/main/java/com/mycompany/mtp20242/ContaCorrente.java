package com.mycompany.mtp20242;

import java.util.Scanner;

public class ContaCorrente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        int numConta = input.nextInt();     
        
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = input.nextDouble();      
        
        System.out.print("Digite o total de crédito autorizado: ");
        double totalCredito = input.nextDouble();      
        
        System.out.print("Digite o total dos itens comprados: ");
        double totalCompras = input.nextDouble();      

        System.out.print("Digite o limite que foi autorizado: ");
        double limiteAutorizado = input.nextDouble();      
        
        double novoSaldo = saldoInicial + totalCredito - totalCompras;
        
        System.out.println("Número da conta: " + numConta);
        System.out.printf("Saldo atual: %.2f%n", novoSaldo);
        
        if (novoSaldo < -limiteAutorizado) {
            System.out.println("Limite excedido!");
        }       
        input.close();
    }
}
