package com.eidos.uuid;

import org.springframework.stereotype.Component;

@Component
public class AddMaxNumbersUUID {

    public int addMaxNumbers(String str1, String str2) {
        String temp = "";
        for (int i = 0; i < str1.length(); i++) {
            int a = Character.digit(str1.charAt(i), 16);
            int b = Character.digit(str2.charAt(i), 16);
            if (a > b) {
                temp += String.valueOf(str1.charAt(i));
            }
            else {
                temp += String.valueOf(str2.charAt(i));
            }
        }
        return new SummationUUID().summation(temp);
    }
}
