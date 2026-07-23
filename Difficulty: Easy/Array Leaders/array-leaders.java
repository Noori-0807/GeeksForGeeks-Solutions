class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        // code here
        int n=arr.length;
        int max = 0; 
       for(int i=n-1;i>=0;i--){
           int temp=arr[i];
          
           if (temp >= max) {
                result.add(temp);
                max = temp;
           } 
       } 
       Collections.reverse(result);
       return result;
    
}
}
