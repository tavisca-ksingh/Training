package others;

public class Findpeak2D {


    public static void main(String[] args) {

        int arr[][]= {
                {8,5,9},
                {6,7,1},
                {3,4,5}};

     int peak=   findpeak(arr);
        System.out.println(peak);
    }

    public static int findpeak(int [][] arr){
        int row = arr[0].length;
        int col = arr.length;

        if(arr ==null){
            return 0;
        }

        for (int i = 0; i <row-1 ; i++) {
            for (int j = 0; j <col-1 ; j++){
                if((j==0 || arr[i][j] > arr[i][j-1]) &&  (i==0 && arr[i][j] > arr[i-1][j])
                && (j==col-1 ||arr[i][j] > arr[i][j+1])  && (i==row-1 && arr[i][j] > arr[i+1][j] )){
                    return arr[i][j];
                }
            }
        }
        return  0;
    }

}
