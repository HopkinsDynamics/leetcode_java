import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] sChar=s.toCharArray();
        char[] tChar = t.toCharArray();
        for( int i = 0; i < sChar.length; ++i){
            boolean found = false;
            for (int j = 0; j < tChar.length; ++j){
                if( sChar[i]==tChar[j]){
                    found=true;
                    tChar[j]=0;
                    break;
                }
            }
            if (!found){
                return false;
            }

        }
        return true;

    }
    boolean isAnagram2(String s,String t){//best so far
        if(s.length()!=t.length()){
            return false;
        }
        char[] sC=s.toCharArray();
        char[] tC = t.toCharArray();
        Arrays.sort(sC);
        Arrays.sort(tC);
        for (int i = 0; i < sC.length; ++i){
            if(sC[i]!=tC[i]){
                return false;
            }
        }
        return true;
    }
    boolean isAnagram3(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }


        HashMap<Character,Integer> dict1 = new HashMap<>();

        for (int i = 0; i < s.length();++i ) {
            char c = s.charAt(i);
            if(dict1.containsKey(c)){
                int val =dict1.get(c);
                dict1.replace(c,val,val+1);
            }else {
                dict1.put(c,1);
            }
        }
        for (int i = 0; i < t.length();++i ) {
            char c = t.charAt(i);
            if(dict1.containsKey(c)){
                int val =dict1.get(c);
                dict1.replace(c,val,val-1);
            }else {
                return false;
            }
        }

        for (Map.Entry<Character,Integer> entry :dict1.entrySet()
             ) {
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
