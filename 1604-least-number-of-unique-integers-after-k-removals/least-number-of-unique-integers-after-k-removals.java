class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else
                map.put(arr[i], map.get(arr[i]) + 1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);
        for(int i = 0; i < freq.size(); i++){
            k -=freq.get(i);
            if(k < 0)
                break;
            freq.set(i, 0);  
        }
        int count = 0;
        for(int i = 0; i < freq.size(); i++)
            if(freq.get(i) != 0)
                count++;
        return count;
    }
}