//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1?page=2&category[]=Strings&sortBy=submissions

class Solution {
    public int longestkSubstr(String s, int k) {

        Map<Character,Integer> hmap=new HashMap<>();
        
        int i=0,j=0;
        int max=-1;
        while(j<s.length()){
            hmap.put(s.charAt(j),hmap.get(s.charAt(j))==null?1:hmap.get(s.charAt(j))+1);
           
            
            if(hmap.size()<k){
                j++;
            }
         
            if(hmap.size()==k){
                 max=Math.max(max,j-i+1); 
                  j++;
            }
            else if(hmap.size()>k){
                while(hmap.size()>k){
                    hmap.put(s.charAt(i),hmap.get(s.charAt(i))-1);
                    
                    if(hmap.get(s.charAt(i))==0){
                        hmap.remove(s.charAt(i));
                    }
                    i++;
                    
                    
            }
             j++;
            }
        }
        return max;
    }
}
