import java.util.Scanner;

public class week3test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Getting user input for length of rectangle
        System.out.print("Give length of rectangle: ");
        double recLength = scanner.nextInt();

        //Getting user input for width of rectangle
        System.out.print("Give width of rectangle: ");
        double recWidth = scanner.nextInt();

        //Math for Area of rectangle
        int recArea = (int) recLength * (int) recWidth;
        System.out.println();

        //printing area of rectangle result
        System.out.println("Area of rectangle is: " + recArea);
    }

}
