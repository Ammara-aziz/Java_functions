import java.util.Scanner;

public class Board {
    public static void main() {

        m();

    }
    public static void m(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Students: ");
        int n = sc.nextInt();

        double marks ;


        for (int i = 0; i < n; i++) {
            System.out.println("Student #"+(i+1));
            double marksSum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("Enter Marks for Subject "+j+" : ");
                marks = sc.nextDouble();
                marksSum += marks; // Add to current student's obtained
            }
            // Print the total for the current student immediately
            System.out.println("Obtained Marks of Student #" + (i + 1) + ": " + marksSum);
            double percentage = (marksSum/500)*100;
            System.out.println("Result "+percentage+"%");
            System.out.println();
        }
        sc.close();

    }
}
