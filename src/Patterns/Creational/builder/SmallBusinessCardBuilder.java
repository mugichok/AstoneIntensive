package Patterns.creational.Builder.builder;

public class SmallBusinessCardBuilder extends BusinessCardBuilder{
    @Override
    void createName() {
        getBusinessCard().setName("Маленькая визитка");
    }

    @Override
    void createPrice() {
        getBusinessCard().setPrice(80);
    }

    @Override
    void createSize() {
        getBusinessCard().setSize(new int[]{90, 50});
    }
}
