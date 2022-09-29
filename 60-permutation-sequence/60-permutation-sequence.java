class Solution {
    public String getPermutation(int n, int k) {
        String ans = "";
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
            numbers.add(i);
        }
        
        numbers.add(n);
        k=k-1;
        
        while(true)
        {
            ans = ans + numbers.get(k/fact); //to get group no.
            numbers.remove(k/fact);
            if(numbers.size()==0)
                break;
            k=k%fact; // to get kth in that group
            fact = fact/numbers.size();
        }
        
        return ans;
    }
}