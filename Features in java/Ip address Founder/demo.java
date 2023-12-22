//this code is to find whether is it correct ip address or not



import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
    public static void main(String[] args) {
        // Define a pattern
        String patternString = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        Pattern pattern = Pattern.compile(patternString);

        // Create a matcher for the pattern
        Matcher matcher1 = pattern.matcher("23.45.12.56");

        // Use matches() to check if the entire string matches the pattern
        if (matcher1.matches()) {
            System.out.println("The entire string matches the pattern with matches().");
        } else {
            System.out.println("The entire string does not match the pattern with matches().");
        }
    }
}
