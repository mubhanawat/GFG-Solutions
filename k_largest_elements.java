//https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1?page=2&difficulty[]=1&category[]=Arrays&sortBy=submissions

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        Arrays.sort(arr);
        
        int res[]=new int[k];
        int j=0;
        for(int i=n-1;i>=n-k;i--)
        {
            res[j++]=arr[i];
        }
        return res;
    }
}
