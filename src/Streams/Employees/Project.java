package src.Streams.Employees;

public class Project{
    private String name;
    private int duration;

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return getName();
    }
}
