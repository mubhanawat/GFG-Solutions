//https://practice.geeksforgeeks.org/problems/smaller-on-left20360700/1?page=2&difficulty[]=1&status[]=unsolved&category[]=Arrays&sortBy=submissions


public static int[] Smallestonleft (int arr[], int n) {
       int res[]=new int[n];
       int i=0;
       TreeSet<Integer> hset=new TreeSet<>();
       for(Integer it:arr){
           
           Integer low =hset.lower(it);
           
           if(low==null){
               res[i++]=-1;
           }
           else{
               res[i++]=low;
           }
           hset.add(it);
       }
       return res;
       
    }
    
