/* Class name GradesAverange. Which calculate numbers of students and grades and calculate the average of the total grades. 
   First to prompt input for numbers of student then use while loop while wrong input indicated. Then goes by numbers 
   of student in order to input grades. Once the all students grades success to input, end will prompt the average of the total grades. */

import java.util.Scanner;

public class GradesAverange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents, totalGrade = 0;        // assign integer valueables
        double gradesAverange;      //double because might have decimal

        System.out.print("Enter the number of students:");
        numStudents = input.nextInt();      //student input 
        while (numStudents <= 0) {      //repeat until correct input received
            System.out.println("Invalid grade, try again...");
            numStudents = input.nextInt();
        }
        Integer[] grades = new Integer[numStudents];        // grades array to store students grade

        for (int gradesCount = 0; gradesCount < numStudents; gradesCount++) {       //for loop use to repeat the process to input grades for each students
            System.out.println("Enter the grade for student " + (gradesCount + 1));
            grades[gradesCount] = input.nextInt();
            totalGrade += grades[gradesCount];
        }
        input.close();
        gradesAverange = totalGrade / numStudents;
        System.out.println("The average is " + gradesAverange);
    }
}
