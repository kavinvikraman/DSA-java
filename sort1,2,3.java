class Solution {
    public void sort012(int[] arr) {
        // code here
        int [] nums = new int[3];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                nums[0]++;
                
            }
        }
            for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == 1){
                nums[1]++;
            }
            }
            for(int i = 0 ;i <arr.length;i++){
            if(arr[i] == 2){
                nums[2]++;
            }
            }
            int index = 0;
            
        for (int i = 0; i < nums[0]; i++) arr[index++] = 0;
        for (int i = 0; i < nums[1]; i++) arr[index++] = 1;
        for (int i = 0; i < nums[2]; i++) arr[index++] = 2;
        }
    }
