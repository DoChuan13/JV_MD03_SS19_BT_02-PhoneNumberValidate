package app.view;

import app.config.InputConfig;
import app.config.PhoneValidate;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input Phone Number: ");
        String phoneNumber = InputConfig.getString();
        boolean validatePhone = PhoneValidate.validatePhoneNumber(phoneNumber);
        System.out.println("Phone Number " + phoneNumber + " is " + (validatePhone ? "Valid" : "INVALID"));
    }
}
