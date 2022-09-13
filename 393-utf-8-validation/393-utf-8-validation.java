class Solution {
    public boolean validUtf8(int[] data) {
        int remBytes=0;
        for(int num:data)
        {
            if(remBytes==0)
            {
                
                if((num>>5)==0b110) //for 2 byte data
                    remBytes=1;
                else if((num>>4)==0b1110) //for 3 byte data
                    remBytes=2;
                else if((num>>3)==0b11110) //for 4 byte data
                    remBytes=3;
                else if(num>>7!=0) //for 1 byte data
                    return false;
            }
            else{
                if((num>>6)==0b10)
                    remBytes--;
                else
                    return false;
            }
        }
        
        if(remBytes==0)
            return true;
        return false;
    }
}