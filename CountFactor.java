import java.util.*;

public class Main {
    public static int countFactorBrutforce(int n){
       int count=0;
       for(int i=1;i<=n;i++){
           if(n%i==0){
            count++;
           }
       }
       return count;
    }
    public static int countFactorOptimized(int n){
      int count=0;
      for(int i=1;(long)i*i<=n;i++){  //   n/i<=n;
          if(n%i==0){
            if(i==n/i){
              count++;
            }
            else{
            count+=2;
            }
          }
      }
      return count;        
    }
    public static void main(String[] args) {      
      System.out.println("Factor count "+countFactorBrutforce(24));
      System.out.println("Factor count "+countFactorOptimized(100));
    }
}
