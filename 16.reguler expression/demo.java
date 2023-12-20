import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("\\d+"); // \d matches any digit, + means one or more

        // Create a matcher for the pattern
        Matcher matcher1 = pattern.matcher("Hello123World456");
        Matcher matcher2 = pattern.matcher("123");

        // Use find() to find occurrences of the pattern in the string
        while (matcher1.find()) {
            System.out.println("Found a match with find(): " + matcher1.group());
        }

        // Use matches() to check if the entire string matches the pattern
        if (matcher.matches()) {
            System.out.println("The entire string matches the pattern with matches().");
        } else {
            System.out.println("The entire string does not match the pattern with matches().");
        }
    }
}