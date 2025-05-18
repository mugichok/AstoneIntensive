package src.Patterns.Creational.CardBuilder.builder;

public class LargeBusinessCardBuilder extends BusinessCardBuilder{
    @Override
    void createName() {
        getBusinessCard().setName("Большая визитка");
    }

    @Override
    void createPrice() {
        getBusinessCard().setPrice(120);
    }

    @Override
    void createSize() {
        getBusinessCard().setSize(new int[]{150, 100});
    }
}
