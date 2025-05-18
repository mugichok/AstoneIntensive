package src.Patterns.Creational.CardBuilder.builder;

import src.Patterns.Creational.CardBuilder.BusinessCard;

public abstract class BusinessCardBuilder {
    private BusinessCard businessCard;

    BusinessCard getBusinessCard(){
        return businessCard;
    }

    public BusinessCardBuilder(){
        createCard();
    }

    abstract void createName();
    abstract void createPrice();
    abstract void createSize();

    public BusinessCardBuilder setColor1(String color1){
        businessCard.setColor1(color1);
        return this;
    }

    public BusinessCardBuilder setColor2(String color2){
        businessCard.setColor2(color2);
        return this;
    }

    private void createCard(){
        businessCard = new BusinessCard();
    }

    public BusinessCard build(){
        createName();;
        createPrice();
        createSize();

        return businessCard;
    }
}
