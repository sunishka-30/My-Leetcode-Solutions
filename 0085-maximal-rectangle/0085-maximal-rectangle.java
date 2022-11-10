class Pair
{
    int first;
    int second;
    public Pair(int first, int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[][]M = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='0')
                    M[i][j]=0;
                else
                    M[i][j]=1;
            }
        }
        int n=M.length;
        int m=M[0].length;
        int[]hist = new int[m];
        for(int j=0;j<m;j++)
        hist[j]=M[0][j];
        int max = MAH(hist);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(M[i][j]==0)
                hist[j]=0;
                else
                hist[j]+=M[i][j];
            }
            max=Math.max(max,MAH(hist));
        }
        
        return max;
    }
    static int MAH(int[] hist) {
        int n = hist.length;
        int[]left=new int[n];
        int[]right=new int[n];
        int[]rev=new int[n];
        int[]width=new int[n];
        int[]area=new int[n];
        int max=0;
        Stack<Pair>st=new Stack<>();
        NSL(st,left,hist);
        NSR(st,right,hist,rev);
        for(int i=0;i<n;i++)
        width[i]=rev[i]-left[i]-1;
        for(int i=0;i<n;i++)
        {
            area[i]=width[i]*hist[i];
            max=Math.max(max,area[i]);
        }
        return max;
    }
    static void NSL(Stack<Pair>st,int[]left,int[]hist)
    {
        int n = hist.length;
        int pseudoIndex = -1;
        for(int i=0;i<n;i++)
        {
            if(st.size()==0)
            {
                left[i]=pseudoIndex;
            }
            else if(st.size()>0 && st.peek().first<hist[i])
            {
                left[i]=st.peek().second;
            }
            else if(st.size()>0 && st.peek().first>=hist[i])
            {
                while(!st.isEmpty() && st.peek().first>=hist[i])
                st.pop();
                
                if(st.size()==0)
                left[i]=pseudoIndex;
                else
                left[i]=st.peek().second;
                
            }
            st.push(new Pair(hist[i],i));
        }
        
        st.clear();
    }
    
    static void NSR(Stack<Pair>st,int[]right,int[]hist,int[]rev)
    {
        int n = hist.length;
        int pseudoIndex = n;
        for(int i=n-1;i>=0;i--)
        {
            if(st.size()==0)
            {
                right[i]=pseudoIndex;
            }
            else if(st.size()>0 && st.peek().first<hist[i])
            {
                right[i]=st.peek().second;
            }
            else if(st.size()>0 && st.peek().first>=hist[i])
            {
                while(!st.isEmpty() && st.peek().first>=hist[i])
                st.pop();
                
                if(st.size()==0)
                right[i]=pseudoIndex;
                else
                right[i]=st.peek().second;
                
            }
            st.push(new Pair(hist[i],i));
        }
        
        
        int p=0;
        for(int k=0;k<n;k++)
        rev[p++]=right[k];
    }
}