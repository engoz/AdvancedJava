package com.eng.exception;

public class BlokageException extends Exception{
    String text;

    public BlokageException(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
