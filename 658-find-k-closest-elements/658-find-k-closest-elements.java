class Pair{
    int key;
    int value;
    
    Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> l = new ArrayList<>();
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair a , Pair b)
            {
                if(b.key-a.key==0)
                    return b.value-a.value;
                return b.key-a.key;
            }
        });
        
        for(int i=0;i<arr.length;i++)
        {
            pq.add(new Pair(Math.abs(arr[i]-x),arr[i]));
            if(pq.size()>k)
                pq.poll();
        }
        
        while(!pq.isEmpty())
        {
            Pair pr = pq.poll();
            l.add(pr.value);
        }
        Collections.sort(l);
        return l;
    }
}