class Solution {

    public int maxIceCream(int[] costs, int coins) {
        int[] temp = costs;
        Arrays.sort(temp);
        int cnt = 0;
        while (cnt < temp.length && temp[cnt] <= coins) {
            coins = coins - temp[cnt];

            cnt++;
        }
        return cnt;
    }
}
