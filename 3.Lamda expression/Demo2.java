
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

    

