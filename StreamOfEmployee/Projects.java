package StreamOfEmployee;

public class Projects {
    private String projectName;
    private int duration ;

    public Projects( String projectName, int duration){
        this.projectName = projectName;
        this.duration = duration;
    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getProjectName(){
        return projectName;
    }

    public int getDuration(){
        return duration;
    }

}
