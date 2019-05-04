package ru.ricksanchez;

import org.springframework.beans.factory.annotation.Autowired;

public class IndependentMessageRenderer {
    @Autowired
    private MessageRenderer renderer;

    public void print(){
        renderer.printMessage();
    }
}
