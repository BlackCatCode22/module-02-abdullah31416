import java.util.Scanner;

public class MadnessWithMethods {

    // Function to get an integer from the user
    public static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    // Function to compare two integers
    public static void compareTwoInts(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("The two integers are equal.");
        } else {
            System.out.println("The two integers are not equal.");
        }
    }

    // Function to sum two integers
    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Demonstrate the use of functions
        int firstInt = getAnIntFromTheUser();
        int secondInt = getAnIntFromTheUser();

        compareTwoInts(firstInt, secondInt);

        int sumResult = sumTwoInts(firstInt, secondInt);
        System.out.println("The sum of the two integers is: " + sumResult);
    }
}

// I added the flowchart in the readme.md file
