package com.eng.exception;

public class KMHException extends Exception {
    String text;

    public KMHException(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
