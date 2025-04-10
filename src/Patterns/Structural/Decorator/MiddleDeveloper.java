package src.Patterns.Structural;

public class MiddleDeveloper extends DeveloperDecorator{

    public MiddleDeveloper(Junior developer){
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + codeReview();
    }

    private String codeReview(){
        return "Делаю код ревью.";
    }
}
