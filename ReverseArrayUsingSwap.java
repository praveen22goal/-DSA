import java.util.*;

public class ReverseArrayUsingSwap {
    public static int[] reverse(int[] arr) {
       int i = 0, j = arr.length - 1;
       while (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
      return arr;
    }

    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int[] arr={1,2,3,4,5};
      arr=reverse(arr);
      System.out.println("Reverse Order using Swapping");
      for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
      }
    }
}
