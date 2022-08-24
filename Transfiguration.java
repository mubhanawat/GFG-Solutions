//https://practice.geeksforgeeks.org/problems/b6b3297ccfb1ad5f66a9c2b92979170417adf114/1?page=2&difficulty[]=1&category[]=Strings&sortBy=submissions

class Solution
{
    int transfigure (String A, String B)
    {
    	if(A.length()!=B.length()){
    	    return -1;
    	}
    	
        char a[]=A.toCharArray();
        char b[]=B.toCharArray();
    	Arrays.sort(a);
    	Arrays.sort(b);
    	for(int i=0;i<a.length;i++){
    	    if(a[i]!=b[i])
    	    {
    	        return -1;
    	    }
    	}
    	
    	int count=0;
    	
    	int i=A.length()-1;
    	int j=i;
    	
    	while(i>=0){
    	    
    	    if(A.charAt(i)!=B.charAt(j)){
    	        count++;
    	    }else{
    	        j--;
    	    }
    	    i--;
    	    
    	}
    	return count;
    }
}
