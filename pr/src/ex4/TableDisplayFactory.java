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
public class TableDisplayFactory implements DisplayFactory {
    @Override
    public Displayable createDisplay(List<Account> accounts, int columnWidth) {
        return new TableDisplay(accounts, columnWidth);
    }
}