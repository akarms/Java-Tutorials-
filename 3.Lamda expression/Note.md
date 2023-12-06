# Lamda Expression

In the Single Abstract Method Interface you know there would be only one method and you had wrote like the following code:
```java


@FunctionalInterface
interface A {
    void Show();
}

public class Demo {
    public static void main(String[] args) {

        A obj = new A(){
            public void Show(){
                System.out.println("In B");
            }
        };
        obj.Show();
        
    }

    
}

```

but we can simplify the code by using the lamda expression.

```java


@FunctionalInterface
interface A {
    void Show();
}



public class Demo {
    public static void main(String[] args) {

        A obj = () ->  System.out.println("In B"); //This is how we can use the lamda expression.
            
        
        obj.Show();
        
    }

    
}

    
    
```

In **Lamda Expression** we can only use the **Functional Interface**.
<br>
Lambda expression will identify the type of the interface by itself , and excecute in the metheod of that interface.

<br>

OOk what if we have to pass somthing in the method of the interface. Then we have to use the following code:

```java


@FunctionalInterface
interface A {
    void Show(int i);
}



public class Demo {
    public static void main(String[] args) {

        A obj = (int i) ->  System.out.println("In B" + " " + i);
            
        
        obj.Show(5);
        
    }

    
}

```

Result: `In B 5`




<br>

We Can pass multiple arguments in the method of the interface.

<br>

There is one more thing that we can do with the lamda expression. We can pass the method without any bracket key and return type.

```java

@FunctionalInterface
interface A {
    void Show(int i);
}



public class Demo {
    public static void main(String[] args) {

        A obj =  i ->  System.out.println("In B" + " " + i);
            
        
        obj.Show(5);
        
    }

    
}

```

By using lamda expression we can reduce the amount of class made when the ececution of the.


