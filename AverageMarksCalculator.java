import java.util.Scanner;  // Import Scanner class for input

public class AverageMarksCalculator {
    public static void main(String[] args){
        
        double mar = averageMarksCal();
        System.out.print("Average Marks "+mar);
        
    }
    static double averageMarksCal(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students ");
        int n = sc.nextInt();

        double totalMarks = 0;
        double averageMarks = 0;
        
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Marks of Student out of Hundred(100) ");
            float marks = sc.nextFloat();

            System.out.println("Marks of Student #"+(i+1)+" are \t"+marks+"/100.0");

            totalMarks +=marks;
            averageMarks = (totalMarks)/n;
            
        }
        return averageMarks;
    }
}
