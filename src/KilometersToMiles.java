// java program to convert kilometers to miles
// author: naimul hassan niloy
// date: 7/15/22

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        // declarations
        double kilometer, mile;

        // create a object for Scanner class
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter the distance in kilometer: ");
        kilometer = sc.nextDouble();

        // convert the distance into miles
        mile = 0.62137119 * kilometer;

        System.out.println("The distance in miles: " + mile);
    }
}
