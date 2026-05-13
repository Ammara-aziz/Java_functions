import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        // 1. Get the array of total marks for all students
        double[] studentTotals = input();

        // 2. Calculate and display percentages for each student
        for (int i = 0; i < studentTotals.length; i++) {
            double pct = per(studentTotals[i]);
            System.out.println("Student " + (i + 1) + " Percentage: " + pct + "%");
        }

    }
    static double[] input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Students: ");
        int noOfStudents = sc.nextInt();

        double marks = 0;

        double[] allStudentMarks = new double[noOfStudents];
        double marksSum = 0;
        for (int i = 0; i < noOfStudents; i++) {

            System.out.println("Enter Marks of student " + (i + 1));

            for (int j = 1; j <= 5; j++) {
                System.out.println("Student #" + (i + 1) + "\nEnter Marks of subject " + j);
                marks = sc.nextDouble();
                marksSum  += marks;
            }
            allStudentMarks[i] = marksSum;
        }
        return allStudentMarks;
    }

    static double per(double marksSum){

        double totalMarks = 500.0;
        return (marksSum/totalMarks)*100;

    }
}
