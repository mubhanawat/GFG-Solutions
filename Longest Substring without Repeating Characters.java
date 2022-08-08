class Solution{
    int longestUniqueSubsttr(String S){
        Map<Character,Integer> hmap=new LinkedHashMap<>();
        
        char arr[]=S.toCharArray();
        int max=0;
        for(int i=0;i<arr.length;i++){
            
            if(!hmap.containsKey(arr[i])){
                hmap.put(arr[i],i);
            }
            else{
                i=hmap.get(arr[i]);
                hmap.clear();
            }
            max=Math.max(max,hmap.size());
        }
        return max;
    }
}
