class Solution {
    public int countOdds(int low, int high) {
        if(low%2!=0){
            low = low-1;
        }
        if(high%2!=0){
            high = high+1;
        }
        int zeroTolow = low/2;
        int zeroTohigh = high/2;
        int ans = zeroTohigh - zeroTolow;
        return ans;
    }
}