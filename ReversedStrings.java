import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        // Read the user's input as a string
        String userInput = scanner.nextLine();

        // Call the reverseString function to reverse the input
        String reversed = reverseString(userInput);

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner to release resources
        scanner.close();
    }

    public static String reverseString(String input) {
        // Convert the input string into a character array
        char[] charArray = input.toCharArray();
        
        // Initialize two pointers for reversing the string
        int start = 0;
        int end = input.length() - 1;

        // Swap characters from both ends until the pointers meet
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}

