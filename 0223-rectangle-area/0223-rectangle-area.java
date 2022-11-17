class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ay2-ay1) * (ax2-ax1);
        int areaB = (by2-by1) * (bx2-bx1);
        
        int left = Math.max(ax1,bx1);
        int right = Math.min(ax2,bx2);
        int xOver = right - left;
        
        int top = Math.min(ay2,by2);
        int bottom = Math.max(ay1,by1);
        int yOver = top - bottom;
        
        int areaOver = 0;
        if(xOver>0 && yOver>0)
            areaOver = xOver * yOver;
        
        return areaA+areaB-areaOver;
    }
}