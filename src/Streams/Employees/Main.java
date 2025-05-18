package src.Streams.Employees;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//У тебя есть список сотрудников List<Employee>, где у каждого сотрудника есть:
//- Имя (name)
//- Возраст (age)
//- Список проектов (projects) (каждый проект содержит название и длительность)
//- Зарплата (salary)
//
//Требуется:
//- Оставить только тех сотрудников, у которых возраст от 30 до 50 лет и зарплата выше 60,000.
//- Извлечь все названия проектов из списка сотрудников в одном потоке.
//- Извлечь только те проекты, длительность которых больше 6 месяцев.
//- Преобразовать все названия проектов в верхний регистр.
//- Удалить дублирующиеся названия проектов.
//- Сортировать проекты по длительности (по убыванию).
//- Собрать результат в структуру данных, где:
//	1) Ключом будет проект (название),
//	2) Значением будет средняя длительность всех проектов с таким названием, где участвовали сотрудники из первого шага.

public class Main {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>(List.of(
                new Employee("Сергей", 35, List.of(new Project("project1", 12), new Project("project2", 11), new Project("project3", 18)), 78),
                new Employee("Александр", 25, List.of(new Project("project1", 15), new Project("project2", 6), new Project("project3", 27)), 100),
                new Employee("Евгений", 43, List.of(new Project("project1", 21), new Project("project2", 34), new Project("project4", 13)), 56),
                new Employee("Мария", 32, List.of(new Project("project1", 14), new Project("project2", 32), new Project("project15", 42)), 76),
                new Employee("Юлия", 24, List.of(new Project("project1", 25), new Project("project2", 12), new Project("project6", 12)), 87)));
        employees.add(null);

        Map<String, Double> MapOfprojects = employees.stream()
                .map(Optional::ofNullable)
                .map(e -> e.orElseGet(Employee::new))
                .filter(employee -> employee.getAge() > 30&& employee.getAge() < 50 && employee.getSalary() > 60)
                .flatMap(projects -> projects.getProjects().stream())
                .filter(projects -> projects.getDuration() > 6)
                .sorted(Comparator.comparingInt(Project::getDuration).reversed())
                .distinct()
                .collect(Collectors.groupingBy(p -> p.getName().toUpperCase(), Collectors.averagingInt(Project::getDuration)));
        System.out.println(MapOfprojects);
    }
}
