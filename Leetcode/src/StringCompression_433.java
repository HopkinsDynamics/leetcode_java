public class StringCompression_433 {

/*Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.


Follow up:
Could you solve it using only O(1) extra space?*/

    public int compress(char[] chars) {


    }
    private String compressSegment(char c, int n){
        if(n==1){
            return ""+c;
        }else {
            return ""+c+n;
        }
    }

}
