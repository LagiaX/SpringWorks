package com.eidos.uuid;

import org.springframework.stereotype.Component;

@Component
public class SplitUUID {

    public String[] split(String uuid) {
        String[] splits = uuid.split("-",-1);
        return splits;
    }
}
