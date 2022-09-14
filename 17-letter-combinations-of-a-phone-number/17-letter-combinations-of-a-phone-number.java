class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(2, "abc");
        mp.put(3, "def");
        mp.put(4, "ghi");
        mp.put(5, "jkl");
        mp.put(6, "mno");
        mp.put(7, "pqrs");
        mp.put(8, "tuv");
        mp.put(9, "wxyz");
        StringBuilder s = new StringBuilder();
        dfs(digits, ans, mp, s, 0);
        return ans;
    }

    void dfs(String digits, List<String> ans, HashMap<Integer,String> mp, StringBuilder s, int start) {
        if (start == digits.length()) {
            ans.add(s.toString());
        } else {
            String temp = mp.get(digits.charAt(start) - '0');
            for (int i = 0; i < temp.length(); i++) {
                s.append(temp.charAt(i));
                dfs(digits, ans, mp, s, start + 1);
                s.deleteCharAt(s.length() - 1);
            }
        }
    }
}
