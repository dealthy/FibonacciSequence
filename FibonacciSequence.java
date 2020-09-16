public class FibonacciSequence {
    public static int fibonacci(int n)  {
        if(n == 0){
            return 0;
        }
        else if(n == 1)
          return 1;
       else
          return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main (String args[]) {
        System.out.println(fibonacci(25));
        //the first 25 numbers fibonacci sequence
    }
}
//stackoverflow: https://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence