package application;


import entities.Theater;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Theater theater = new Theater();

        int option = 0;

        System.out.println("---- BEM-VINDO AO CINE JAVA!! ----");

        do {
            System.out.println("\n  MAPA ATUAL OS ASSENTOS");
            System.out.println();
            theater.displayMap();

            System.out.println("\n1. RESERVAR ASSENTO");
            System.out.println("2. SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.print("Digite a linha (0 a 4): ");
                int row = sc.nextInt();
                System.out.print("Digite a coluna (0 a 7): ");
                int col = sc.nextInt();

                theater.reserve(row, col);
            }
        } while (option != 2);

        System.out.println("Sistema encerrado, bom filme!");


    }
}