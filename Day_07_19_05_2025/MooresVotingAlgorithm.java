public class MooresVotingAlgorithm {
    public static void main(String[] args) throws Exception {
        int [] arr={2,1,4,3,2};
        int count=0;
        int res=-1;
        for(int ele:arr){
            if(count==0){
                res=ele;
                count++;
            }
            else if(ele==res){
                count++;
            }
            else{
                count=0;
            }
        }
        System.out.println(res);       
    }
}