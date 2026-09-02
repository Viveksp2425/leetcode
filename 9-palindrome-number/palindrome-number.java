class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int rev = 0;
        if(x<0){
            return false;
        }
        while(x>0){
            int value = x%10;
            rev = rev*10+value;
            x=x/10;
        }
        return ori == rev;
    }
}