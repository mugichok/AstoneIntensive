package StreamOfEmployee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOfEmployee {
    public static void main(String[] args) {
        Employee sergei = new Employee("Сергей", 25, new ArrayList<Projects>(List.of(new Projects("project1", 2), new Projects("Project2", 3), new Projects("project3", 1))), 35);
        Employee aleksandr = new Employee("Александр", 44, new ArrayList<Projects>(List.of(new Projects("project6", 6), new Projects("Project11", 4), new Projects("project12", 8))), 78);
        Employee nikolay = new Employee("Николай", 24, new ArrayList<Projects>(List.of(new Projects("project113", 16), new Projects("Project8", 32), new Projects("project7", 65))), 23);
        Employee andrei = new Employee("Андрей", 30, new ArrayList<Projects>(List.of(new Projects("project21", 16), new Projects("Project17", 20), new Projects("project16", 21))), 38);

        List<Employee> employeeList = new ArrayList<>(List.of(sergei, aleksandr, nikolay, andrei));

        Map<String, Double> projects = employeeList.stream()
                .filter(e -> e.getAge() >= 30 && e.getAge() <= 50)
                .flatMap(e -> e.getList().stream())
                .filter(p -> p.getDuration() > 6.0)
                .collect(Collectors.groupingBy(Projects::getProjectName, Collectors.averagingInt(Projects::getDuration)));

        System.out.println(projects);

        var projectNames = employeeList.stream()
                .map(Employee::getList)
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(Projects::getDuration).reversed())
                .map(Projects::getProjectName)
                .map(String::toUpperCase)
                .toList();
        System.out.println(projectNames);

    }
}
