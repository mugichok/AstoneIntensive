package Patterns.structural.decorator;

public class Junior implements Developer{
    @Override
    public String makeJob() {
        return writeCode();
    }

    public String writeCode(){
        return "Пишу код.";
    }
}
