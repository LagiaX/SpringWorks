package com.eidos.uuid;

import org.springframework.stereotype.Component;

@Component
public class SortUUID {

    public String sort(String str) {
        String temp = "";
        // Remove duplicates
        for (int i = 0; i < str.length(); i++) {
            if (!temp.contains(String.valueOf(str.charAt(i)))) {
                temp += String.valueOf(str.charAt(i));
            }
        }
        // Sort the string
        String sorted = "";
        while (!temp.isEmpty()) {
            int max = new MaxNumberUUID().maxNumber(temp);
            String maxHex = Integer.toHexString(max);
            sorted += maxHex;
            temp = temp.replace(maxHex, "");
        }
        return sorted;
    }
}
