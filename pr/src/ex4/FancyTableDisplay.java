package ex4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;

/**
 *
 * @author Cinderella
 */
public class FancyTableDisplay extends TableDisplay {
    public FancyTableDisplay(List<Account> accounts, int columnWidth) {
        super(accounts, columnWidth);
    }

    @Override
    public void showInfo() {
        System.out.println("=====================================");
        System.out.println(" Розширене відображення акаунтів ");
        System.out.println("=====================================");
        super.showInfo();  // Виклик методу з батьківського класу
        System.out.println("=====================================");
    }
}