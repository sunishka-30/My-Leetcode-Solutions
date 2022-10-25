class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0;
    int j=0;
    StringBuffer sb1 = new StringBuffer("");
    StringBuffer sb2 = new StringBuffer("");

    while (i<word1.length){
        sb1.append(word1[i]);
        i++;
    }
    while (j<word2.length){
        sb2.append(word2[j]);
        j++;
    }
    return sb1.toString().equalsIgnoreCase(sb2.toString());
        
    }
}