import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkIfPangram(String input) {
        // Create a set to store the unique lowercase letters in the input
        Set<Character> uniqueLetters = new HashSet<>();

        // Iterate through the characters in the input and add them to the set
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }

        // Check if the set size is 26, indicating that all alphabet letters are present
        return uniqueLetters.size() == 26;
    }
}
