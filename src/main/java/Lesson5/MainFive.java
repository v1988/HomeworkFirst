package Lesson5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainFive {
    public static void main(String[] args) throws IOException {
        String str1 = " Hillel is my feature. I will be developer   ";
        System.out.println(str1 == "");
        System.out.println(str1.length());
        System.out.println(str1.trim().length());
        System.out.println(str1.charAt(23));
        System.out.println(str1.substring(33,42));
        System.out.println(str1.concat("!"));
        System.out.println(str1.trim().equalsIgnoreCase("Hillel is my feature. I will be DEVELOPER") );
        System.out.println(str1.equals("Hillel is my feature. I will be DEVELOPER") );
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        char ch1 = 11040;
        char ch2 = 11097;
        char ch3 = 11054;
        char ch4 = 11100;
        char ch5 = 11017;
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5 );

        write();
        registration();
        login();

    }
    private static void write() throws IOException {
        final String path = "src/main/resources/test/data.txt";
        final Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }

        FileWriter fileWriter = new FileWriter(path, true);
        fileWriter.write("Sample text 1\n");
        fileWriter.write("Sample text 2\n");
        fileWriter.write("Sample text 3\n");
        fileWriter.write("Sample text 4\n");
        fileWriter.close();

        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        fileReader.close();
        scanner.close();
    }

    public static void registration () throws IOException {
        final String path = "src/main/resources/test/users.txt";
        final Path pathToFile = Paths.get(path);
        Scanner scanner = new Scanner(System.in);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }

        FileWriter fileWriter = new FileWriter(path, true);
        System.out.println("Регистрация:");
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        fileWriter.write(login);
        fileWriter.write("\n");
        fileWriter.write(password);
        fileWriter.write("\n");

        fileWriter.close();
    }

    public static void login () throws IOException {
        final String path = "src/main/resources/test/users.txt";
        final Path pathToFile = Paths.get(path);
        Scanner scanner = new Scanner(System.in);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
            int i = 0;
            while (i<3) {
                FileWriter fileWriter = new FileWriter(path, true);
                System.out.println("Вход:");
                System.out.println("Введите логин для входа:");
                String login = scanner.nextLine();
                System.out.println("Введите пароль для входа:");
                String password = scanner.nextLine();
                FileReader fileReader = new FileReader(path);
                Scanner scanner2 = new Scanner(fileReader);
                String line = scanner2.nextLine();
                String line1 = scanner2.nextLine();
                if (line.equals(login)) {
                    if (line1.equals(password)) {
                        System.out.println("Вы залогинились!");
                        return;
                    }
                }
                i++;
                System.out.println("Повторите ввод (Попытка " + (i+1) +"/3)");
                fileReader.close();
                scanner2.close();
                }
                }


            }
