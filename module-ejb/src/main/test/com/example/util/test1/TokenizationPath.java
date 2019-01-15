package com.example.util.test1;

public enum TokenizationPath {
    GREEN("GREEN"),
    RED("RED"),
    YELLOW("YELLOW"),
    ORANGE("ORANGE"),
    ;

    TokenizationPath(String values) {
        this.values = values;
    }

    private String values;

    public String getValues() {
        return values;
    }
}
