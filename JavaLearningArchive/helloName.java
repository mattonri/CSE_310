package JavaLearningArchive;

// package app.src.main.java.learning;
import java.util.Scanner;

public class helloName {
    public String HelloNameFunction(String name) {
        return String.format("Hello %s!", name);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What's your name?");
        String userInput = console.nextLine();
        System.out.println(new helloName().HelloNameFunction(userInput));
        console.close();
    }
}