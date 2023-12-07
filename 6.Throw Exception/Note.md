In the try catch methode we can only catch the erors which is predefined no ?
<br>
So if we want to catch the error which is not predefined then we can use the throw keyword.
<br>
Which we can customise as per our need.

```java


public class Demo {
    public static void main(String[] args) {

        int i =20;
        int j = 0;
        int num[] = new int[5];
   


        try {
            j = 18 / i;    //What if we don't want the outcome to be zero 
                           //That can't be done with try catch no ?
                            //But we can done with throw exception
             
            if(j==0)
                   throw new ArithmeticException(); //in this time it will print as arithmaticexception

            System.out.println(num[4]);
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

In the above we have throwed that if j became 0 then it will became an aritmatica exception

<br>
<br>

We can also cutomsize the passing message of arithmatic exception.

<br>

```java

public class Demo {
    public static void main(String[] args) {

        int i =20;
        int j = 0;
        int num[] = new int[5];
   


        try {
            j = 18 / i;    //What if we don't want the outcome to be zero 
                           //That can't be done with try catch no ?
                            //But we can done with throw exception
             
            if(j==0)
                   throw new ArithmeticException("I Don't want to print zero"); //in this time it will print as arithmaticexception

            System.out.println(num[4]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Numbers can't be divided by zero" + e);
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


now the resutl will be like 

```java

      
Numbers can't be divided by zerojava.lang.ArithmeticException: I Don't want to print zero
0
bye

```

Thats how we can pass the message.


