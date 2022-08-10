//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1?page=1&difficulty[]=1&category[]=Arrays&sortBy=submissions

class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        int i=0;
        int j=n-2;
        // boolean maxFlag=true;
        boolean minFlag=false;
        long res[]=new long[n];
        int re=1;
        res[0]=arr[n-1];
        while(i<=j){
            if(!minFlag){
                minFlag=true;
                res[re++]=arr[i++];
            }else{
                res[re++]=arr[j--];
                minFlag=false;
            }
            
        }
        
        for(int po=0;po<n;po++){
            arr[po]=res[po];
        }
        
    }
    
