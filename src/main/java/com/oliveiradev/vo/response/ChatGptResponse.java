package com.oliveiradev.vo.response;

import java.io.Serializable;
import java.util.List;

public class ChatGptResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private List<Choice> choices;

    public ChatGptResponse() { }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}