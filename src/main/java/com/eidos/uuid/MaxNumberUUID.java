package com.eidos.uuid;

import org.springframework.stereotype.Component;

@Component
public class MaxNumberUUID {

    public int maxNumber(String str) {
        int num = -1;
        for (int i = 0; i < str.length(); i++) {
            int current = Integer.parseInt("" + str.charAt(i), 16);
            if (num < current) {
                num = current;
            }
        }
        return num;
    }
}
