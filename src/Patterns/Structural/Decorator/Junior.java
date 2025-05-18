package src.Patterns.Structural.Decorator;

public class Junior implements Developer{
    @Override
    public String makeJob() {
        return writeCode();
    }

    public String writeCode(){
        return "Пишу код.";
    }
}
