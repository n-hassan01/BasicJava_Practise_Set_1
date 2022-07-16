// java program to take name as keyboard input from user and greet him/her
// author: naimul hassan niloy
// date: 7/15/22

import java.util.Scanner;

public class GreetIndividuals {
    public static void main(String[] args) {
        // declarations
        String name;

        // create a object for Scanner class
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.println("Hello " + name + ", have a good day.");
    }
}
