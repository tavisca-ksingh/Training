package others;

public class Subsequence {

    public static void main(String[] args) {

        int [] arr= {9,6,11,8,10,5,4,13,93,14};
           int k= 4;
           int min = Integer.MAX_VALUE;
           for(int i= 0 ; i<arr.length - 1; i++ ) {
               for (int j = i + 1; j < arr.length - k + 1; j++)
               {
                   int sum = arr[i];
                   System.out.print(arr[i] + " ");
                   for (int l = j; l <j+k-1; l++) {
                       System.out.print(arr[l] + " ");
                       sum+= arr[l];
                   }
                   if(sum<min){
                       System.out.println(sum);
                       min=sum;
                   }
                   System.out.println();
               }
           }
        System.out.println(min);
    }
}
