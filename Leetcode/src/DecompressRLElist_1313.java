import java.util.Arrays;

public class DecompressRLElist_1313 {
    public int[] decompressRLElist(int[] nums) {
        if(nums.length %2 !=0){
            return null;
        }
        int[] arr= {};
        for(int i = 0; i < nums.length; i+=2){
            int[] decomPair=decompressPair(nums,i);
            arr = appendIntArray(arr,decomPair);
        }

        return arr;
    }
    private int[] decompressPair(int[] arr, int index){
        if(index >= arr.length) {return null;}
        int freq = arr[index];
        int val = arr[index +1];
        int[] decomArr = new int[freq];
        Arrays.fill(decomArr, val);

        return decomArr;
    }
    private int[] appendIntArray(int[] a, int[] b){
        int[] temp = new int[a.length + b.length];
        for (int i = 0; i < a.length; ++i){
            temp[i]=a[i];
        }

        for( int i = 0; i < b.length; ++i){
            temp[i+a.length]=b[i];
        }
        return temp;
    }
    public void printIntArray(int[] a){
        for (int i : a ) {
            System.out.print(i);
        }
        System.out.println();
    }
}
