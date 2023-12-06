In Lamda expression we can also create a return type method.

```java


@FunctionalInterface
interface A {
    int add(int i , int j);
}


public class Demo2 {
    public static void main(String[] args) {

        A obj =  new A(){
            public int add(int i , int j){
                return i + j;
            }
        };
        
            
        
        int result = obj.add(5,6);
        System.out.println(result);
        
    }

}

    


```



<br>


in the above code we have created a method with return type. But we can also do the same thing with the lamda expression.

```java


@FunctionalInterface
interface A {
    int add(int i , int j);
}


public class Demo2 {
    public static void main(String[] args) {

        A obj = (int i , int j) ->{
                return i + j;
            };
        
        
            
        
        int result = obj.add(5,6);
        System.out.println(result);
        
    }

}

    
```


You also don't need to write the return keyword if you are using the lamda expression.

```java



@FunctionalInterface
interface A {
    int add(int i , int j);
}


public class Demo2 {
    public static void main(String[] args) {

        A obj = (int i , int j) ->  i + j;
            
        
        
            
        
        int result = obj.add(5,6);
        System.out.println(result);
        
    }

}

    
```

