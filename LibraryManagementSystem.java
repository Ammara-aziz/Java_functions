import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args){
        function();
    }
    static void function(){

        Scanner sc = new Scanner(System.in);


        int option ;

        do {
            System.out.println("\n--- University Library System ---");
            System.out.println("Select an operation by giving desired number:\n" +
                    "\t1: Borrow a Book\n" +
                    "\t2: Return a Book\n" +
                    "\t3: Check Availability\n" +
                    "\t4: Pay Late Fees\n"+"\t5. Exit");
            option= sc.nextInt();
            switch (option) {
            case 1:
                System.out.print("Enter Book ID to borrow ");
                int Borrow = sc.nextInt();
                break;

            case 2:
                System.out.print("Enter Book ID to Return ");
                break;
            case 3:
                System.out.print("Enter Book ID to check its Availability ");
                break;
            case 4:
                System.out.print("Enter Amount to pay Late Fee ");
                break;
            case 5:
                System.out.print("Thank You for using the System! ");
                break;
            default:
                System.out.print("Invalid option. Try again!!! ");

            }
        }while(option!=5);
    }
}
