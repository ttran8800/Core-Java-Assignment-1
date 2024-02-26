import java.util.ArrayList;

abstract class Marks {
    public abstract double getPercentage();
}

//this student class takes three marks to calculate percentage
class A extends Marks {
    ArrayList<Integer> studentMarks;
    public A (int mark1, int mark2, int mark3) {
        studentMarks = new ArrayList<>();
        studentMarks.add(mark1);
        studentMarks.add(mark2);
        studentMarks.add(mark3);
    }

    //returns calculated percentage
    @Override
    public double getPercentage() {
        double sum = 0;
        for (int per : studentMarks) {
            sum += per;
        }
        return (sum / (studentMarks.size()*100)) * 100;
    }
}

//returns calculated percentage based on array size (number of marks)
//percentage formula = (earned marks / total possible marks) * 100
class B extends Marks {
    ArrayList<Integer> studentMarks;
    public B (int mark1, int mark2, int mark3, int mark4) {
        studentMarks = new ArrayList<>();
        studentMarks.add(mark1);
        studentMarks.add(mark2);
        studentMarks.add(mark3);
        studentMarks.add(mark4);
    }

    //returns calculated percentage based on array size (number of marks)
    //percentage formula = (earned marks / total possible marks) * 100
    @Override
    public double getPercentage() {
        double sum = 0;
        for (int per : studentMarks) {
            sum += per;
        }
        return (sum / (studentMarks.size()*100)) * 100;
    }
}


public class week3test4 {

    public static void main(String[] args) {

        A studentA = new A(50, 64, 80);
        B studentB = new B(20, 90, 85, 20);

        System.out.println("Student A: " + studentA.getPercentage());
        System.out.println("Student B: " + studentB.getPercentage());

    }

}
