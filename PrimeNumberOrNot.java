import java.util.*;

public class PrimeNumberOrNot {
    public static boolean isPrimeBrutforce(int n){
       if(n<=1){
          return false;
       }
       for(int i=2;i<n;i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
    }
    public static boolean isPrimeOptimized(int n){
       if(n<=1){
          return false;
       }
       if(n<=3){
           return true;
       }
       for(int i=2;i*i<=n;i++){
           if(n%i==0){
               return false;
           }
       }
       return true;      
    }
    public static void main(String[] args) {      
      System.out.println("is Prime Number "+isPrimeBrutforce(4));
      System.out.println("is Prime Number "+isPrimeOptimized(4));
    }
}
