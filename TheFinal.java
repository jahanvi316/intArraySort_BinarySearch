import  java.util.Arrays;
public class TheFinal{
   public static void main(String[] args){
      int [] arr = {2, 1, 4, 3, 7, 0};
      System.out.println(Arrays.toString(arr));
      integerSort(arr);
      System.out.println(Arrays.toString(arr));
      System.out.println(binarySearch(3, arr));
      System.out.println(binarySearch(17, arr));
   }
   public static void integerSort(int[] in){
      for(int i = 0; i < in.length - 1; i++){
         int min =i;
         for (int j = i+1; j < in.length; j++){
            if ( in[j] < in[min]){
               min = j; } 
         }
         swap(in, i, min);
      }
   }   
   
   public static void swap(int[] in, int i, int j){
      if(i != j){
         int temp = in[i];
         in[i] = in[j];
         in[j] = temp;
      }
   }
   
   public static int binarySearch(int target, int[] a){
      int min = 0;
      int max = a.length - 1;
      while (min<=max){
         int mid = (min+max)/2;
         if(a[mid]<target){
            min = mid + 1; }
         else{ 
            if(a[mid] > target){
               max = mid - 1; }
            else { 
               return mid; } 
         }
      }
      return -(min+1);
   }
}
