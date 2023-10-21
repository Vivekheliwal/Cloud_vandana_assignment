import java.util.Scanner;

public class roman_to_integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for case insensitivity

        int result = roman_to_integer(romanNumeral);
        if (result != -1) {
            System.out.println("Integer value: " + result);
        } else {
            System.out.println("Invalid Roman numeral input.");
        }

        scanner.close();
    }

    public static int roman_to_integer(String s) {
        int result = 0;
        int prevValue = 0;

        // Define the mapping of Roman numerals to integer values
        // Note: This mapping assumes valid Roman numerals.
        java.util.HashMap<Character, Integer> romanMap = new java.util.HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }
}
