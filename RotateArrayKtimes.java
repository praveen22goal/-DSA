import java.util.*;

public class RotateArrayKtimes {
    public static int[] rotateBruteForce(int[] arr, int k) {
       int n = arr.length;
       while(k > 0){
         int temp = arr[n-1];
         for(int i = n-1; i > 0; i--){
           arr[i] = arr[i-1];
         }
         arr[0] = temp;
         k--;
       }
       return arr;
    }

    public static int[] rotateOptimized(int[] arr, int k) {
       int n = arr.length;
       k = k % n;
       arr = reverse(arr, 0, n-1);
       arr = reverse(arr, 0, k-1);
       arr = reverse(arr, k, n-1);
       return arr;
    }

    public static int[] reverse(int[] arr, int start, int end){
      int i = start;
      int j = end;
      while(i < j){   
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
      return arr;
    }

    public static void main(String[] args) {
      int k = 4;
      int[] arr = {1,2,3,4,5};
      arr = rotateBruteForce(arr, k);
      System.out.println("Rotate Array " + k + " times in Brute Force");
      for (int x : arr) System.out.print(" " + x);
      System.out.println();

      arr = new int[]{1,2,3,4,5};
      arr = rotateOptimized(arr, k);
      System.out.println("Rotate Array " + k + " times in Optimized");
      for (int x : arr) System.out.print(" " + x);
    }
}
