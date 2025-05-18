package src.Patterns.Creational.CardBuilder;

import src.Patterns.Creational.CardBuilder.builder.BusinessCardBuilder;
import src.Patterns.Creational.CardBuilder.builder.SmallBusinessCardBuilder;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder builder = new SmallBusinessCardBuilder();

        BusinessCard card = builder
                .setColor1("Красный")
                .setColor2("Синий")
                .build();
        System.out.println(card);
    }
}
