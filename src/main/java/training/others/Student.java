package training.others;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //finding the length of the Array studentNames
        System.out.println("how many students?:");
        int totalStudents = in.nextInt();
        in.nextLine();
        String[] studentNames = new String[totalStudents];

        //allows user to input student names

        for (int j = 0; j < studentNames.length; j++) {
            System.out.println("enter student names:");
            studentNames[j] = in.nextLine();
        }

        for (String element : studentNames) {
            System.out.println(element);
        }
    }
}
