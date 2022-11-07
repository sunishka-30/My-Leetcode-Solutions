class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int[] ar = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ar[i]=s.charAt(i)-'0';
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==6)
            {
                ar[i]=9;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            sb.append(ar[i]);
        }
        
        String tmp = sb.toString();
        return Integer.parseInt(tmp);
    }
}