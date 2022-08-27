//https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1?page=2&difficulty[]=1&category[]=Arrays&sortBy=submissions


class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                count++;
            }
        }
        
        int i=0;
        int j=0;
        int currSum=0;
        int maxFind=Integer.MAX_VALUE;
        while(i<n && j<n){
            
            if(arr[j]>k)
            {
                currSum++;
            }
            j++;
            if(j-i==count){
                
                maxFind=Math.min(maxFind,currSum);
                
                if(arr[i]>k){
                    currSum--;
                }
                i++;
            }
        }
        return maxFind==Integer.MAX_VALUE ? 0: maxFind;
    }
    
    
}
