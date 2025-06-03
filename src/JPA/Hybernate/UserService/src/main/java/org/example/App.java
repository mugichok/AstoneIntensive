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
            System.out.println("1. Create User");
            System.out.println("2. Get User");
            System.out.println("3. Get All Users");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    userService.createUser(name, email, age);
                    break;
                case 2:
                    System.out.print("Enter user ID: ");
                    Long id = scanner.nextLong();
                    User user = userService.getUser(id);
                    System.out.println(user);
                    break;
                case 3:
                    List<User> users = userService.getAllUsers();
                    users.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Enter user ID to delete: ");
                    Long deleteId = scanner.nextLong();
                    userService.deleteUser(deleteId);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

