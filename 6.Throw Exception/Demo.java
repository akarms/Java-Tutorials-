
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
