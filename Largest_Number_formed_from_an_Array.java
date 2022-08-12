//https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1?page=2&difficulty[]=1&category[]=Arrays&sortBy=submissions

class Solution {
    String printLargest(String[] arr) {
       Arrays.sort(arr,new Comparator<String>(){
           
           @Override
           public int compare(String a,String b){
               String xy=a+b;
               String yx=b+a;
               return yx.compareTo(xy);
           }
       });
       
       String result="";
       for(String i:arr){
           result+=i;
       }
       return result;
    }
}
