package ex3;

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

public class Item2d implements Displayable, Serializable {
    private static final long serialVersionUID = 1L;

    /** Назва мобільного оператора */
    private String operator;

    /** 
     * Конструктор за замовчуванням.
     */
    public Item2d() {
        this.operator = "Unknow operator";
    }

    /** 
     * Конструктор з параметром.
     * @param operator - назва мобільного оператора
     */
    public Item2d(String operator) {
        this.operator = operator;
    }

    /** 
     * Отримати назву оператора.
     * @return оператор
     */
    public String getOperator() {
        return operator;
    }

    /** 
     * Встановити назву оператора.
     * @param operator - нова назва оператора
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /** 
     * Відображає інформацію про мобільного оператора.
     */
    @Override
    public void showInfo() {
        System.out.println("Operator: " + operator);
    }

    @Override
    public String toString() {
        return "Item2d{operator='" + operator + "'}";
    }
}