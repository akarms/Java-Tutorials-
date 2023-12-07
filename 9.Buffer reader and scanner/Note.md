In the older days  befor 2015 they used below method to get input from user's

```java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws NumberFormatException, IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.println("Enter a number");

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();
        
        
        
    }
    
}
```

But now we can use below method to get input from user's

```java

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);
        
        
        
    }
    
}

```


1. next.Int() - to get integer input
2. nextLine() - to get String input
3. nextFloat() - to get float input
4. nextDouble() - to get double input
5. nextBoolean() - to get boolean input
6. nextByte() - to get byte input
7. nextShort() - to get short input
8. nextLong() - to get long input

