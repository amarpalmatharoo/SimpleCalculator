import java.util.*;
public class Main {
    //Will scan the values given into the class
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	Main simpleCalculator = new Main();
	Scanner scan = new Scanner(System.in);

	int x;
	double score;
	simpleCalculator.menu();
	x = scan.nextInt();

        switch (x) {
            case 1 -> {
                score = simpleCalculator.divide();
                System.out.println(score);
            }
            case 2 -> {
                score = simpleCalculator.add();
                System.out.println(score);
            }
            case 3 -> {
                score = simpleCalculator.multiply();
                System.out.println(score);
            }
            case 4 -> {
                score = simpleCalculator.subtract();
                System.out.println(score);
            }
            default -> System.out.println("Invalid choice");
        }
    }
    public void menu(){
        System.out.println("1. Divide");
        System.out.println("2. Add");
        System.out.println("3. Multiply");
        System.out.println("4. Subtract");
    }

    /**
     *This class will do the division operation
     * @return the result of the values
     */
    public double divide(){


        double a, b; // these variables will hold the values that will be divided
        System.out.println("Insert first number");
        a = scan.nextDouble(); //a gets assigned the first value given
        System.out.println("Enter Second value");
        b = scan.nextDouble(); //b gets assigned the second value given
        //double val = a/ b; //created a new val variable that will divide the values in a and b

        return a/b; //will return the result of the division of values a and b

    }

    public double multiply(){

        double a, b; // these variables will hold the values that will be divided
        System.out.println("Insert first number");
        a = scan.nextDouble(); //a gets assigned the first value given
        System.out.println("Enter Second value");
        b = scan.nextDouble(); //b gets assigned the second value given


        return a*b; //will return the result of the multiplication of values a and b
    }

    public double subtract(){

        double a, b; // these variables will hold the values that will be divided
        System.out.println("Insert first number");
        a = scan.nextDouble(); //a gets assigned the first value given
        System.out.println("Enter Second value");
        b = scan.nextDouble(); //b gets assigned the second value given

        return a-b; //will return the result of the subtraction of values a and b
    }

    public double add(){

        double a, b; // these variables will hold the values that will be divided
        System.out.println("Insert first number");
        a = scan.nextDouble(); //a gets assigned the first value given
        System.out.println("Enter Second value");
        b = scan.nextDouble(); //b gets assigned the second value given

        return a+b; //will return the result of the addition of values a and b
    }
}
