package src.Streams.Employees;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    List<Project> projects;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int age, List<Project> projects, int salary) {
        this.name = name;
        this.age = age;
        this.projects = projects;
        this.salary = salary;
    }
    public Employee(){
        this("", 0, List.of(new Project("", 0)), 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public static Employee defaultEmployee(){
        return new Employee("Дефолтный сотрудник", 1, List.of(new Project("Дефолтный проект", 1)), 1);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", projects=" + projects +
                ", salary=" + salary +
                '}';
    }
}
