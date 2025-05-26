import java.util.*;
public class LengthOfLongestNonReapetingWhichHas {
    public static void main(String[] args) {
        // String str= "abcedacefaebghd";
        String str="abcdefghiabcdefghijklabefghiklmnop";
        // String str="abcdecfdgce";
        char n='d';
        char m='c';
        int ml=0,l=0;
        String ans="";
        int a=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<str.length();r++){
            char ch=str.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=l){
                l=map.get(ch)+1;
            }
            /*
            if(map.containsKey('d')&& map.containsKey('c') && map.get('d')>=l && map.get('c')>=l){
            // int di=map.get('d'),ci=map.get('c');
            // if(di>=l && ci>=l)
                if(ml<r-l+1){
                    ml=r-l+1;
                    ans=str.substring(l,r+1);
                    a=l;
                }
            } */
            if(ml<r-l+1){
                if(map.containsKey('d')&& map.containsKey('c') && map.get('d')>=l && map.get('c')>=l){
                    ml=r-l+1;
                    ans=str.substring(l,r+1);
                    a=l;
                }
            }
            map.put(ch,r);
        }
        System.out.println(ml);
        System.out.println(ans);
        System.out.println(str.substring(a,a+ml)); // With out updating my ans alwasy wihtout extra space to store string
    }
}