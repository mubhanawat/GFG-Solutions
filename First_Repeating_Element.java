//https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        
        Map<Integer,Integer> hmap=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(arr[i])){
                min=Math.min(min,hmap.get(arr[i]));
            }
            hmap.put(arr[i],i);
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min+1;
    }
}
