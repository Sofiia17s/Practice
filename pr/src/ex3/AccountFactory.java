package ex3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cinderella
 */
public interface AccountFactory {
    /**
     * Фабричний метод для створення об'єкта рахунку.
     * @param type тип мобільного оператора
     * @return створений об'єкт {@linkplain Account}
     */
    Account createAccount(String type);
}