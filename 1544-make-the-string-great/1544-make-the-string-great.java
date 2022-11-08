class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(!st.isEmpty() && Math.abs(st.lastElement()-c)==32)
                st.pop();
            else
                st.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c: st)
        {
            sb.append(c);
        }
        
        return sb.toString();
    }
}