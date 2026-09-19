import java.util.*;

public class CountRange {
    public static int countRange(int a,int b){
       return (b-a)+1;
    }
    public static void main(String[] args) {      
      System.out.println("Range "+countRange(2,6)); //1,2,3,4,5,6,7,8,9 Range(2,3,4,5,6)
    }
}
