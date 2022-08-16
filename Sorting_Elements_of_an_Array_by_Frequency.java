
//https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1?page=2&difficulty[]=1&status[]=unsolved&category[]=Arrays&sortBy=submissions
class Solution
{
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        Map<Integer,Integer> hmap=new TreeMap<>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            hmap.put(arr[i],hmap.get(arr[i])==null?1:hmap.get(arr[i])+1);
        }
       
       // List<Entry<Integer,Integer>> list=new Arraylist<>(hmap.entrySet());
         List<Entry<Integer,Integer>> list = new ArrayList<>(hmap.entrySet());
        Collections.sort(list,new secondLevelSort());
    
        for(int i=0;i<list.size();i++){
            Map.Entry<Integer,Integer> te=list.get(i);
            
            for(int j=0;j<te.getValue();j++){
               result.add(te.getKey()); 
            }
        }
        return result;
    }
    
    
}

class secondLevelSort implements Comparator<Entry<Integer,Integer>>{
    
    public int compare(Entry<Integer,Integer> e1,Entry<Integer,Integer> e2){
        return e2.getValue()-e1.getValue();
    }
}
