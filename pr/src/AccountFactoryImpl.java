/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cinderella
 */
public class AccountFactoryImpl implements AccountFactory {
    /**
     * Реалізація фабричного методу для створення об'єкта {@linkplain Account}.
     * @param type тип мобільного оператора
     * @return створений об'єкт {@linkplain Account}
     */
    @Override
    public Account createAccount(String type) {
        if (type.equals("Vodafone")) {
            return new VodafoneAccount();
        } else if (type.equals("Kyivstar")) {
            return new KyivstarAccount();
        } else if (type.equals("Lifecell")) {
            return new LifecellAccount();
        } else {
            return new UnknownOperatorAccount();
        }
    }
}
