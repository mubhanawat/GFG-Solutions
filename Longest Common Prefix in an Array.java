//https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1?page=2&difficulty[]=0&category[]=Arrays&sortBy=submissions

class Solution{
    String longestCommonPrefix(String arr[], int n){
        String ans="";
        for(int i=0;i<arr[0].length();i++){
            
            char temp=arr[0].charAt(i);
            boolean flag=true;
            for(int j=1;j<n;j++){
                if(i>arr[j].length()-1 || arr[j].charAt(i)!=temp){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans+=Character.toString(temp);
            }
            else{
                break;
            }
        }
        if(ans.length()==0){
            return "-1";
        }
        return ans;
    }
}
