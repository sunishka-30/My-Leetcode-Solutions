class Solution {
    public String reverseVowels(String s) {
        int k=0;
        int j=s.length()-1;
        char[]ar = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ar[i]=s.charAt(i);
        }
        
        while(k<j)
        {
            while(k<s.length()&&!isVowel(ar[k]))
                k++;
             while(j>=0&&!isVowel(ar[j]))
                j--;
            
            if(k<j)
            {
                swap(ar,k++,j--);
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
            sb.append(ar[i]);
        return sb.toString();
    }
     boolean isVowel(char c) {
         
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
    
    void swap(char[]ar, int i, int j)
    {
        char temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
        
    }
}