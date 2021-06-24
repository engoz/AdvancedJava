package com.eng.exception;

public class LimitException extends Exception{
    String text;

    public LimitException(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
