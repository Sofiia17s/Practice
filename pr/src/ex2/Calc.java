/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cinderella
 */

public class Calc {
    /** Ім'я файлу для серіалізації. */
    private static final String FNAME = "Item2d.bin";
    /** Зберігає інформацію про номер телефону та оператора. */
    private Item2d result;
    /** База кодів операторів. */
    private static final Map<String, String> operatorMap = new HashMap<>();

    static {
        operatorMap.put("067", "Kyivstar");
        operatorMap.put("068", "Kyivstar");
        operatorMap.put("096", "Kyivstar");
        operatorMap.put("097", "Kyivstar");
        operatorMap.put("098", "Kyivstar");
        operatorMap.put("050", "Vodafone");
        operatorMap.put("066", "Vodafone");
        operatorMap.put("095", "Vodafone");
        operatorMap.put("099", "Vodafone");
        operatorMap.put("063", "Lifecell");
        operatorMap.put("073", "Lifecell");
        operatorMap.put("093", "Lifecell");
    }

    /** Ініціалізує об'єкт Item2d. */
    public Calc() {
        result = new Item2d();
    }

    /** Визначає оператора за номером телефону.
     * @param phoneNumber - номер телефону
     * @return Назва мобільного оператора
     */
    private String detectOperator(String phoneNumber) {
        if (phoneNumber.length() < 10) {
            return "Invalid number";
        }
        String prefix = phoneNumber.substring(0, 3);
        return operatorMap.getOrDefault(prefix, "Unknown Operator");
    }

    /** Ініціалізує результат і визначає оператора.
     * @param phoneNumber - номер телефону
     */
    public void init(String phoneNumber) {
        result.setPhoneNumber(phoneNumber);
        result.setOperator(detectOperator(phoneNumber));
    }

    /** Виводить результат. */
    public void show() {
        System.out.println(result);
    }

    /** Зберігає {@linkplain Calc#result} у файлі. */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    /** Відновлює {@linkplain Calc#result} з файлу. */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item2d) is.readObject();
        is.close();
    }
}