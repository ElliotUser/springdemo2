package ru.ricksanchez;

public class MessageRendererErrorImpl implements MessageRenderer{
    private Message message;

    public MessageRendererErrorImpl(Message message) {
        this.message = message;
    }

    public void message(){
        System.err.println(message.getText());
    }

    @Override
    public void printMessage() {
        System.err.println(message.getText());
    }
}
