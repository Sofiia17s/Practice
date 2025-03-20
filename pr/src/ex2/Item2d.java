/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;

/**
 *
 * @author Cinderella
 */

public class Item2d implements Serializable {
    /** Номер телефону. */
    private String phoneNumber;
    /** Назва мобільного оператора. */
    private String operator;
    /** Серіалізація */
    private static final long serialVersionUID = 1L;

    /** Конструктор за замовчуванням. */
    public Item2d() {
        this.phoneNumber = "";
        this.operator = "Unknown";
    }

    /** Ініціалізує номер та оператора.
     * @param phoneNumber - номер телефону
     * @param operator - мобільний оператор
     */
    public Item2d(String phoneNumber, String operator) {
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    /** Встановлює номер телефону.
     * @param phoneNumber - новий номер
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** Отримує номер телефону.
     * @return номер телефону
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** Встановлює оператора.
     * @param operator - назва оператора
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /** Отримує назву оператора.
     * @return мобільний оператор
     */
    public String getOperator() {
        return operator;
    }

    /** Повертає рядкове представлення об'єкта. */
    @Override
    public String toString() {
        return "Phone Number: " + phoneNumber + ", Operator: " + operator;
    }
}