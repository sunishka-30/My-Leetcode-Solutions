class Pair{
    String first;
    int second;
    public Pair(String first, int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> word) {
        Queue<Pair> q = new LinkedList<>();
        Set<String> st = new HashSet<>();
        int len = word.size();
        for(int i=0;i<len;i++)
        {
            st.add(word.get(i));
        }
        q.add(new Pair(beginWord,1));
        st.remove(beginWord);
        while(!q.isEmpty())
        {
            String curWord = q.peek().first;
            int level = q.peek().second;
            q.remove();
            if(curWord.equals(endWord))
                return level;
            
            for(int i=0;i<curWord.length();i++)
            {
                for(char c='a';c<='z';c++)
                {
                    char[]replace=curWord.toCharArray();
                    replace[i]=c;
                    String repStr = new String(replace);
                    if(st.contains(repStr)==true)
                    {
                        st.remove(repStr);
                        q.add(new Pair(repStr,level+1));
                    }
                }
            }
        }
        return 0;
    }
}