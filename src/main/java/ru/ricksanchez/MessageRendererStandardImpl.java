package ru.ricksanchez;

public class MessageRendererStandardImpl implements MessageRenderer{
    private Message message;

    public MessageRendererStandardImpl(Message message) {
        this.message = message;
    }

    public void message(){
        System.out.println(message.getText());
    }

    @Override
    public void printMessage() {
        System.out.println(message.getText());
    }
}
