//https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1?page=2&difficulty[]=1&category[]=Arrays&sortBy=submissions
class Solution
{
    long countTriplets(long a[], int n,int sum)
    {
        // long count=0;
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(a[i]+a[j]+a[k]<sum){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // return count;
        
        long count=0;
        Arrays.sort(a);
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            
             while (j < k)
            {
            if(a[i]+a[j]+a[k]>=sum){
                k--;
            }
            else{
                count+=(k-j);
                j++;
            }
        }
        }
        return count;
    }
}
