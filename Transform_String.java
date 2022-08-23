//https://practice.geeksforgeeks.org/problems/transform-string5648/1?page=2&difficulty[]=1&category[]=Strings&sortBy=submissions


class Solution
{
    int transform (String A, String B)
    {
        if( A.length()!=B.length()){
            return -1;
        }
        char a[]=A.toCharArray();
        char b[]=B.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return -1;
            }
        }
        
        int i=A.length()-1;
        int j=i;
        int count=0;
        
        while(i>=0){
            if(A.charAt(i)!=B.charAt(j)){
                count++;
            }
            else{
                j--;
            }
            i--;
        }
        return count;
    }
}
