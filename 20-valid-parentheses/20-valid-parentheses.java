class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '{' || a == '[') {
                st.push(a);
            } 
            else if (st.isEmpty()) return false; 
            else if (a == ')' && st.pop() != '(') return false; 
            else if (a == ']' && st.pop() != '[') return false; 
            else if (a == '}' && st.pop() != '{') return false;
        }

        return st.isEmpty();
    }
}
