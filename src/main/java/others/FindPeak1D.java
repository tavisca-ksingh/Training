package others;

public class FindPeak1D {
    public static void main(String[] args) {
        int[] arr = {5,7,9,4,2};
        int peak = findPeak(arr);
        System.out.println(peak);
    }

    public static Integer findPeak(int[] array ){

        if(array == null ||array.length == 0 ){
            return null;
        }

        int n = array.length;
        int start = 0;
        int end = n-1;

        while (start<=end){
            int mid = (start + end)/2;

            if((mid == 0 || array[mid-1] <= array[mid])
              && ( mid==n-1 || array[mid+1]<=array[mid])){
                return  array[mid];
            }
            else if(mid>0 && array[mid-1] >array[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }

        }
return null;
    }
}
