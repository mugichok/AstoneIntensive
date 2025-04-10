package Patterns.structural.decorator;

public class SeniorDeveloper extends DeveloperDecorator{
    private Developer developer;

    public SeniorDeveloper(MiddleDeveloper developer){
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeReport();
    }

    public String makeReport(){
        return "Делаю отчет о проекте";
    }
}
