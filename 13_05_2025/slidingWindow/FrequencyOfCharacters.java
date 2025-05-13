public class FrequencyOfCharacters {
    public static void main(String[] args) throws Exception {
        StringBuilder sb= new StringBuilder("aaabbaaaacccddeff");
       StringBuilder ans=new StringBuilder("");
        int count=1;
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(i-1)){
                count++;
            }
            else{
                ans.append(sb.charAt(i-1));
                ans.append(count);
                count=1;
            } 
        }
        ans.append(sb.charAt(sb.length()-1));
        ans.append(count);
        System.out.println(ans.toString());
        
    }
}
