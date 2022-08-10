
//https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?page=2&difficulty[]=1&category[]=Arrays&sortBy=submissions
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        
        Map<Integer,Integer> hmap=new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            
            if(sum==K){
                maxLen=i+1;
            }
            
            if(!hmap.containsKey(sum)){
                hmap.put(sum,i);
            }
            
            if(hmap.containsKey(sum-K)){
                maxLen=Math.max(maxLen,i-hmap.get(sum-K));
            }
        }
        return maxLen;
    }
    
    
}
