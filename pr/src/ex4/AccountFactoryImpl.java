package ex4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cinderella
 */
public class AccountFactoryImpl implements AccountFactory {
    @Override
    public Account createAccount(String phoneNumber) {
        String operator = determineOperator(phoneNumber);
        return new Account(phoneNumber, operator);
    }

    private String determineOperator(String phoneNumber) {
        if (phoneNumber.matches("^\\+?380(50|66|95|99)\\d{7}$")) {
            return "Vodafone";
        } else if (phoneNumber.matches("^\\+?380(67|68|96|97|98)\\d{7}$")) {
            return "Kyivstar";
        } else if (phoneNumber.matches("^\\+?380(63|73|93)\\d{7}$")) {
            return "Lifecell";
        } else {
            return "Unknow Operator";
        }
    }
}