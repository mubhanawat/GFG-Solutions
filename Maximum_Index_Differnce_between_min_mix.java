//https://practice.geeksforgeeks.org/problems/maximum-index-1587115620/1?page=1&difficulty[]=1&category[]=Arrays&sortBy=submissions

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<N;i++){
            
    //         for(int j=i+1;j<N;j++){
    //             if(A[j]>A[i]){
    //                 max=Math.max(max,j-i);
    //             }
    //         }
    //     }
    //   return max; 
    
    int Lmin[]=new int[N];
    int Rmax[]=new int[N];
    
    Lmin[0]=A[0];
    
    for(int i=1;i<N;i++){
        Lmin[i]=Math.min(Lmin[i-1],A[i]);
    }
    
    Rmax[N-1]=A[N-1];
    
    for(int i=N-2;i>=0;i--){
        Rmax[i]=Math.max(Rmax[i+1],A[i]);
    }
    
    int i=0;
    int j=0;
    int count=-1;
    while(j<N && i<N){
        if(Lmin[i]<=Rmax[j]){
            count=Math.max(count,j-i);
            j=j+1;
        }
        else{
            i=i+1;
        }
    }
    return count;
    }
}
