package ex4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Cinderella
 * @version 1.0
 */


public class Calc {
    private static final String FNAME = "Accounts.bin";
    private List<Account> accounts;
    private AccountFactory accountFactory;
    private DisplayFactory displayFactory;

    public Calc() {
        accounts = new ArrayList<>();
        accountFactory = new AccountFactoryImpl();
        displayFactory = new TableDisplayFactory();
    }

    public void init(String phoneNumber) {
        accounts.add(accountFactory.createAccount(phoneNumber));
    }

    public void show(int columnWidth) {
        Displayable display = displayFactory.createDisplay(accounts, columnWidth);
        display.showInfo();
    }

    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(accounts);
        os.flush();
        os.close();
    }

    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        accounts = (List<Account>) is.readObject();
        is.close();
    }
}