package Patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Junior developer1 = new Junior();
        MiddleDeveloper developer2 = new MiddleDeveloper(developer1);
        SeniorDeveloper developer3 = new SeniorDeveloper(developer2);

        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());
        System.out.println(developer3.makeJob());
    }
}
