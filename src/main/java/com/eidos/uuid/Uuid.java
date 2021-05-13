package com.eidos.uuid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uuid {
    @Id
    private String uuid;

    private String transformedUuid;

    public String getUuid() {
        return uuid;
    }

    public String getTransformedUuid() {
        return transformedUuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setTransformedUuid(String transformedUuid) {
        this.transformedUuid = transformedUuid;
    }
}
