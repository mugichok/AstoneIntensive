package Patterns.creational.Builder;

import Patterns.creational.Builder.builder.BusinessCardBuilder;
import Patterns.creational.Builder.builder.SmallBusinessCardBuilder;

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
