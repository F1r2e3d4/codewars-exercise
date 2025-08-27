import java.util.Arrays;

public class SortedStringFormatter {

    public static String twoSort(String[] s) {
        // Step 1: Sort the array in ASCII (case-sensitive) order
        Arrays.sort(s);

        // Step 2: Take the first string
        String first = s[0];

        // Step 3: Insert "***" between each character
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            result.append(first.charAt(i));

            // Only add "***" if it's not the last character
            if (i < first.length() - 1) {
                result.append("***");
            }
        }

        // Step 4: Return the formatted string
        return result.toString();
    }

    public static void main(String[] args) {
        // Sample input
        String[] input = {"banana", "Apple", "cherry"};

        // Call the method
        String formatted = twoSort(input);

        // Print the result
        System.out.println(formatted);  // Output: A***p***p***l***e
    }
}
