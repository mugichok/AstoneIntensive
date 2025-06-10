package org.example;

import org.example.Entity.User;
import org.example.Service.UserService;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Создать пользователя");
            System.out.println("2. Посмотреть информацию о пользователе");
            System.out.println("3. Посмотреть информацию о всех пользователях");
            System.out.println("4. Обновить информацию о пользователе");
            System.out.println("5. Удалить пользователя");
            System.out.println("6. Завершить");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя пользователя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите email пользователя: ");
                    String email = scanner.nextLine();
                    System.out.print("Укажите возраст пользователя: ");
                    int age = scanner.nextInt();
                    userService.createUser(name, email, age);
                    break;
                case 2:
                    System.out.print("Введите id пользователя: ");
                    Long id = scanner.nextLong();
                    User user = userService.getUser(id);
                    System.out.println(user);
                    break;
                case 3:
                    List<User> users = userService.getAllUsers();
                    users.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Введите id пользователя, информацию о котором хотите обновить: ");
                    Long Id = scanner.nextLong();
                    userService.updateUser(userService.getUser(Id));
                    break;
                case 5:
                    System.out.print("Введите ID пользователя, которого хотите удалить: ");
                    Long deleteId = scanner.nextLong();
                    userService.deleteUser(deleteId);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Вы выбрали неверную опцию.");
            }
        }
    }
}


