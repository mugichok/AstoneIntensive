package src.StreamOfEmployee;

import java.util.List;

public class Employee implements Comparable{
    private String employeeName;
    private int age;
    List<Projects> list;
    private int salary;

    public Employee(String employeeName, int age, List<Projects> list, int salary){
        this.employeeName = employeeName;
        this.age = age;
        this.list = list;
        this.salary = salary;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setList(List<Projects> list){
        this.list = list;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public int getAge(){
        return age;
    }

    public List<Projects> getList(){
        return list;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
