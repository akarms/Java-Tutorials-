## Matcher.group

Matcher.founder() method is used to find the next subsequence of the input sequence that matches the pattern.

'matcher.find()' returns true if the pattern is found in the string.


## Matcher.group

The `Matcher.group()` method returns the input subsequence matched by the previous match.

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherGroupExample {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("\\d+"); // \d matches any digit, + means one or more

        // Define a string to match against
        String stringToMatch = "Hello123World456";

        // Create a matcher for the pattern
        Matcher matcher = pattern.matcher(stringToMatch);

        // Use find() to find occurrences of the pattern in the string
        while (matcher.find()) {
            System.out.println("Found a match: " + matcher.group());
        }
    }
}

```

the results are:

```java
Found a match: 123
Found a match: 456
```

It clearly indicate that it has two maches and it returns the input subsequence matched by the previous match.


### Marcher.start() and Matcher.end()

The `Matcher.start()` method returns the start index of the previous match.

The `Matcher.end()` method returns the offset after the last character matched.

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherStartEndExample {
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

```

the results are:

```java
Found a match: 123 at index: 5 and ends at index: 8
Found a match: 456 at index: 13 and ends at index: 16
```

So it clearly indicate that it has two matches and it returns the start index of the previous match and the offset after the last character matched.


### Matcher.matches()

The `Matcher.matches()` method attempts to match the entire input sequence against the pattern.

```java

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherExample {
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
        if (matcher2.matches()) {
            System.out.println("The entire string matches the pattern with matches().");
        } else {
            System.out.println("The entire string does not match the pattern with matches().");
        }
    }
}

```

this will return:

```java
Found a match with find(): 123
Found a match with find(): 456
The entire string matches the pattern with matches().
```

because the first string has two matches and the second string matches the pattern.
