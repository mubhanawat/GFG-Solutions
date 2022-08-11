
//https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1?page=2&difficulty[]=1&category[]=Arrays&sortBy=submissions
class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        
       ArrayList<Integer> result= new ArrayList<Integer>();
       
       for(int i=0;i<K;i++){
           for(int j=0;j<K;j++){
               result.add(arr[i][j]);
           }
       }
       Collections.sort(result);
       return result;
    }
}
