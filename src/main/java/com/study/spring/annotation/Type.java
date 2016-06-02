package com.study.spring.annotation;

public enum Type {
    OLD("Old"),
    NEW("New"),
    NOMAL("Normal");

    private String label;

    Type(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}