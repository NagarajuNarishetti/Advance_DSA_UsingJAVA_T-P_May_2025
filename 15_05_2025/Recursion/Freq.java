import java.util.*;
public class Freq {
    static Map<Integer,Integer> map= new HashMap<>();
    public static int Fre(int [] arr,int k,int i,int c){
        if(i==arr.length){
            return c;
        }
        if(arr[i]==k){
            return Fre(arr,k, i+1,c+1);
        }
         return Fre(arr, k, i+1, c);
    }
    public static int withFreqFirst(int [] arr,int fre,int i){
        if(i==arr.length){
            return -1;
        }
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        if(map.get(arr[i])==fre ){
            return arr[i];
        }
       return withFreqFirst(arr, fre, i+1);
    }
   // Step 1: Recursively build the frequency map
    public static void buildFreqMap(int[] arr, int i) {
        if (i == arr.length) return;
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        buildFreqMap(arr, i + 1);
    }

    // Step 2: Recursively find a key whose value in the map is equal to targetVal
    public static int getKeyWithValue(List<Integer> keys, int index, int targetVal) {
        if (index == keys.size()) return -1;
        int key = keys.get(index);
        if (map.get(key) == targetVal) {
            return key;
        }
        return getKeyWithValue(keys, index + 1, targetVal);
    }

    public static int withFreq(int[] arr, int fre) {
        map.clear();
        buildFreqMap(arr, 0); // recursively build frequency map
        List<Integer> keys = new ArrayList<>(map.keySet());
        return getKeyWithValue(keys, 0, fre); // recursively search
    }
    public static void main(String[] args) throws Exception {
        int [] arr= {2,4,6,3,2,6,1,2,3,6,6,5};
        int k=6;
        System.out.println(Fre(arr,k,0,0));
        int fre=2;
        System.out.println(withFreqFirst(arr,fre,0));
        System.out.println(withFreq(arr,fre));
        
    }
}
