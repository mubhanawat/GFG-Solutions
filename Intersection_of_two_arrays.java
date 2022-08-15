//https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?page=2&difficulty[]=0&category[]=Arrays&sortBy=submissions


class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
       int count=0;
       Set<Integer> hs=new HashSet<>();
       Set<Integer> hs1=new HashSet<>();
       for(int i=0;i<n;i++){
           hs.add(a[i]);
       }
       
       for(int j=0;j<m;j++){
           if(hs.contains(b[j]) && hs1.add(b[j]))
           {
               count++;
           }
       }
       return count;
    }
};
