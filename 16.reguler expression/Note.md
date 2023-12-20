A reguler expression is a sequence of characters that define a search pattern. 

<br>

When you search for data in a text, you can use this search pattern to describe what you are searching for.

<br>

for example 

'^[a-z0-9_-]{3,16}$'  

<br>

in here

1. ^ means start of the string
2. [a-z0-9_-] means match characters and symbols in the list, a-z, 0-9, underscore, hyphen
3. {3,16} means length at least 3 characters and maximum length of 16


<br>

## java regex 

java regex is an API that is used to define a pattern for searching or manipulating strings.

it is widely used to define constraint on strings such as password and email validation.

<br>

### java regex classes

1. Matcher class  
     1. boolean matches() - attempts to match the entire input sequence against the pattern.
     2. boolean find() - attempts to find the next subsequence of the input sequence that matches the pattern.
     3. boolean find(int start) - resets this matcher and then attempts to find the next subsequence of the input sequence that matches the pattern, starting at the specified index.
     4. int start() - returns the start index of the previous match.
     5. int end() - returns the offset after the last character matched.
     6. int groupCount() - returns the number of capturing groups in this matcher's pattern.
2. pattern class
    1. static pattern compile(String regex) - compiles the given regular expression into a pattern.
    2. Matcher matcher(CharSequence input) - creates a matcher that will match the given input against this pattern.
    3. static boolean matches(String regex, CharSequence input) - compiles the given regular expression and attempts to match the given input against it.
    4. String split(CharSequence input) - splits the given input sequence around matches of this pattern.
      
    




