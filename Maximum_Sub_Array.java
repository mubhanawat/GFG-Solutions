//https://practice.geeksforgeeks.org/problems/maximum-sub-array5443/1?page=2&difficulty[]=1&status[]=unsolved&category[]=Arrays&sortBy=submissions

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        
         ArrayList<Integer> result=new  ArrayList<Integer>();
        int i=0; 
        int j=0;
        long max_so_far=0;
        long sum=0;
        int start=0;
        int end=0;
        while(j<n){
            sum+=a[j];
            if(a[j++]<0){
                sum=0;
                i=j;
            }
            
            if(sum>=max_so_far){
                max_so_far=sum;
                start=i;
                end=j;
            }
            
        }
        
        for(int k=start;k<end;k++){
            result.add(a[k]);
        }
        if(result.size()==0){
            result.add(-1);
        }
        
        return result;
    }
}
