package ex4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cinderella
 */

public class Account implements Displayable {
    private String phoneNumber;
    private String operator;

    /**
     * Конструктор для створення облікового запису.
     * @param phoneNumber номер телефону абонента
     * @param operator назва мобільного оператора
     */
    public Account(String phoneNumber, String operator) {
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public void showInfo() {
        System.out.println("num: " + phoneNumber + " | Оператор: " + operator);
    }

    @Override
    public String toString() {
        return "Account{num='" + phoneNumber + "', Operator='" + operator + "'}";
    }
}