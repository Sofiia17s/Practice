/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author Cinderella
 * @version 1.0
 * @see Main#main
 */
public class Main {

    /** Об'єкт класу {@linkplain Calc}. */
    private Calc calc = new Calc();

    /** Виводить меню. */
    private void menu() {
        String s = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Enter command...");
            System.out.print("'q' - quit, 'v' - view, 'e' - enter, 's' - save, 'r' - restore: ");
            try {
                s = in.readLine();
            } catch (IOException e) {
                System.out.println("Error: " + e);
                System.exit(0);
            }
            switch (s.charAt(0)) {
                case 'q':
                    System.out.println("Exit.");
                    break;
                case 'v':
                    System.out.println("View current:");
                    calc.show();
                    break;
                case 'e':
                    System.out.print("Enter: ");
                    try {
                        String phoneNumber = in.readLine();
                        calc.init(phoneNumber);
                        calc.show();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    break;
                case 's':
                    System.out.println("Save.");
                    try {
                        calc.save();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    break;
                case 'r':
                    System.out.println("Restore.");
                    try {
                        calc.restore();
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    calc.show();
                    break;
                default:
                    System.out.println("Try again.");
            }
        } while (s.charAt(0) != 'q');
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}

