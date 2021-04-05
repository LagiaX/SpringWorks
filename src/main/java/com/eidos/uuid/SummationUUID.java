package com.eidos.uuid;

import org.springframework.stereotype.Component;

@Component
public class SummationUUID {

    public int summation(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt("" + str.charAt(i), 16);
        }
        return sum;
    }
}
