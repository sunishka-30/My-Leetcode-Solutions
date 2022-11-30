class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
        {
            l.add(entry.getValue());
        }
        Set<Integer> s = new HashSet<>();
        for(Integer it:l)
        {
            s.add(it);
        }
        return s.size()==l.size();
    }
}