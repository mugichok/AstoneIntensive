package src.Patterns.Structural.Decorator;

public abstract class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer){
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
