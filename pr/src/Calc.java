/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Cinderella
 * @version 1.0
 */
public class Calc {
    /** Ім'я файлу, що використовується при серіалізації. */
    private static final String FNAME = "Item2d.bin";
    
    /** Зберігає результат обчислень. Об'єкт класу {@linkplain Item2d} */
    private Item2d result;
    
    /** Ініціалізує {@linkplain Calc#result} */
    public Calc() {
        result = new Item2d();
    }

    /** 
     * Встановити значення {@linkplain Calc#result}
     * @param result - нове значення посилання на об'єкт {@linkplain Item2d}
     */
    public void setResult(Item2d result) {
        this.result = result;
    }

    /** 
     * Отримати значення {@linkplain Calc#result}
     * @return поточне значення посилання на об'єкт {@linkplain Item2d}
     */
    public Item2d getResult() {
        return result;
    }

    /** 
     * Обчислює значення функції.
     * @param x - аргумент обчислюваної функції.
     * @return результат обчислення функції.
     */
    private double calc(double x) {
        return Math.sin(x * Math.PI / 180); // Перетворення градусів в радіани
    }

    /** 
     * Обчислює значення функції та зберігає
     * результат в об'єкті {@linkplain Calc#result}
     * @param x - аргумент обчислюваної функції.
     */
    public double init(double x) {
        result.setX(x);
        return result.setY(calc(x));
    }

    /** Виводить результат обчислень. */
    public void show() {
        System.out.println(result);
    }

    /** 
     * Зберігає {@linkplain Calc#result} в файл {@linkplain Calc#FNAME}
     * @throws IOException
     */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    /** 
     * Відновлює {@linkplain Calc#result} з файлу {@linkplain Calc#FNAME}
     * @throws Exception
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item2d) is.readObject();
        is.close();
    }
}