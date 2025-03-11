/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;

/**
 *
 * @author Cinderella
 * @version 1.0
 */
public class Item2d implements Serializable {
    
    /** Номер телефону абонента. */
    private String phoneNumber;
    
    /** Назва мобільного оператора. */
    private String operator;

    /** Автоматично згенерована константа */
    private static final long serialVersionUID = 1L;

    /** Ініціалізує поля {@linkplain Item2d#phoneNumber}, {@linkplain Item2d#operator} */
    public Item2d() {
        phoneNumber = "";
        operator = "";
    }

    /** 
     * Встановлює значення полів: номер телефону та оператор.
     * @param phoneNumber - значення для {@linkplain Item2d#phoneNumber}
     * @param operator - значення для {@linkplain Item2d#operator}
     */
    public Item2d(String phoneNumber, String operator) {
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    /** 
     * Встановлення значення поля {@linkplain Item2d#phoneNumber}
     * @param phoneNumber - значення для {@linkplain Item2d#phoneNumber}
     * @return Значення {@linkplain Item2d#phoneNumber}
     */
    public String setPhoneNumber(String phoneNumber) {
        return this.phoneNumber = phoneNumber;
    }

    /** 
     * Отримання значення поля {@linkplain Item2d#phoneNumber}
     * @return Значення {@linkplain Item2d#phoneNumber}
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Встановлення значення поля {@linkplain Item2d#operator}
     * @param operator - значення для {@linkplain Item2d#operator}
     * @return Значення {@linkplain Item2d#operator}
     */
    public String setOperator(String operator) {
        return this.operator = operator;
    }

    /** 
     * Отримання значення поля {@linkplain Item2d#operator}
     * @return значення {@linkplain Item2d#operator}
     */
    public String getOperator() {
        return operator;
    }

    /** 
     * Представляє результат у вигляді рядка.<br>{@inheritDoc} 
     */
    @Override
    public String toString() {
        return "Num: " + phoneNumber + ", operator: " + operator;
    }
}