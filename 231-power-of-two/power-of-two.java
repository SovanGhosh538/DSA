class Solution {
    public boolean isPowerOfTwo(int n) {
        int rem=0;
        if(n==0)
            return false;
        while(n!=1){
            rem=n%2;
            if(rem!=0)
                break;
            n=n/2;
        }
        if(rem==0)
            return true;
        else
            return false;
    }
}