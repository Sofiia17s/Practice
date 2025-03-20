/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cinderella
 */

public class Main {
    /** Об'єкт класу {@linkplain Calc}. */
    private Calc calc = new Calc();

    /** Відображає меню. */
    private void menu() {
        String s = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        do {
            do {
                System.out.println("Enter command...");
                System.out.print("'q'uit, 'v'iew, 'e'nter number, 's'ave, 'r'estore: ");
                try {
                    s = in.readLine();
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
            } while (s.length() != 1);

            switch (s.charAt(0)) {
                case 'q':
                    System.out.println("Exit.");
                    break;
                case 'v':
                    System.out.println("View current result.");
                    calc.show();
                    break;
                case 'e':
                    System.out.print("Enter phone number: ");
                    try {
                        String phoneNumber = in.readLine();
                        calc.init(phoneNumber);
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    calc.show();
                    break;
                case 's':
                    System.out.println("Save current result.");
                    try {
                        calc.save();
                    } catch (IOException e) {
                        System.out.println("Serialization error: " + e);
                    }
                    break;
                case 'r':
                    System.out.println("Restore last saved result.");
                    try {
                        calc.restore();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    calc.show();
                    break;
                default:
                    System.out.println("Wrong command.");
            }
        } while (s.charAt(0) != 'q');
    }

    /** Точка входу у програму. */
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
