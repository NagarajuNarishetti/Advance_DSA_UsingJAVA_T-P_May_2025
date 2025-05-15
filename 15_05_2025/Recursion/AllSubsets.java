import java.util.*;
public class AllSubsets {
    public static void subsets(int [] arr,int i, ArrayList<Integer> curr){
      if(i==arr.length){
        System.out.println(curr);
        return;
      }
      // Create a new list that includes arr[i]
        ArrayList<Integer> with = new ArrayList<>(curr);
        with.add(arr[i]);
        subsets(arr, i + 1, with);  // Include arr[i]

        // Recurse without including arr[i] (pass original list)
        subsets(arr, i + 1, curr);
    }
    public static int sum(ArrayList<Integer> list){
        int sum=0;
        for(int ele: list){
            sum+=ele;
        }
        return sum;
    }
    public static void subSetsSum(int [] arr,int i, ArrayList<Integer> curr){
      if(i==arr.length){
        System.out.println(sum(curr));
        return;
      }
      // Create a new list that includes arr[i]
        ArrayList<Integer> with = new ArrayList<>(curr);
        with.add(arr[i]);
        subSetsSum(arr, i + 1, with);  // Include arr[i]

        // Recurse without including arr[i] (pass original list)
        subSetsSum(arr, i + 1, curr);
    }
    public static boolean checkTargetSum(int []arr,int i,int t){
        if(t==0){
            return true;
        }
        if(i==arr.length){
            return false;
        }
        return checkTargetSum(arr, i+1, t-arr[i]) || checkTargetSum(arr, i+1, t);

        // boolean took= checkTargetSum(arr, i+1,t-arr[i]);
        // boolean notTook=checkTargetSum(arr, i+1,t);
        // return took || notTook;

    }
    public static void printAllSubsetsWithK(int [] arr,int i,int t,ArrayList<Integer> list){
        if(i==arr.length){
            if(t==0){
                System.out.println(list);
                return;
            }
            ArrayList<Integer> curr= new ArrayList<>();
            curr
        }
    }
    public static void main(String[] args) throws Exception {
        int [] arr={7,2,3,4};
        subsets(arr,0,new ArrayList<>());
        subSetsSum(arr,0,new ArrayList<>());
        int target=5;
        System.out.println(checkTargetSum(arr,0,target));
        printAllSubsetsWithK(arr,0,t,new ArrayList<>());
        
    }
}
