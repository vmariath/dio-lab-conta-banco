package edu.vmariath.lab;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor insira o número da agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Por favor insira o número da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Insira o seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome +", obrigado por criar uma conta conosco, a sua agência é "+ agencia + ", conta nº " + conta + ", e seu saldo é de: R$ "+ saldo + " e já se encontra disponível para saque.");


    }
}




