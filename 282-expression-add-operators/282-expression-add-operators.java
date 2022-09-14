class Solution {
     
    public List<String> addOperators(String num, int target) {
       List<String> ans = new ArrayList<>();
        getPath(ans,0,"",0,0,num,target);
        return ans;
    }
    
    void getPath(List<String> ans,int i, String path, long res, long prev, String num, int target)
    {
        if(i==num.length())
        {
            if(res==target)
            { ans.add(path);
            return;}
        }
            
            for(int j=i;j<num.length();j++)
            {
                if(j>i && num.charAt(i)=='0')
                    break;
                long currNum = Long.parseLong(num.substring(i,j+1));
                if(i==0)
                {
                    getPath(ans,j+1,path+currNum, currNum, currNum, num, target);
                }
                else{
                    getPath(ans,j+1,path + "+" + currNum, res+currNum, currNum, num, target);
                    getPath(ans,j+1,path + "-" + currNum, res-currNum, -currNum, num, target);
                    getPath(ans,j+1,path + "*" + currNum, res-prev+prev*currNum, prev*currNum, num, target);
                    
                }
            }
            
            
        }
    
}