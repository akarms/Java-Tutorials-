On here by we  have used a predefined funtions like `ArithmeticException` or `NullpoitException`
<br>
but 
<br>
What if we made a new custom exception hun ?

```java

class myException extends Exception{
    public myException(String string){
         
    }

}



public class Demo {
    public static void main(String[] args) {

        int i =20;
        int j = 0;
        int num[] = new int[5];
   


        try {
            j = 18 / i;    
             
            if(j==0)
                   throw new myException("I Don't want to print zero"); //This time we are going to make a new exception of ourselves.

            System.out.println(num[4]);
        } 
        catch(myException e){
            System.out.println("This is my exception" );   //this is our exception

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


the result is 
    
 ```java

    This is my exception
    0
    bye

 ```


in this code we have made a new exception called `myException` and we have thrown it in the code.
<br>

Note we have to **extend the Exception class** to make a new exception.
we can extend it to `Exception` class or `RuntimeException` class.

<br>
<br>

wait 

How we suppose print the exception message which we have thrown ? even though we have thrown it we can't print it.
even if we try to print it we will get a message like this

```java

 try {
            j = 18 / i;    
             
            if(j==0)
                   throw new myException("I Don't want to print zero"); //This time we are going to make a new exception of ourselves.

            System.out.println(num[4]);
        } 
        catch(myException e){
            System.out.println("This is my exception" + e );   //this is our exception

        }


```

result is 
<br>
<br>

```java
This is my exceptionmyException
0
bye
```


<br>
<br>

to pass the exception we have to do some modification im our customized class

```java
class myException extends Exception{
    public myException(String string){
         super(string);  //this is how we assingn our thrown message to exception message.
    }

}

```

<br>

As per like above we can make our own exception and throw it in our code.

