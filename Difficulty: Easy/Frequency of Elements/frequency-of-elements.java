import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
         HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int val = arr[i];
            if(hm.containsKey(val)) {
            int curCount = hm.get(val);
            hm.put(val, curCount + 1);
            }else{
            hm.put(val, 1);
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int key : hm.keySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(key);
            pair.add(hm.get(key));
            result.add(pair);
        }
        return result;
    }
}