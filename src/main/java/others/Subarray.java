package others;

public class Subarray {

    private int [] underlying;
    private int start;
    private int size;

    private static Subarray fromArray(int [] arr){
        Subarray s=new Subarray();
        s.underlying = arr;
        s.start = 0;
        s.size= arr.length;
        return s;
    }

    private Subarray subarray(int i,int j){
        if(i>j) throw new IllegalArgumentException();
        if(j>this.size) throw  new IndexOutOfBoundsException();
        Subarray s = new Subarray();
        s.underlying = this.underlying;

        s.start = start + i;
        s.size = j - i ;
        return s;
    }

    private int getSize(){
        return size;
    }

    private int getFirst(){
        return underlying[start];
    }

    private int getLast(){
        return underlying[start+size-1];
    }

    private double getMedian(){
        if(size%2 == 0){
        return (underlying[start+size/2 - 1] + underlying[start + size/2])/2.;
        }
        return underlying[start + size/2];
    }

    private static double median(Subarray arr1, Subarray arr2){
        if(arr1.getSize() == 1){
            return (arr1.getFirst() + arr2.getFirst()) /2.;
        }
        if(arr1.getSize() == 2){
            return (Math.max(arr1.getFirst(), arr2.getFirst()) +
            Math.min(arr1.getLast(), arr2.getLast()))/2.;
        }

        double median1 = arr1.getMedian();
        double median2 = arr2.getMedian();

        if(median1 == median2){
            return median1;
        }
        if(median1>median2){
            return median(arr1.subarray(0, arr1.getSize() / 2 + 1),
                    arr2.subarray((arr2.getSize() - 1) / 2, arr2.getSize()));
        }
        // Do the opposite of median1 > median2
        return median(arr1.subarray((arr1.getSize() - 1) / 2, arr1.getSize()),
                arr2.subarray(0, arr2.getSize() / 2 + 1));

    }

    public static void main(String[] args) {

    }

}
