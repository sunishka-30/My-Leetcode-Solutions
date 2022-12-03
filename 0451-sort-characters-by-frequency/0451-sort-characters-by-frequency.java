class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());
        while(!pq.isEmpty())
        {
            Map.Entry e = pq.poll();
            for(int i=0;i<(int)e.getValue();i++)
            {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}