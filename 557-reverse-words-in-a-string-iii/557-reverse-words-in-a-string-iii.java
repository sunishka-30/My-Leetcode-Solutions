class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int i=0;
        for(int j=0;j<ch.length;j++)
        {
            if(ch[j]==' ')
            {
                reverse(ch,i,j-1);
                i=j+1;
            }
            
        }
        
        reverse(ch,i,ch.length-1);
        return new String(ch);
        
    }
    
    void reverse(char[]ch, int a, int b )
    {
        while(a<b)
        {
            
        
        char temp = ch[a];
        ch[a]=ch[b];
        ch[b]=temp;
        a++;
        b--;
        }
    }
}