Just look at the below example:
```java 

class A{

    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A");
    }
}

class B extends A{
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("In B");
    }

}


public class demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
        
    }

    
}
    
 ```

 in the above class we tried to override the method of the parent class but we failed to do so
 the result is 
    ```java
    In A
    ```

 because there is an spell mistake in child class. So, that is not the overriding. This is the method hiding.  
 Finding these type of error become harder when the project is larger.
 
### Method Overriding:

    To overcome the problem of method hiding we have to use the @Override annotation. 


 ```java

    
class A{

    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A");
    }
}

class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B");
    }

}


public class demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
        
    }

    
}

```

Now it will show an error for the method name if we tried to do the same mistake again.

Annotion can be made by the user also. 

<br>

Some annotion are given to show before the compilation of the code.
<br>
some annotion are given to show after the compilation of the code.


