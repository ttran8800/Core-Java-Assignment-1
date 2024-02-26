import java.util.Scanner;

public class week3test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //asking and getting user input
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter roll number: ");
        String rollNum = scanner.nextLine();
        System.out.print("Please enter field of interest: ");
        String fieldOfInterest = scanner.nextLine();
        System.out.println();

        //printing summary including user input
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNum + ". My field of interest are " + fieldOfInterest + ".");

    }

}
