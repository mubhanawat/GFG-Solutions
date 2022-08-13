//https://practice.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string1001/1?page=2&difficulty[]=1&category[]=Strings&sortBy=submissions

class Solution
{
   
    String reverseWords(String S)
    {
       Stack<Character> st=new Stack<>();
       
       StringBuilder sb =new StringBuilder();
       
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)=='.'){
               while(!st.empty()){
                   sb.append(st.pop());
               }
               sb.append('.');
           }
           else{
               st.push(S.charAt(i));
           }
       }
       
       while(!st.empty()){
           sb.append(st.pop());
       }
       return sb.toString();
    }
}

