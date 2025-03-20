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
public class TableDisplay implements Displayable {
    private final List<Account> accounts;
    private final int columnWidth;

    public TableDisplay(List<Account> accounts, int columnWidth) {
        this.accounts = accounts;
        this.columnWidth = columnWidth;
    }

    @Override
    public void showInfo() {
        System.out.println("+".repeat(columnWidth * 2 + 8));
        System.out.printf("| %-" + columnWidth + "s | %-" + columnWidth + "s |\n", "Number", "Operator");
        System.out.println("+".repeat(columnWidth * 2 + 8));

        for (Account account : accounts) {
            System.out.printf("| %-" + columnWidth + "s | %-" + columnWidth + "s |\n",
                    account.getPhoneNumber(), account.getOperator());
        }

        System.out.println("+".repeat(columnWidth * 2 + 8));
    }
}