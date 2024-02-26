import java.util.ArrayList;
import java.util.Scanner;
class Average {
    ArrayList<Integer> numList;

    //constructor creates new arraylist of integer type
    //and adds the numbers taken as argument to the arraylist
    Average (int num1, int num2, int num3 ) {
        numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
    }

    //adds each number in the arraylist and divides by array size
    //also prints the result
    void printAverage() {
        double sum = 0;
        for (int per : numList) {
            sum += per;
        }
        System.out.println("Average: " + sum / numList.size());
    }

}
public class week3test3 {

    public static void main(String[] args) {

        //Getting three numbers from user
        //scanner.nextLine() is used to consume the line nextInt leaves behind
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter second number: ");
        int secondNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter third number: ");
        int thirdNum = scanner.nextInt();
        scanner.nextLine();

        //create an instance of average class and pass the three number from user
        Average avg = new Average(firstNum, secondNum, thirdNum);

        //calls the avg method and calculates the average
        //the method prints the results to the terminal
        avg.printAverage();

    }

}
