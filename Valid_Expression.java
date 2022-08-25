//https://practice.geeksforgeeks.org/problems/valid-expression1025/1?page=2&difficulty[]=1&category[]=Strings&sortBy=submissions

class Solution 
{ 
    boolean valid(String s) 
    { 
         if(s.length()%2!=0){
           return false;
       }
       Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='('||ch=='{'||ch=='['){
               st.push(ch);
           }else if(!st.empty()&&ch==')'&& st.peek()=='('){
               st.pop();
           }else if(!st.empty()&&ch=='}'&& st.peek()=='{'){
               st.pop();
           }else if(!st.empty()&&ch==']'&& st.peek()=='['){
               st.pop();
           }else{
               return false;
           }
       }
       if(st.empty()) 
            return true;
       return false;
    }
} 
