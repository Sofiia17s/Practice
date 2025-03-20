package ex4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;


/**
 *
 * @author Cinderella
 * @version 1.0
 * @see Main#main
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();

        while (true) {
            System.out.println("Number / 'exit' - exit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            calc.init(input);
        }

        System.out.println("width:");
        int columnWidth = scanner.nextInt();

        calc.show(columnWidth);
        scanner.close();
    }
}