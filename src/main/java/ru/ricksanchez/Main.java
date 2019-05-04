package ru.ricksanchez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("ru.ricksanchez\\context.xml");

//        MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");

//        renderer.printMessage();
        IndependentMessageRenderer renderer = context.getBean(IndependentMessageRenderer.class);
        renderer.print();
    }
}
