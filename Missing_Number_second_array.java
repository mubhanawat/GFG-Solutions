
//https://practice.geeksforgeeks.org/problems/in-first-but-second5423/1?page=3&difficulty[]=1&category[]=Arrays&sortBy=submissions
class Solution
{
    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> result=new ArrayList<Long>();
        HashSet<Long> a1=new HashSet<Long>();
        for(int i=0;i<M;i++){
            a1.add(B[i]);
        }
        
        for(int i=0;i<N;i++){
            if(!a1.contains(A[i])){
                result.add(A[i]);
            }
        }
        return result;
    }
}
