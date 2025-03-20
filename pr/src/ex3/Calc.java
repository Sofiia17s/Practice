package ex3;

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
    /** Ім'я файлу, що використовується при серіалізації. */
    private static final String FNAME = "Item2dList.bin";

    /** Колекція результатів визначення оператора. */
    private List<Displayable> results;

    /** Фабрика для створення об'єктів Account. */
    private AccountFactory accountFactory;

    /** Ініціалізує колекцію {@linkplain Calc#results} та фабрику {@linkplain Calc#accountFactory}. */
    public Calc() {
        results = new ArrayList<>();
        accountFactory = new AccountFactoryImpl();
    }

    /** 
     * Отримати список результатів.
     * @return колекція об'єктів {@linkplain Displayable}
     */
    public List<Displayable> getResults() {
        return results;
    }

    /** 
     * Визначає мобільного оператора за номером телефону.
     * @param phoneNumber - номер телефону абонента.
     * @return назва мобільного оператора.
     */
    private String determineOperator(String phoneNumber) {
        if (phoneNumber.matches("^\\+?380(50|66|95|99)\\d{7}$")) {
            return "Vodafone";
        } else if (phoneNumber.matches("^\\+?380(67|68|96|97|98)\\d{7}$")) {
            return "Kyivstar";
        } else if (phoneNumber.matches("^\\+?380(63|73|93)\\d{7}$")) {
            return "Lifecell";
        } else {
            return "Unknow operator";
        }
    }

    /** 
     * Визначає мобільного оператора та додає результат до колекції.
     * @param phoneNumber - номер телефону абонента.
     */
    public void init(String phoneNumber) {
        String operator = determineOperator(phoneNumber);
        results.add(new Item2d(operator));
    }

    /** Виводить всі збережені результати визначення оператора. */
    public void show() {
        if (results.isEmpty()) {
            System.out.println("Nothing.");
        } else {
            for (Displayable item : results) {
                item.showInfo();
            }
        }
    }

    /** 
     * Зберігає колекцію {@linkplain Calc#results} у файл {@linkplain Calc#FNAME}.
     * @throws IOException
     */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(results);
        os.flush();
        os.close();
    }

    /** 
     * Відновлює колекцію {@linkplain Calc#results} з файлу {@linkplain Calc#FNAME}.
     * @throws Exception
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        results = (List<Displayable>) is.readObject();
        is.close();
    }
}