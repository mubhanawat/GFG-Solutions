//https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1?page=1&difficulty[]=1&category[]=Arrays&curated[]=1&sortBy=submissions

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        Map<Long,Long> hmap=new HashMap<>();
        
        long res=0;
        hmap.put(0l,1l);
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(hmap.containsKey(sum)){
                res+=hmap.get(sum);
                hmap.put(sum,hmap.get(sum)+1);
            }
            else{
                hmap.put(sum,1l);
            }
            
        }
        return res;
    }
}
