public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
//        String s = "love";
//        String t = "evol";
//        ValidAnagram242 v242= new ValidAnagram242();
//
//        if(v242.isAnagram3(s, t)){
//            println("True: "+s+" is an anagram of "+ t);
//        }else {
//            println("False: "+s+" is not an anagram of "+ t);
//        }

        DecompressRLElist_1313 decompressList = new DecompressRLElist_1313();
        int[] a = {1,2,3,4};
       decompressList.printIntArray(decompressList.decompressRLElist(a));
       StringCompression_433 sc433 = new StringCompression_433();
       char[] chars433 = {'a','a','b','b','c','c','c'};
       print(sc433.compress(chars433)+"");

    }
    static void print(String str){
        System.out.print(str);
    }
    static void println(String str){
        System.out.println(str);
    }



}
