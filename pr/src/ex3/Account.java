package ex3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cinderella
 */

public abstract class Account implements Displayable {
    /** Відображає інформацію про об'єкт. */
    @Override
    public abstract void showInfo();
}

/** 
 * Клас рахунку для Vodafone.
 */
class VodafoneAccount extends Account {
    @Override
    public void showInfo() {
        System.out.println("Vodafone");
    }
}

/** 
 * Клас рахунку для Kyivstar.
 */
class KyivstarAccount extends Account {
    @Override
    public void showInfo() {
        System.out.println("Kyivstar");
    }
}

/** 
 * Клас рахунку для Lifecell.
 */
class LifecellAccount extends Account {
    @Override
    public void showInfo() {
        System.out.println("Lifecell");
    }
}

/** 
 * Клас рахунку для невідомого оператора.
 */
class UnknownOperatorAccount extends Account {
    @Override
    public void showInfo() {
        System.out.println("Unknow operator.");
    }
}