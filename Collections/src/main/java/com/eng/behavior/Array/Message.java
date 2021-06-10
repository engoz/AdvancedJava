package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.List;

public class Message {

    private int id;
    private String content;
    private List<Error> error = new ArrayList<>();

    public Message() {
    }

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Error> getError() {
        return error;
    }
}
