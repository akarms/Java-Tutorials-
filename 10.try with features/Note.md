SomeTimes we don't wan't to handle exceptions just we need to put try block only
<br>
<br>

at that time we can use finnaly block

<br>

actually finally block is used to close the resources. after the excecution.

```java
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        try {
            int num = sc.nextInt();
            System.out.println(num);
        } finally {
            sc.close();
            System.out.println("Scanner closed");
        }

    }
    
}
```

In the above code the scanner will be closed even if there is an exception.

if we close the scanner in the try block and if there is an exception the scanner won't be closed.
So we use finally block to close the scanner. it will be closed even if there is an exception or not.


---

Actually we can do a subtitute for finally block by using try with resources.

```java         
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        
        try (Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            System.out.println(num);
        } 

    }
    
}
```

In the above code we don't need to close the scanner because it will be closed automatically after the execution.

<br>

So that's a feature of try with resources.