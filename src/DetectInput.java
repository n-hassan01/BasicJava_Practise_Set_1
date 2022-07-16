// java program to detect the entered input is integer or not
// author: naimul hassan niloy
// date: 7/15/22

import java.util.Scanner;

public class DetectInput {
    public static void main(String[] args) {
        // declarations
        boolean detection;

        // create an object for Scanner class
        Scanner sc = new Scanner(System.in);

        // detecting the input is integer or not
        detection = sc.hasNextInt();

        System.out.println(detection);
    }
}
