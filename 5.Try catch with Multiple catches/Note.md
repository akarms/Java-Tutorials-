Some time there could be multiple exception in the code, so we have to handle them all.

```java



public class Demo {
    public static void main(String[] args) {

        int i = 18;
        int j = 0;
        int num[] = new int[5];
        try {
            j = 18 / i;
            System.out.println(num[5]);
        } catch (Exception e) {
            System.out.println("Something went wrong" );
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}


```

Look at the above code 

there can be two kind of exception 
1. ArithmeticException
2. ArrayIndexOutOfBoundsException

but every time we get an exception it'll just print "Something went wrong"
<br>
So user can't understand what is the problem.

SO for handling **multiple exception** we have to use **multiple catch block**.

<br>

just look at the code below:

```java


public class Demo {
    public static void main(String[] args) {

        int i = 9;
        int j = 0;
        int num[] = new int[5];


        try {
            j = 18 / i;
            System.out.println(num[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Numbers can't be divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}



```


But we cannot alwatys ennsure that there will be only two type of exception.

<br>

so that for a safe side we have to use also **Exception** class.

<br>

```java


public class Demo {
    public static void main(String[] args) {

        int i = 9;
        int j = 0;
        int num[] = new int[5];
        String s = null;


        try {
            j = 18 / i;
            System.out.println(s.length());
            System.out.println(num[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Numbers can't be divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch (Exception e){
            System.out.println("SomeThing went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}


```


So this is how we can handle multiple exception.

### Always put (exception e) in catch block finally, after every sub part of catch block. because if you put exception in catch block first it will excecute every exception in catch block so sub part will not be usefull.