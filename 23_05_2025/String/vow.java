import java.util.*;
// keep vowel index at same and reverse concosents
public class vow {
    public static void main(String[] args) {
    HashSet<Character> set= new HashSet<>(Arrays.asList('a','e','i','0','u'));
    String str="hippopotamus";
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<str.length();i++){
        if(set.contains(str.charAt(i))){
                sb.append(str.charAt(i));
        }else{
            if(!set.contains(str.charAt(str.length()-1-i)))
                sb.append(str.charAt((str.length()-1-i)));
        }
    }

    System.out.println(str);
    System.out.println(sb);
   }
}
