# pattern class

## static pattern compile(String regex)

compiles the given regular expression into a pattern.
<br>

for example if we wanted to make a string called "poda dei" into a pattern, we would do this:

```java

Pattern fathhy = Pattern.compile("poda dei");

```

## Matcher matcher(CharSequence input)

creates a matcher that will match the given input against this pattern.

<br>

for example if we wanted to match the pattern "poda dei" with the string "poda dei bekka", we would do this:

```java

Pattern fathhy = Pattern.compile("poda dei");

Matcher fathhyMatcher = fathhy.matcher("poda dei bekka");

```

so now fathtyMatcher is a matcher that will match the pattern "poda dei" with the string "poda dei bekka"

for example for both 

```java


import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class demo {
    public static void main(String[] args) {
        Pattern fathhy = Pattern.compile("poda dei");
        Matcher fathhyMatcher = fathhy.matcher("poda dei bekka");  // it will match the pattern with the string
        Matcher fathhyMatcher2 = fathhy.matcher("saniyene bekka"); // it will match the pattern with the string
        System.out.println(fathhyMatcher.find());
        System.out.println(fathhyMatcher2.find());
    }
}

```

the output will be:

```java

true
false

```

### reguler expression meta characters

| meta character | meaning |
|----------------|---------|
| .              | any character |
| \d             | any digit |
| \D             | any non digit |
| \s             | any white space |
| \S             | any non white space |
| \w             | any word character |
| \W             | any non word character |
| \b             | any word boundary |
| \B             | any non word boundary |
| ^              | beginning of a line |
| $              | end of a line |
| [abc]          | any character from the set |
| [^abc]         | any character not in the set |
| [a-zA-Z]       | any character in the range |
| [^a-zA-Z]      | any character not in the range |
| [a-z&&[^b,c]]   | any charecer between a - z but not with b ,c |
| a?             | zero or one of a |
| a*             | zero or more of a |
| a+             | one or more of a |
| a{3}           | exactly 3 of a |
| a{3,}          | 3 or more of a |
| a{3,6}         | between 3 and 6 of a |
| a(b\|c)        | a followed by b or c |
| a(b\|c)+       | a followed by one or more of b or c |


<br>

for example for the reguler expressionss: 

```java


import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class demo {
    public static void main(String[] args) {
        Pattern fathhy = Pattern.compile(".xy."); // in here . means any character and xy means xy , so it will match any 4 letter string that has xy in the middle.
        Matcher fathhyMatcher = fathhy.matcher("sxys");  // in here xy is in the middle so it will match
        Matcher fathhyMatcher2 = fathhy.matcher("ffxys"); // in here xy is after 2 characters , it will also match.
        Matcher fathhMatcher3 = fathhy.matcher("xy"); // xy is not in the middle of any character so it will not match
        Matcher fathhMatcher4 = fathhy.matcher("xggy"); // in here xy is not in the middle so it will not match
        System.out.println(fathhyMatcher.find());
        System.out.println(fathhyMatcher2.find());
        System.out.println(fathhMatcher3.find());
        System.out.println(fathhMatcher4.find());
    }
}



```
<br>

for \d

```java 
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("\\d");  //in here \d means any number after that word 

        // Create a matcher for the pattern
        Matcher matcher = pattern.matcher("a312");
        Matcher matcher2 = pattern.matcher("akar")

        System.out.println(matcher.find());  //it will results as trua as well as we give matcher to any String as number ok
        System.out.println(matcher2.find());  //it will results as false because it dosen't have any numaric charector.


    }
}




```

<br>

for [abc]

```java

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("[abc]");  //in here [abc] means any character from the set a,b,c

        // Create a matcher for the pattern
        Matcher matcher = pattern.matcher("sihri");   //there is no a,b,c so it will return false
        Matcher matcher2 = pattern.matcher("akar");   //there is a a so it will return true

        System.out.println(matcher.find());  
        System.out.println(matcher2.find()); 

    }
}

```


<br>

for $ 

```java

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("a$");  //in here $ means end of a line


        // Create a matcher for the pattern
        Matcher matcher = pattern.matcher("sihara");   //see last letter is a so it means it finishes with a. so True
        Matcher matcher2 = pattern.matcher("akar");   //it dosen't finish with a so False

        System.out.println(matcher.find());  
        System.out.println(matcher2.find()); 

    }
}

```


<br>

for a(b\|c) 

```java

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("a(b|c)"); // a followed by b or c

        // Define a string to match against
        String stringToMatch = "ab";

        // Create a matcher for the pattern
        Matcher matcher = pattern.matcher(stringToMatch);

    System.out.println(matcher.find());   //it will return true because it has a and after that  b


        
    }
}

```


<br>

for a?             

```java

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo {
    public static void main(String[] args) {
        // Define a pattern
        Pattern pattern = Pattern.compile("a?"); // in here a? means a is optional

        // Create a matcher for the pattern
        Matcher matcher = pattern.matcher("ab");
        Matcher matcher1 = pattern.matcher("b");

    System.out.println(matcher.find());    // true
    System.out.println(matcher1.find());   // true

    }
}

```
