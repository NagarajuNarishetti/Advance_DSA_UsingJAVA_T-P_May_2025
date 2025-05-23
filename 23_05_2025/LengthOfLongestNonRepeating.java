import java.util.*;

public class LengthOfLongestNonRepeating {
    public static void main(String[] args) {
        String str = "abcdaecdb";
        int l = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is already in the map and within the current window
            if (map.containsKey(ch) && map.get(ch) >= l) {
                l = map.get(ch) + 1; // move the left pointer to the next of previous occurrence
            }

            map.put(ch, i); // update character's latest index
            max = Math.max(max, i - l + 1); // calculate window size
        }

        System.out.println(max); // Output: 5
    }
}
