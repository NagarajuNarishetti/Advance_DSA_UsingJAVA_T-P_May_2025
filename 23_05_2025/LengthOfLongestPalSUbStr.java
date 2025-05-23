import java.util.*;
public class LengthOfLongestPalSUbStr {
    public static void main(String[] args) {
       String str="ababba";
       String ans="";
       int l=0,r=0,ml=0,count=0;
       for(int i=0;i<str.length();i++){
        //odd
        l=i;r=i;
        while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
            // ml=Math.max(ml,r-l+1);
            if((r-l+1)>ml){
                ml=r-1+1;
                ans=str.substring(l,r+1);
            }
            l--;
            r++;
            count++;
        }
        //Even
        l=i;r=i+1;
        while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
            // ml=Math.max(ml,r-l+1);
            if((r-l+1)>ml){
                ml=r-1+1;
                ans=str.substring(l,r+1);
            }
            l--;
            r++;
            count++;
        }

       } 
       System.out.println(ml);
       System.out.println(ans);
       System.out.println(count); 
    }
}