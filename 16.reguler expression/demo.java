import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("\\d+"); // \d matches any digit, + means one or more

        // Define a string to match against
        String stringToMatch = "Hello123World456";

        // Create a matcher for the pattern
        Matcher matcher = pattern.matcher(stringToMatch);

        // Use find() to find occurrences of the pattern in the string
        while (matcher.find()) {
            System.out.println("Found a match: " + matcher.group() + " at index: " + matcher.start() + " and ends at index: " + matcher.end());
        }
    }
}