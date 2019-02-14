package com.imooc.product.server.enums;

import lombok.Getter;

@Getter
public enum SystemProperties {
    JASYPT("jasypt.encryptor.password","APPOINT_PASSWORD#$176");
    private String key;
    private String value;

    SystemProperties(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
