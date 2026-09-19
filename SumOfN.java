import java.util.*;

public class SumOfN {
    public static int sumBruteForceCalculation(int n){
       int sum=0;
       for(int i=1;i<=n;i++){
         sum+=i;
       }
       return sum;
    }

    public static int sumOptimized(int n){
       return ((n+1)*n)/2;
    }
    public static void main(String[] args) {      
      System.out.println("Sum "+sumBruteForceCalculation(101)); 
      System.out.println("Sum "+sumOptimized(101)); 
    }
}
