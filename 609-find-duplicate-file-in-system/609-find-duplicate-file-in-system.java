class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> mp = new HashMap<>(); // content , filepath including directory path
        for(String path : paths)
        {
            String[] dir = path.split(" ");
            String rootPath = dir[0];
            
            for(int i=1;i<dir.length;i++)
            {
                String content = dir[i].substring(dir[i].indexOf("("),dir[i].indexOf(")"));
                if(!mp.containsKey(content))
                {
                    mp.put(content,new ArrayList<>());
                }
                
                mp.get(content).add(rootPath + "/" + dir[i].substring(0,dir[i].indexOf("(")));
            }
        }
            
            List<List<String>> ans = new ArrayList<>();
            for(Map.Entry<String,List<String>> entry : mp.entrySet())
            {
                if(entry.getValue().size()>1)
                {
                    ans.add(entry.getValue());
                }
            }
           
            return ans;
        
        
    }
}