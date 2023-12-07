Imagine there are two classes which needs to be handle exception.

<br>
<br>

```java

class A{
   
}

class B{
   
}


```

unlike creating a try catch methode for each classes we can handle a try catch methode for both classes 
in one methode.


<br>

this is called `Ducking exception`
<br>

for this we use a keyword called `throws Exception` in the methode.

<br>

by using this keyword it's like classes won't be handing the exceptions anymore and if any exception happens it will be thrown to the methode which has the `throws Exception` keyword.

<br>



```java

class A {
    public void show() throws Exception {
        Class.forName("CAlc"); //actually this is a checked exception but we are not handling it here.
    }

}

public class Demo {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();  //SO in here it's showing an error because we are not handling the exception.

    
    }


}
```


<br>

So all we have to do the exception which have to be handled in the methode which has the `throws Exception` keyword.

so we have to add a try catch methode in the demo class instead of the class A.

<br>

it will show error if not found class named `Calc` and it will show the error message we have given in the catch methode.





