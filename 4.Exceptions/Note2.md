In the Java if any runtime error happens then it will throw an exception and stop the program to run.
<br>
and it will stop the excecution.

Look at this example:
```java

public class Demo {
    public static void main(String[] args) {

        int i = 9;

        int j = 19/i;

        System.out.println(j);

        System.out.println("bye");


        
    }
    
}

```

In this example we are trying to divide 19 by 0. Which is not possible. So it will throw an exception and stop the program to run.

```java
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Demo.main(Demo.java:8)
```


so to prevent this we have to use exception handling.

<br>

## Exception Handling - Try Catch Block

```java


public class Demo {
    public static void main(String[] args) {

        int i = 18;
        int j = 0;
        try {
            j = i / j;
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}


```

in try catch block we put the code which can throw an exception.
If there is no any problem then the catch part won't happens.


