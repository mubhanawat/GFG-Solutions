//https://practice.geeksforgeeks.org/problems/check-for-subsequence4930/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Strings&sortBy=submissions


class Solution{
    boolean isSubSequence(String A, String B){
        int i=0;
        int j=0;
        while(j<B.length() && i<A.length()){
            if(A.charAt(i)==B.charAt(j)){
                i++;
                if(i==A.length()){
                    return true;
                }
            }
            j++;
        }
      
        return false;
    }
}
