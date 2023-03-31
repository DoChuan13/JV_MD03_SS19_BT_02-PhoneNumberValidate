package app.config;

import java.util.regex.Pattern;

public class PhoneValidate {
    private static final String PHONE_REGEX = "[\\d]{2}-0[\\d]{9}";

    public static boolean validatePhoneNumber(String phoneNumber) {
        return Pattern.matches(PHONE_REGEX, phoneNumber);
    }
}
