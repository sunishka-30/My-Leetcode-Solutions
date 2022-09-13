/* when n is even, we have a formula : 5^n/2 * 4^n/2; when n is odd, we have a formula : 5^n/2+1 * 4^n/2; this is derived because for even indices (digit should be even), we have 5 choices from which we can select 1, i.e. 0,2,4,6,8 and for odd indices (digit should be prime), we have 4 choices from which we can select 1, 2,3,5,7 */
/*since number can be long, power computation should be done using binary exponentiation which can be performed in O(log n), do not forget to % any type of value being computed by m.*/
class Solution {
    int m = (int) 1e9 + 7;

    public int countGoodNumbers(long n) {
        long first = n % 2 == 0 ? n / 2 : n / 2 + 1;
        long second = n / 2;

        long mul5 = power(5, first) % m;
        long mul4 = power(4, second) % m;

        long ans = 1;
        ans = (ans * mul5) % m;
        ans = (second != 0) ? (ans * mul4) % m : ans;
        return (int) ans % m;
    }

    long power(long x, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                x = (x * x) % m;
                n = n / 2;
            } else {
                res = (res * x) % m;
                n--;
            }
        }
        return res;
    }
}
