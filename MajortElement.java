class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        int n = arr.length;
        
        for(int i = 0;i<n;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }
        for(int key:freq.keySet()){
            if(freq.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}